package com.app.gestion_stock.serviceImpl;

import com.app.gestion_stock.dto.CommandeRequest;
import com.app.gestion_stock.dto.ProduitQuantite;
import com.app.gestion_stock.entity.*;
import com.app.gestion_stock.repository.ICommandeProduitRepository;
import com.app.gestion_stock.repository.ICommandeRepository;
import com.app.gestion_stock.repository.IProduitRepository;
import com.app.gestion_stock.repository.IUtilisateurRepository;
import com.app.gestion_stock.service.ICommandeService;
import com.app.gestion_stock.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class CommandeServiceImpl implements ICommandeService {

    @Autowired
    private IUtilisateurRepository utilisateurRepository;
    @Autowired
    private IProduitRepository produitRepository;
    @Autowired
    private ICommandeRepository commandeRepository;
    @Autowired
    private ICommandeProduitRepository commandeProduitRepository;

    @Override
    public Commande createOrder(CommandeRequest request) throws Exception {
        Utilisateur utilisateur = utilisateurRepository.findById(request.getUtilisateurId())
                .orElseThrow(() -> new Exception("Utilisateur introuvable"));

        Commande commande = new Commande();
        commande.setDateCommande(LocalDate.now());
        commande.setUtilisateur(utilisateur);
        commande.setTotal(BigDecimal.ZERO);

        Commande savedCommande = commandeRepository.save(commande);
        BigDecimal total = BigDecimal.ZERO;

        // Parcourir les produits a commander
        for (ProduitQuantite produitQuantite : request.getProduits()) {
            Produit produit = produitRepository.findById(produitQuantite.getProduitId())
                    .orElseThrow(() -> new Exception("Produit non trouvé"));

            CommandeProduit commandeProduit = new CommandeProduit();
            CommandeProduitId id = new CommandeProduitId();
            id.setIdCommande(savedCommande.getId());
            id.setIdProduit(produit.getId());

            commandeProduit.setId(id);
            commandeProduit.setCommande(savedCommande);
            commandeProduit.setProduit(produit);
            commandeProduit.setQuantite(produitQuantite.getQuantite());
            commandeProduit.setPrixUnitaire(produit.getPrix());

            //On calcule le total des produits
            total = total.add(produit.getPrix().multiply(BigDecimal.valueOf(produitQuantite.getQuantite())));
            commandeProduitRepository.save(commandeProduit);
        }

        savedCommande.setTotal(total);
        return commandeRepository.save(savedCommande);
    }}