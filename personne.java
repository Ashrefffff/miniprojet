package com.example.API.model;

public class Personne {
    private String identifiant;
    private String nom;
    private String adresse;
    private String contact;
    public Personne(String identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }
    public void obtenirInfos() {
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Contact: " + contact);
    }
    public String obtenirRole() {
        return "Role non défini pour la personne générale.";
    }
}

