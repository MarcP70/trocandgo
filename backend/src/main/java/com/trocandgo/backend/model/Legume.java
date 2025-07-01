package com.trocandgo.backend.model;

import jakarta.persistence.*;

@Entity
public class Legume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    // Constructeurs
    public Legume() {}

    public Legume(String nom) {
        this.nom = nom;
    }

    // Getters & Setters
    public Long getId() {
        return id;

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom; }
}
