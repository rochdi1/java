/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geographie;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Teilnehmer
 */
public class Zeichenflaeche extends Canvas {

    ArrayList<Flaechig> liste;
    
    public Zeichenflaeche(ArrayList<Flaechig> liste) {
        this.liste = liste;
    }
    
    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < liste.size(); i ++) {
            Flaechig kreis = liste.get(i);
            kreis.zeichnen(g);
        }
        Graphics2D g2D = (Graphics2D)g;
        
        g2D.setStroke(new BasicStroke(50));
               g2D.setColor(Color.red);
         g2D.drawLine(0,0,1000,700);
    }
    
}
