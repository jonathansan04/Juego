/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import Logica.LeerArchivo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javafx.event.EventType;

/**
 *
 * @author tatan
 */
public  class Tablero extends JFrame {

   int x, y;
    private boolean arriba, abajo, izquierda, derecha;
    JLabel label = new JLabel();
    JButton boton = new JButton();
    JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    JButton boton3 = new JButton();

    public Tablero(int arreglo[][]) {
        int base;
        int altura = 0;
        int i, j;

        for (i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {

            }
            altura = j;
        }
        base = arreglo.length;
        int base1 = base * 50;
        int altura1 = altura * 50;
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        panel.setBounds(600, 600, 600, 600);
        panel.setSize(600, 600);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.yellow), BorderFactory.createEmptyBorder(10, 15, 5, 15)));
        this.getContentPane().add(panel);
        this.setSize(700, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Juego laberinto");
        setLocationRelativeTo(null);

        //  JButton boton = new JButton();
        boton.setBounds(400, 20, 500, 20);
        boton.setSize(50, 50);
        boton.setText("▲");
        //  boton.setBackground(Color.blue);
        panel.add(boton);
        //  JButton boton1 = new JButton();
        boton1.setBounds(320, 100, 320, 100);
        boton1.setSize(50, 50);
        boton1.setText("◄");
        // boton1.setBackground(Color.blue);
        panel.add(boton1);
        // JButton boton2 = new JButton();
        boton2.setBounds(400, 100, 400, 100);
        boton2.setSize(50, 50);
        boton2.setText("▼");
        //   boton2.setBackground(Color.blue);
        panel.add(boton2);

        //JButton boton3 = new JButton();
        boton3.setBounds(480, 100, 480, 100);
        boton3.setSize(50, 50);
        boton3.setText("►");
        // boton3.setBackground(Color.blue);
        panel.add(boton3);

        JPanel panel1 = new JPanel();
        // panel1.setBackground(Color.black);
        //panel1.setBounds(20, 30, 200, 300);
        panel1.setBounds(60, 60, 600, 600);
        panel1.setSize(base1, altura1);
        panel.add(panel1);

        // JLabel label = new JLabel();
        label.setText("🚀");
        //label.setText("☺");
        label.setSize(100, 100);
         int x=100;
         int y=100;
        panel1.add(label);
label.setLocation(100, 100);
        boton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // setTitle("boton xxxx");		
                label.setLocation(x, y-50);
            }
        });
        try{
        boton1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //setTitle("boton1 xxxx");
          
               
                label.setLocation(x-500,y);
            }
               
                
        });
        }
        catch(Exception e){
            System.out.println("Se salio del tablero");
        }
        boton2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               // setTitle("boton2 xxxx");
                label.setLocation(x, y+50);
            }
        });

        boton3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               // setTitle("boton3 xxxx");
                label.setLocation(x+50,y);
                
            }
        });
    }
    
	public class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
		}
	}
    
        public void KeyPressed(java.awt.event.KeyEvent evt){
            int x= label.getX();
            int y= label.getY();
            
            if(evt.getKeyChar()=='a'){
                x=x+10;
                label.setLocation(x, y);
            }
              if(evt.getKeyChar()=='d'){
                x=x-10;
                label.setLocation(x, y);
            }
                if(evt.getKeyChar()=='s'){
                y=y-10;
                label.setLocation(x, y);
            }
                  if(evt.getKeyChar()=='w'){
                y=y+10;
                label.setLocation(x, y);
            }
                
      //  }
        
        
        
        
    
}
    /*
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            setTitle("boton ");
        }
        if (e.getSource() == boton1) {
            setTitle("boton 1");
        }
        if (e.getSource() == boton2) {
            setTitle("boton 2");
        }
        if (e.getSource() == boton3) {
            setTitle("boton 3");
        }
    }
     */

    

   

}
