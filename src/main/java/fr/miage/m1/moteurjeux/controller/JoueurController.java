package fr.miage.m1.moteurjeux.controller;

import fr.miage.m1.moteurjeux.model.Joueur;
import fr.miage.m1.moteurjeux.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joueurs")
public class JoueurController {

    @Autowired
    private JoueurService joueurService;

    @GetMapping
    public List<Joueur> getAllJoueurs() {
        return joueurService.getAllJoueurs();
    }

    @PostMapping
    public Joueur createJoueur(@RequestBody Joueur joueur) {
        return joueurService.createJoueur(joueur);
    }

    @GetMapping("/{id}")
    public Joueur getJoueurById(@PathVariable String id) {
        return joueurService.getJoueurById(id);
    }
}