package fr.miage.m1.moteurjeux.service;

import fr.miage.m1.moteurjeux.model.Partie;
import fr.miage.m1.moteurjeux.repository.PartieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartieService {

    @Autowired
    private PartieRepository partieRepository;

    public List<Partie> getAllParties() {
        return partieRepository.findAll();
    }

    public Partie createPartie(Partie partie) {
        return partieRepository.save(partie);
    }

    public Partie getPartieById(String id) {
        return partieRepository.findById(id).orElse(null);
    }
}