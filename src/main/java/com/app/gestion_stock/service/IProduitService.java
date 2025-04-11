package com.app.gestion_stock.service;

import com.app.gestion_stock.entity.Produit;

import java.util.List;

public interface IProduitService {
    Produit addProduct(Produit produit) throws Exception;
    void updateProduct(Produit produit, Long id) throws Exception;
    void deleteProduct(Long id) throws Exception;

    //Get product
    Produit getProductById(Long id) throws Exception;
    List<Produit> getAllProducts() throws Exception;
}
