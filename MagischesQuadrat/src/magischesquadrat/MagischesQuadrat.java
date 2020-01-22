/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magischesquadrat;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Teilnehmer
 */
public class MagischesQuadrat extends Frame{

    int groesse;
    
    Font schrift = new Font("Arial", Font.PLAIN, 24);
    /**** 2 Schritt ******/   
    Panel steuerPanel = new Panel(new GridLayout(1, 3));
        Button neuSort = new Button("Neu Sortiert");   
        Button neuGemidscht = new Button("Neu Gemischt");
        Choice auswahl = new Choice();
        
    Panel spielfeld;
        Button[][] zahlen;
        Button[] zeilenSummen;
        Button[] spaltenSummen;
        Button hauptdiagonale;
        Button nebendiagonale;
        
    
    public MagischesQuadrat(int groesse) {
        this.groesse = groesse;
       
        
    /**** 1 Schritt ******/
        // grosse von Fenster 
        this.setSize(600, 800);
        // Title
        this.setTitle("Magisches Quadrat");
     
        //aktivieren close button 
        this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
        });  
        
        // setzen die schrift an die Button
          neuSort.setFont(schrift);
          neuGemidscht.setFont(schrift);
          auswahl.setFont(schrift);
        
        steuerPanel.add(neuSort);
        steuerPanel.add(neuGemidscht);
        steuerPanel.add(auswahl);
        
        // müssen wir jetzt die steuerpanel in Frame setzen 
        this.add("North", steuerPanel);
        
        
        einbauSpielfeld();
        
        // aktivieren die Frame (wird alles gezeigt)
        this.setVisible(true);
               
    }
    
    public void summen() {
        // zeilenSummen

            for(int zeilen = 0; zeilen < groesse; zeilen++) {
                int summe = 0;
               for(int spalten = 0; spalten  < groesse; spalten++) {
                summe += Integer.parseInt(zahlen[zeilen][spalten].getLabel());
                 }
               zeilenSummen[zeilen].setLabel(String.valueOf(summe));
             }
        
        // splatenSummen
             for(int spalten = 0; spalten < groesse; spalten++) {
                int summe = 0;
               for(int zeilen = 0; zeilen  < groesse; zeilen++) {
                summe += Integer.parseInt(zahlen[zeilen][spalten].getLabel());
                 }
               spaltenSummen[spalten].setLabel(String.valueOf(summe));
             }
        
        // HauptdiagonalSumme
                 int summe = 0;
                    for(int i = 0; i < groesse; i++) {
                        summe+=Integer.parseInt(zahlen[i][i].getLabel());
                     }   
               hauptdiagonale.setLabel(String.valueOf(summe));
             
        
        //nebenDiagonalSumme
                    int summed = 0;
                    for(int zeile = 0, spalte = groesse-1 ; zeile < groesse; zeile++, spalte--) {
                        summed+=Integer.parseInt(zahlen[zeile][spalte].getLabel());
                     }   
               nebendiagonale.setLabel(String.valueOf(summed));
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MagischesQuadrat(9);
        
    }

    public void einbauSpielfeld() {
        // Falls Spielfeld exstiert, löschen
        if(spielfeld != null) {
            this.remove(spielfeld);
        }
        // Neues Spielfeld erstellen 
        spielfeld = new Panel(new GridLayout(groesse+2,groesse+1));
        // Groesse des Arrays für das Spielfeld festlegen 
            zahlen = new Button[groesse][groesse];
        // Groesse des Arrays für die ZeilenSummen festlegen    
            zeilenSummen = new Button[groesse];
        // Groesse des Arrays für die SplatenSummen festlegen     
            spaltenSummen = new Button[groesse];
           
            // Button -Objecte für Zahlen (spielfeld) herstellen
            int zaehler = 1;
            for(int zeilen = 0; zeilen < groesse; zeilen++) {
               for(int spalten = 0; spalten  < groesse; spalten++) {
                   zahlen[zeilen][spalten] = new Button(String.valueOf(zaehler));
                   zaehler++;
               }
           } 
            
        // Button-Object für Zeilensummen erstellen   
           for(int i = 0; i < groesse; i++) {
               zeilenSummen[i] = new Button();                       
           }         
            
        // Button-Object für spaltenSummen erstellen   
           for(int i = 0; i < groesse; i++) {
               spaltenSummen[i] = new Button();                       
           }    
           
        // Button-Object für hauptdiagonale erstellen   
               hauptdiagonale = new Button();       
        // Button-Object für nebendiagonale erstellen   
               nebendiagonale = new Button();  
               
               
       // Einbauen der button-Object in den Panel "SpielFled"      
       // leer Panels als Platzthalter
       for(int i = 0; i < groesse; i++) {
           spielfeld.add(new Panel());
       }
       
       // Einbau Nebendiagonalsumme
       spielfeld.add(nebendiagonale);

       // Einbau SpielfeldZahlen und Zeilen
       
       for(int zeile=0; zeile < groesse; zeile++) {
           for(int spalte = 0; spalte < groesse; spalte++) {
                  spielfeld.add(zahlen[zeile][spalte]);
           }
           spielfeld.add(zeilenSummen[zeile]);
       }
       
       
       //Einbau spaltenSummen
       for(int spalte= 0; spalte<groesse; spalte++) {
           spielfeld.add(spaltenSummen[spalte]);     
       }
           //Einbau Haupdiagonal
           spielfeld.add(hauptdiagonale);
       
       this.add("Center", spielfeld);
       summen();
      
    }
    
}
