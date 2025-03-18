package fr.miage.m1.moteurjeux.controller;

import fr.miage.m1.moteurjeux.model.Partie;
import fr.miage.m1.moteurjeux.service.PartieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parties")
public class PartieController {

    @Autowired
    private PartieService partieService;

    @GetMapping
    public List<Partie> getAllParties() {
        return partieService.getAllParties();
    }

    @PostMapping
    public Partie createPartie(@RequestBody Partie partie) {
        return partieService.createPartie(partie);
    }

    @GetMapping("/{id}")
    public Partie getPartieById(@PathVariable String id) {
        return partieService.getPartieById(id);
    }
    @GetMapping("/")
    public String test() {
        return "test";
    }
}