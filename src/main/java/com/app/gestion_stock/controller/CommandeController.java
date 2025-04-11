package com.app.gestion_stock.controller;

import com.app.gestion_stock.dto.CommandeRequest;
import com.app.gestion_stock.entity.Commande;
import com.app.gestion_stock.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/commande")
public class CommandeController {

    @Autowired
    private ICommandeService commandeService;

    @PostMapping
    public ResponseEntity<?> passerCommande(@RequestBody CommandeRequest request) {
        try {
            Commande commande = commandeService.createOrder(request);
            return ResponseEntity.ok(commande);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erreur : " + e.getMessage());
        }
    }
}