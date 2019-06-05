/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Logica.LeerArchivo;
import Logica.Minas;
import Logica.*;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author tatan
 */
public class Juego {

 //   private static String linea;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LeerArchivo l = new LeerArchivo();   
        l.Leer("C:\\Users\\tatan\\OneDrive\\Documentos\\TrabajoPOO\\Juego.txt");
        
        Tablero t = new Tablero(l.arreglo);
        t.setVisible(true);
       
         // t.KeyPressed(evt);
          
        //t.KeyPressed(KeyEvent.KEY_PRESSED);
        t.setLocationRelativeTo(null);
      //  KeyboardExample keyboardExample = new KeyboardExample();
      // KeyPressed k = new KeyPressed();
     
       
        // Minas m = new Minas(l.arreglo,linea);
        //m.Minas(linea);
        
  //      Minas m = new Minas(l.arreglo);
        
        
        

    }

}
