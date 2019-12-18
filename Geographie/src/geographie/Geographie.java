/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geographie;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author Teilnehmer
 */
public class Geographie extends Frame {
    
//    String name = "Fritz";
//    int zahl = 1234;
//    double kommaZahl = 14.45;
//    
//    int[] zahlen = new int[100];
//    int[] tage = new int[100];
    
    ArrayList<Flaechig> liste = new ArrayList<Flaechig>(); 
   
    
    public Geographie() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(1000, 700);
        this.setTitle("Geometrische Formen");
        
        for(int i = 0; i < 10; i ++) {
            int radius = zufZahl(10, 500);
            double x = zufZahl(0, 700);
            double y = zufZahl(0, 500);
            Koordinate koo = new Koordinate(x, y);
            int rot = zufZahl(0, 256);
            int gruen = zufZahl(0, 256);
            int blau = zufZahl(0, 256);
            int trans = zufZahl(0, 100);
            Color farbe = new Color(rot, gruen, blau, trans);
            Kreis kreis = new Kreis(radius, farbe, koo);
            liste.add((Flaechig) kreis);  
        }
        
        for(int i = 0; i < 10; i ++) {
            int breite = zufZahl(10, 500);
            int hoehe = zufZahl(10, 300);
            double x = zufZahl(0, 700);
            double y = zufZahl(0, 500);
            Koordinate koo = new Koordinate(x, y);
            int rot = zufZahl(0, 256);
            int gruen = zufZahl(0, 256);
            int blau = zufZahl(0, 256);
            int trans = zufZahl(50, 150);
            Color farbe = new Color(rot, gruen, blau, trans);
            Rechteck rechteck = new Rechteck(breite,hoehe, farbe, koo);
            liste.add((Flaechig) rechteck);  
        }
        this.add(new Zeichenflaeche(liste));

        this.setVisible(true);
//        int zahl = 0;
//        System.out.println(name + " hat heute mit Java begonnen");
//        System.out.println(zahl * kommaZahl);
//        System.out.println(zahl);
//        int erg = addi(12, 19);
//
//        for(int i = 0; i < zahlen.length; i ++) {
//            zahlen[i] = zufZahl(100, 1000);
//        }
//        System.out.println("Der Größtwert: " + maxi(zahlen));
    }
    
//    int maxi(int[] werte) {
//        int max = werte[0];
//        for(int i = 0; i < werte.length; i ++) {
//            if(werte[i] > max) {
//                max = werte[i];
//            }
//        }
//        return max;
//    }
//    
//    int addi(int zahl1, int zahl2) {
//        return zahl1 + zahl2;
//    }
//    
    int zufZahl(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }
    
    public static void main(String[] args) {
        new Geographie();
        System.out.println("Programmende");
    }
    
}
