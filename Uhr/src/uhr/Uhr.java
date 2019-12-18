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
 * @author Rochdi
 */
public class Uhr extends Frame {

    
     public Uhr() {
         // close Button
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // exit(0) 0 Bedeutet wird dieser Programme ohner Fehler
                System.exit(0);
            }
        });
        // Size Frame
        this.setSize(730, 750);
        // Title Frame
        this.setTitle("Analog-Uhr");
        // ersetzen neuer ZeichenFlaeche in Frame 
        this.add(new Zeichenflaeche());
        
        // Frame Visibel
        this.setVisible(true);
        
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          new Uhr();
    }
 
    

    
}
