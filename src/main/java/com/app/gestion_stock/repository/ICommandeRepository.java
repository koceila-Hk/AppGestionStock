package com.app.gestion_stock.repository;

import com.app.gestion_stock.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeRepository extends JpaRepository<Commande, Long> {
}
