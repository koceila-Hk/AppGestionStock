package com.app.gestion_stock.controller;

import com.app.gestion_stock.entity.Utilisateur;
import com.app.gestion_stock.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/user")
public class UtilisateurController {

    @Autowired
    private IUtilisateurService utilisateurService;

    @PostMapping
    public ResponseEntity<Utilisateur> addUser(@RequestBody Utilisateur utilisateur) throws Exception {
        return ResponseEntity.ok(utilisateurService.addUser(utilisateur));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUser(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(utilisateurService.getUserByID(id));
    }

    @GetMapping
    public ResponseEntity<List<Utilisateur>> getAllUsers() throws Exception {
        List<Utilisateur> utilisateurs = utilisateurService.getAllUsers();
        return ResponseEntity.ok(utilisateurs);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Utilisateur> updateUser(@RequestBody Utilisateur utilisateur, @PathVariable Long id) throws Exception {
        utilisateurService.updateUser(utilisateur, id);
        return ResponseEntity.ok(utilisateur);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeUser(@PathVariable Long id) throws Exception {
        utilisateurService.removeUser(id);
        return ResponseEntity.ok("Utilisateur supprimé");
    }
}
