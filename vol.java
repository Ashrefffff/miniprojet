package com.example.API.model;

import java.util.ArrayList;
import java.util.Date;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private ArrayList<Passager> passagers;

    // champs pour le constructeur avec Date/Aeroport
    private Date date;
    private Aeroport depart;
    private Aeroport arrivee;
    private String heureDepart;

    public Vol(String numeroVol, String origine, String destination,
               String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.passagers = new ArrayList<>();
    }

    // utilisé par Main.chargerVols(...)
    public Vol(String code, Date date, Aeroport depart, Aeroport arrivee) {
        this.numeroVol = code;
        this.date = date;
        this.depart = depart;
        this.arrivee = arrivee;
        this.passagers = new ArrayList<>();
    }

    public void planifierVol() {
        System.out.println("Vol " + numeroVol + " planifié.");
    }

    public void annulerVol() {
        etat = "Annulé";
        System.out.println("Vol " + numeroVol + " annulé.");
    }

    public void modifierVol(String nouveauEtat) {
        etat = nouveauEtat;
        System.out.println("Vol " + numeroVol + " modifié.");
    }

    public void ListingPassager(Passager passager) {
        passagers.add(passager);
        System.out.println("Passager ajouté au vol " + numeroVol);
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    // --- nouveau getter / setter pour l'heure de départ ---

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
        // si tu veux garder la cohérence avec dateHeureDepart :
        this.dateHeureDepart = heureDepart;
    }
}

