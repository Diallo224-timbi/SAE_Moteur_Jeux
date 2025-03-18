package fr.miage.m1.moteurjeux.service;

import fr.miage.m1.moteurjeux.model.Joueur;
import fr.miage.m1.moteurjeux.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoueurService {

    @Autowired
    private JoueurRepository joueurRepository;

    public List<Joueur> getAllJoueurs() {
        return joueurRepository.findAll();
    }

    public Joueur createJoueur(Joueur joueur) {
        return joueurRepository.save(joueur);
    }

    public Joueur getJoueurById(String id) {
        return joueurRepository.findById(id).orElse(null);
    }
}