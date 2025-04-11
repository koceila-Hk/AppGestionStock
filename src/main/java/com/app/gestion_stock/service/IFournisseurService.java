package com.app.gestion_stock.service;

import com.app.gestion_stock.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    Fournisseur addSupplier(Fournisseur fournisseur) throws Exception;
    void updateSupplier(Fournisseur fournisseur, Long id) throws Exception;
    void deleteSupplier(Long id) throws Exception;

    //Get fournisseur
    Fournisseur getSupplierById(Long id) throws Exception;
    List<Fournisseur> getAllSuppliers() throws Exception;
}
