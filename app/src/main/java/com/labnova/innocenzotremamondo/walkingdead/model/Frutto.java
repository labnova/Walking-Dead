package com.labnova.innocenzotremamondo.walkingdead.model;


public class Frutto {

    String direzione;
    int pesante;
    int distanza;

    public int getDistanza() {
        return distanza;
    }

    public Frutto(String direzione, int pesante, int distanza) {
        this.direzione = direzione;
        this.pesante = pesante;
        this.distanza = distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public Frutto(String direzione) {
        this.direzione = direzione;
    }

    public Frutto(String direzione, int pesante) {
        this.direzione = direzione;
        this.pesante = pesante;
    }


    public String getDirezione() {
        return direzione;
    }

    public int getPesante() {
        return pesante;
    }


    public void setDirezione(String direzione) {
        this.direzione = direzione;
    }

    public void setPesante(int pesante) {
        this.pesante = pesante;
    }
}
