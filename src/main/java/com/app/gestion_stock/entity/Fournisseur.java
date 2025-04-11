package com.app.gestion_stock.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fournisseur")
    @JsonIgnore
    private Long id;

    @Column(unique = true)
    private String nom;
    private String email;
    private String telephone;
    private String adresse;
}
