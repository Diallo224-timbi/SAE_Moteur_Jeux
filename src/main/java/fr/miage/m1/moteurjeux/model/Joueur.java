package fr.miage.m1.moteurjeux.model;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

@Data
@Node("Joueur")
public class Joueur {
    @Id
    private String id;
    private String nom;
    private boolean estVivant;
    private boolean aVote;

    @Relationship(type = "A_POUR_ROLE")
    private Role role;
}