package com.app.gestion_stock.repository;

import com.app.gestion_stock.entity.CommandeProduit;
import com.app.gestion_stock.entity.CommandeProduitId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeProduitRepository extends JpaRepository<CommandeProduit, CommandeProduitId> {
}
