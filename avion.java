package com.example.API.model;


import com.example.API.model.Vol;

import java.util.ArrayList;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private ArrayList<Vol> vols;
    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.vols = new ArrayList<>();
    }
    public void affecterVol(Vol vol) {
        vols.add(vol);
        System.out.println("Vol " + vol.getNumeroVol() + " affecté à l'avion " + immatriculation);
    }
    public boolean verifierDisponibilite(Vol vol) {
        for (Vol v : vols) {
            if (v.getDateHeureDepart().equals(vol.getDateHeureDepart())) {
                return false;
            }
        }
        return true;
    }
}

