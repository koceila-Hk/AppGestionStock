package com.app.gestion_stock.serviceImpl;

import com.app.gestion_stock.entity.Utilisateur;
import com.app.gestion_stock.repository.IUtilisateurRepository;
import com.app.gestion_stock.service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {

    @Autowired
    private IUtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur addUser(Utilisateur utilisateur) throws Exception {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void updateUser(Utilisateur utilisateur, Long id) throws Exception {
        Utilisateur utilisateurExist = utilisateurRepository.findById(id).orElseThrow();

            utilisateurExist.setNom(utilisateur.getNom());
            utilisateurExist.setPrenom(utilisateur.getPrenom());
            utilisateurExist.setEmail(utilisateur.getEmail());
            utilisateurExist.setAdresse(utilisateur.getAdresse());
            utilisateurExist.setTelephone(utilisateur.getTelephone());
            utilisateurRepository.save(utilisateurExist);
    }

    @Override
    public void removeUser(Long id) throws Exception {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur getUserByID(Long id) throws Exception {
        Optional<Utilisateur> utilisateur = utilisateurRepository.findById(id);
        return utilisateur.get();
    }

    @Override
    public List<Utilisateur> getAllUsers() throws Exception {
        return utilisateurRepository.findAll();
    }
}
