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
public class Kreis implements Flaechig {
    
// Eigenschaften
    private int radius;
    private Color farbe;
    Koordinate ladePunkt;
    
    public Kreis(int radius, Color farbe, Koordinate koo) {
        this.radius = radius;
        this.farbe = farbe;
        this.ladePunkt = koo;
    }
    
   // @Override
    public void zeichnen(Graphics g) {
        g.setColor(farbe);
        g.fillOval((int)ladePunkt.getX(), (int)ladePunkt.getY(), 2 * radius, 2 * radius);
        
    }

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
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
    
    
    
}
