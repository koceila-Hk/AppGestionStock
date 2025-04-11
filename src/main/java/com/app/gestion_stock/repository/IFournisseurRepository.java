package com.app.gestion_stock.repository;

import com.app.gestion_stock.entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
