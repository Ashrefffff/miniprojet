package com.example.API.model;
import com.example.API.model.Vol;

import java.util.ArrayList;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private ArrayList<Vol> vols;
    public Aeroport(String nom, String ville, String description, String s) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
        this.vols = new ArrayList<>();
    }
    public void affecterVol(Vol vol) {
        vols.add(vol);
        System.out.println("Vol " + vol.getNumeroVol() + " affecté à l'aéroport " + nom);
    }
}

