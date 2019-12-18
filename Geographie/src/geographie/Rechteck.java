/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geographie;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Teilnehmer
 */
public class Rechteck implements Flaechig {
// Eigenschaften
    private int breite;
    private int laenge;
    private Color farbe;
    private Koordinate ladePunkt;
    
    public Rechteck(int breite, int laenge, Color farbe, Koordinate koo) {
        this.breite = breite;
        this.laenge = laenge;
        this.farbe = farbe;
        this.ladePunkt = koo;
    }
    
    @Override
    public void zeichnen(Graphics g) {
        g.setColor(getFarbe());
        g.fillRect((int)getLadePunkt().getX(), (int)getLadePunkt().getY(), getBreite(), getLaenge());
        
    }    

    /**
     * @return the breite
     */
    public int getBreite() {
        return breite;
    }

    /**
     * @param breite the breite to set
     */
    public void setBreite(int breite) {
        this.breite = breite;
    }

    /**
     * @return the laenge
     */
    public int getLaenge() {
        return laenge;
    }

    /**
     * @param laenge the laenge to set
     */
    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    /**
     * @return the farbe
     */
    public Color getFarbe() {
        return farbe;
    }

    /**
     * @param farbe the farbe to set
     */
    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    /**
     * @return the ladePunkt
     */
    public Koordinate getLadePunkt() {
        return ladePunkt;
    }

    /**
     * @param ladePunkt the ladePunkt to set
     */
    public void setLadePunkt(Koordinate ladePunkt) {
        this.ladePunkt = ladePunkt;
    }
}
