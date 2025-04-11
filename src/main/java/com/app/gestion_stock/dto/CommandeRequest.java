package com.app.gestion_stock.dto;

import lombok.Data;

import java.util.List;

@Data
public class CommandeRequest {
    private Long utilisateurId;
    private List<ProduitQuantite> produits;
}
