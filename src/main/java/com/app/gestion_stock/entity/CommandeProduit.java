package com.app.gestion_stock.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class CommandeProduit {
    @EmbeddedId
    private CommandeProduitId id;
    private int quantite;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_commande")
    @MapsId("idCommande")
    private Commande commande;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("idProduit")
    @JoinColumn(name = "id_produit")
    private Produit produit;
}
