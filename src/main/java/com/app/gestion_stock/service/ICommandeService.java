package com.app.gestion_stock.service;

import com.app.gestion_stock.dto.CommandeRequest;
import com.app.gestion_stock.entity.Commande;

public interface ICommandeService {
    Commande createOrder(CommandeRequest request) throws Exception;
}
