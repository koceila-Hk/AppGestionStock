package com.app.gestion_stock.serviceImpl;

import com.app.gestion_stock.entity.Fournisseur;
import com.app.gestion_stock.repository.IFournisseurRepository;
import com.app.gestion_stock.service.IFournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurServiceImpl implements IFournisseurService {
    @Autowired
    private IFournisseurRepository fournisseurRepository;

    @Override
    public Fournisseur addSupplier(Fournisseur fournisseur) throws Exception {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void updateSupplier(Fournisseur fournisseur, Long id) throws Exception {

    }

    @Override
    public void deleteSupplier(Long id) throws Exception {

    }

    @Override
    public Fournisseur getSupplierById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Fournisseur> getAllSuppliers() throws Exception {
        return List.of();
    }
}
