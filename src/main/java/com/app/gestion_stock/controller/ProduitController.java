package com.app.gestion_stock.controller;

import com.app.gestion_stock.entity.Produit;
import com.app.gestion_stock.entity.Utilisateur;
import com.app.gestion_stock.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/produit")
public class ProduitController {

    @Autowired
    private IProduitService produitService;

    @PostMapping
    public ResponseEntity<Produit> addProduct(@RequestBody Produit produit) throws Exception {
        produitService.addProduct(produit);
        return ResponseEntity.ok(produit);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduct(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(produitService.getProductById(id));
    }

    @GetMapping
    public ResponseEntity<List<Produit>> getAllUsers() throws Exception {
        List<Produit> produits = produitService.getAllProducts();
        return ResponseEntity.ok(produits);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> updateProduct(@RequestBody Produit produit, @PathVariable Long id) throws Exception {
        produitService.updateProduct(produit, id);
        return ResponseEntity.ok(produit);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) throws Exception {
        produitService.deleteProduct(id);
        return ResponseEntity.ok("Produit supprimé");
    }
}
