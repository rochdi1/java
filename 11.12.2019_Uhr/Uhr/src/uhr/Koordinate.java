/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

/**
 *
 * @author Teilnehmer
 */
public class Koordinate {
    
// Eigenschaften
    private double x;
    private double y;
    
    public Koordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Koordinate(int laenge, double winkel) {
        this.x = laenge * Math.cos(Math.toRadians(winkel));
        this.y = laenge * Math.sin(Math.toRadians(winkel));
    }
    
    public Koordinate(Koordinate koo, double xOff, double yOff) {
        this.x = koo.getX() + xOff;
        this.y = koo.getY() + yOff;
    }
    
    public Koordinate(Koordinate koo, int laenge, double winkel) {
        double xOff = laenge * Math.cos(Math.toRadians(winkel));
        double yOff = laenge * Math.sin(Math.toRadians(winkel));        
        this.x = koo.getX() + xOff;
        this.y = koo.getY() + yOff;
    }    

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
}
