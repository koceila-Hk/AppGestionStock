package com.app.gestion_stock.service;

import com.app.gestion_stock.entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    Utilisateur addUser(Utilisateur utilisateur) throws Exception;
    void updateUser(Utilisateur utilisateur, Long id) throws Exception;
    void removeUser(Long id) throws Exception;

    //Get User
    Utilisateur getUserByID(Long id) throws Exception;
    List<Utilisateur> getAllUsers() throws Exception;
}
