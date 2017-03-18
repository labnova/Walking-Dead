package com.labnova.innocenzotremamondo.walkingdead.model;

import android.util.Log;

public class SoldatoAlexandria {

    String nomeDiBattaglia;
    int forza;
    int velocita;
    String direzione;
    int tempoDiPercorrenza;

    public int getTempoDiPercorrenza() {
        return tempoDiPercorrenza;
    }

    public void setTempoDiPercorrenza(int tempoDiPercorrenza) {
        this.tempoDiPercorrenza = tempoDiPercorrenza;
    }

    public SoldatoAlexandria() {

    }

    void gridaAllarme() {
        Log.d("messaggio", "STAI RUBANDO!!!");
    }


    public void setNomeDiBattaglia(String nomeDiBattaglia) {
        this.nomeDiBattaglia = nomeDiBattaglia;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }



    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void setDirezione(String direzione) {
        this.direzione = direzione;
    }

    public int getForza() {
        return forza;
    }

    public int getVelocita() {
        return velocita;
    }

    public String getDirezione() {
        return direzione;
    }

    public SoldatoAlexandria(int forza, int velocita, String direzione) {
        this.forza = forza;
        this.velocita = velocita;
        this.direzione = direzione;
    }

    public SoldatoAlexandria(String nomeDiBattaglia, int forza, int velocita, String direzione) {
        this.nomeDiBattaglia = nomeDiBattaglia;
        this.forza = forza;
        this.velocita = velocita;
        this.direzione = direzione;
    }

    public SoldatoAlexandria(String direzione, int velocita, String nomeDiBattaglia) {
        this.direzione = direzione;
        this.velocita = velocita;
        this.nomeDiBattaglia = nomeDiBattaglia;
    }

    public String getNomeDiBattaglia() {
        return nomeDiBattaglia;
    }
}