package com.example.API.model;

public class Employe extends Personne {
    private String numeroEmploye;
    private String dateEmbauche;
    public Employe(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }
    public String obtenirRole() {
        return "Role de l'employé: Employé générique";
    }
}

