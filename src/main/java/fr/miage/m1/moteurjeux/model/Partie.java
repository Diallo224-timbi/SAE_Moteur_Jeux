package fr.miage.m1.moteurjeux.model;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Data
@Node("Partie")
public class Partie {
    @Id
    private String id;
    private String phase;
    private boolean estTerminee;

    @Relationship(type = "JOUE_DANS", direction = Relationship.Direction.INCOMING)
    private List<Joueur> joueurs;
}