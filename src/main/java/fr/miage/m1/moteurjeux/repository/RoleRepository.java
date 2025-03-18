package fr.miage.m1.moteurjeux.repository;

import fr.miage.m1.moteurjeux.model.Role;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface RoleRepository extends Neo4jRepository<Role, String> {
}