package com.example.API.model;

import com.example.API.model.Vol;

import java.util.UUID;


public class Reservation {
    private String numeroReservation;
    private Vol vol;
    private String dateReservation;
    private String statut;
    public Reservation(Vol vol) {
        this.numeroReservation = UUID.randomUUID().toString();
        this.vol = vol;
        this.dateReservation = "2025-04-15";  // Example date
        this.statut = "Réservé";
    }
    public void confirmerReservation() {
        statut = "Confirmé";
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }
    public void annulerReservation() {
        statut = "Annulé";
        System.out.println("Réservation " + numeroReservation + " annulée.");
    }
    public void modifierReservation(String nouveauStatut) {
        statut = nouveauStatut;
        System.out.println("Réservation " + numeroReservation + " modifiée.");
    }
    public String getNumeroReservation() {
        return numeroReservation;
    }
    public void afficherReservation() {
        System.out.println("Numéro de réservation: " + numeroReservation + " | Statut: " + statut);
    }
}

