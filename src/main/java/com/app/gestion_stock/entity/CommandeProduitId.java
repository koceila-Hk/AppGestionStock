package com.app.gestion_stock.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Embeddable
@EqualsAndHashCode
public class CommandeProduitId implements Serializable {
    private Long idCommande;
    private Long idProduit;
}
