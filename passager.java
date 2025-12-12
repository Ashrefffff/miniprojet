package com.example.API.model;

import com.example.API.model.Vol;

import java.util.ArrayList;

public class Passager extends Personne {
    private String passport;
    private ArrayList<Reservation> reservations;
    public Passager(String identifiant, String nom, String adresse, String contact, String passport) {
        super(identifiant, nom, adresse, contact);
        this.passport = passport;
        this.reservations = new ArrayList<>();
    }
    public void reserverVol(Vol vol) {
        Reservation reservation = new Reservation(vol);
        reservations.add(reservation);
        System.out.println("Réservation effectuée pour le vol: " + vol.getNumeroVol());
    }
    public void annulerReservation(String numeroReservation) {
        reservations.removeIf(reservation -> reservation.getNumeroReservation().equals(numeroReservation));
        System.out.println("Réservation annulée.");
    }
    public void obtenirReservations() {
        for (Reservation reservation : reservations) {
            reservation.afficherReservation();
        }
    }
}

