package com.app.gestion_stock.controller;

import com.app.gestion_stock.entity.Fournisseur;
import com.app.gestion_stock.service.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/fournisseur")
public class FournisseurController {
    @Autowired
    private IFournisseurService fournisseurService;

    @PostMapping
    public ResponseEntity<Fournisseur> addFournisseur(@RequestBody Fournisseur fournisseur) throws Exception {
        fournisseurService.addSupplier(fournisseur);
        return ResponseEntity.ok(fournisseur);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fournisseur> getFournisseur(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(fournisseurService.getSupplierById(id));
    }

    @GetMapping
    public ResponseEntity<List<Fournisseur>> getAllSuppliers() throws Exception {
        List<Fournisseur> fournisseurs = fournisseurService.getAllSuppliers();
        return ResponseEntity.ok(fournisseurs);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fournisseur> updateFournisseur(@RequestBody Fournisseur fournisseur, @PathVariable Long id) throws Exception {
        fournisseurService.updateSupplier(fournisseur, id);
        return ResponseEntity.ok(fournisseur);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSupplier(@PathVariable Long id) throws Exception {
        fournisseurService.deleteSupplier(id);
        return ResponseEntity.ok("Fournisseur supprimé");
    }
}
