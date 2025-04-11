package com.app.gestion_stock.serviceImpl;

import com.app.gestion_stock.entity.Produit;
import com.app.gestion_stock.repository.IProduitRepository;
import com.app.gestion_stock.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    private IProduitRepository produitRepository;

    @Override
    public Produit addProduct(Produit produit) throws Exception {
        return produitRepository.save(produit);
    }

    @Override
    public void updateProduct(Produit produit, Long id) throws Exception {
        Produit produitExist = getProductById(id);

        produitExist.setNom(produit.getNom());
        produitExist.setDescription(produit.getDescription());
        produitExist.setPrix(produit.getPrix());
        produitExist.setStock(produit.getStock());
        produitRepository.save(produitExist);
    }

    @Override
    public void deleteProduct(Long id) throws Exception {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit getProductById(Long id) throws Exception {
        return produitRepository.findById(id).orElseThrow(() -> new Exception("Produit non trouvé"));
    }

    @Override
    public List<Produit> getAllProducts() throws Exception {
        return produitRepository.findAll();
    }
}
