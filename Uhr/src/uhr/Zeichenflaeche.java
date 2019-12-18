/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uhr;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teilnehmer
 */
public class Zeichenflaeche extends Canvas {
    
  Koordinate mitte = new Koordinate(350.0,350.0);      
  
 // Koordinate(int laenge, double winkel)
    Koordinate endpunkt;
     Koordinate endLangue;

// Konstruktor
    
       Font schrift = new Font("Arial", Font.PLAIN, 24); 
       
       BasicStroke strich8 = new BasicStroke(8);
       BasicStroke strich3 = new BasicStroke(3);
       BasicStroke strich1 = new BasicStroke(1);
      
       
     public void paint(Graphics g) { 
         
         Graphics2D g2d = (Graphics2D) g;
         
         g.setFont(schrift);
         double winkel = -60.0;
         int laenge = 300;
                  
         g.setColor(Color.YELLOW);
                     g.fillOval((int)mitte.getX() - 335, (int)mitte.getY() - 345, 680, 680);     
         
         for(int i=0; i < 12; i++) {
             
              g.setColor(Color.BLUE);
             endpunkt = new Koordinate(mitte, laenge, winkel);
          //  endLangue = new Koordinate((Koordinate)mitte, (int) laenge ,(double) winkel);
            
         
              
             
               // anzeigen linie   
              //  g.drawLine((int)mitte.getX() , (int)mitte.getY(), (int) endpunkt.getX()  , (int) endpunkt.getY() );
               
        //  g.drawLine((int)mitte.getX() , (int)mitte.getY(), (int) endpunkt.getX()  , (int) endpunkt.getY() );
    //      g.drawLine((int)mitte.getX() , (int)mitte.getY(), (int)endLangue.getX() ,(int)endLangue.getY());
       
           g.drawString( String.valueOf(i+1), (int) endpunkt.getX()  , (int) endpunkt.getY());
//           g.drawOval((int)mitte.getX() - 335, (int)mitte.getY() - 345, 680, 680);



//STD *30-90 +min*0,5                360 / 12
//Min*6-90                           360 / 60
      
         
          winkel +=30;

         }
         
         
         while(true) {
             g.setColor(Color.BLUE);
                 GregorianCalendar zeit = new GregorianCalendar();
                 int stunde = zeit.get(GregorianCalendar.HOUR);
                 int minute = zeit.get(GregorianCalendar.MINUTE);
                 int sekunde = zeit.get(GregorianCalendar.SECOND);
                 
                 
                 System.out.println(zeit.get(GregorianCalendar.SECOND));
                 double  stdWinkel = (stunde * 30) - 90 + minute * 0.5;
                 endpunkt = new Koordinate(mitte, (int)(laenge * 0.7), stdWinkel );
                 g2d.setStroke(strich8);
                 g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());
  
                 
                 double  mintWinkel = (minute * 6) - 90;
                 endpunkt = new Koordinate(mitte, (int)(laenge * 0.8), mintWinkel );
                 g2d.setStroke(strich3);
                 g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());
         
                 
                 
                 double  sekundeWinkel = (sekunde * 6) - 90;
                 endpunkt = new Koordinate(mitte, (int)(laenge * 0.9), sekundeWinkel );
                 g2d.setStroke(strich1);
                 g.setColor(Color.RED);                         
                 g.drawLine((int)mitte.getX(), (int)mitte.getY(), (int)endpunkt.getX(), (int)endpunkt.getY());
                 
                 
                 
            try {        
                 Thread.sleep(1000);
                 
             } catch (InterruptedException ex) {
                 Logger.getLogger(Zeichenflaeche.class.getName()).log(Level.SEVERE, null, ex);
                 ex.printStackTrace();
             }
         
         g.setColor(Color.YELLOW);
         g.fillOval((int)(mitte.getX() - (0.89 * laenge)), (int)(mitte.getY() - (0.89 * laenge)), (int)(2 * 0.89 * laenge), (int)(2 * 0.89 * laenge));
         
         } 
         
         
     }
    
    
}
