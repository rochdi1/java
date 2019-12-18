/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Teilnehmer
 */
public class Uhr extends Frame {

    public Uhr() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setSize(730, 750);
        this.setTitle("Analog-Uhr");
        this.add(new Zeichenflaeche());
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Uhr();
    }
    
}
