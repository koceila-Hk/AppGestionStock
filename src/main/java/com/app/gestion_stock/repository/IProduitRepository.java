package com.app.gestion_stock.repository;

import com.app.gestion_stock.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<Produit, Long> {
    Produit findById(Produit productById);
}
