package fr.miage.m1.moteurjeux.repository;

import fr.miage.m1.moteurjeux.model.Partie;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PartieRepository extends Neo4jRepository<Partie, String> {
}