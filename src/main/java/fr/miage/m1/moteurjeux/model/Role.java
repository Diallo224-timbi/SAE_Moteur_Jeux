package fr.miage.m1.moteurjeux.model;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node("Rôle")
public class Role {
    @Id
    private String id;
    private String nom;
    private boolean estActifNuit;
}