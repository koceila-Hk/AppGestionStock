package com.app.gestion_stock.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Entity
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit")
    @JsonIgnore
    private Long id;

    @Column(unique = true)
    private String nom;
    private String description;
    private BigDecimal prix;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "id_fournisseur")
    private Fournisseur fournisseur;
}
