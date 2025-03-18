package fr.miage.m1.moteurjeux.repository;

import fr.miage.m1.moteurjeux.model.Joueur;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface JoueurRepository extends Neo4jRepository<Joueur, String> {
}