/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.*;
import java.util.StringTokenizer;


/**
 *
 * @author tatan
 */
public class LeerArchivo {

    public int[][] arreglo;
    private int x = 0, y = 0;

    //public String Leer(String dir)
    public int[][] Leer(String dir) {
        //String ar = dir[0];
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(dir));
            String temp = "";
            String linea;

            int cont = 0, x1 = 0, y1 = 0;
            String caracter;
            //int arreglo[][];
            while ((linea = br.readLine()) != null) {
                x1 = 0;
                y1 = 0;
                temp = temp + linea;
                System.out.println(linea);
                if (cont == 0) {
                    x = Integer.parseInt(linea);
                    System.out.println("x " + x);
                }
                if (cont == 1) {
                    y = Integer.parseInt(linea);
                    System.out.println("y " + y);
                }

                if (cont > 1) {
                    arreglo = new int[x][y];
                    System.out.println("cont " + cont);
                    // String[] arrOfStr = linea.split(" ",-2);
                    /* for (String a : arrOfStr)
                    {
                       arreglo[x1][y1]  = Integer.parseInt(a);
                       System.out.println("y1 " +  y1);
                       System.out.println("arreglo[x1][y1] " +  arreglo[x1][y1]);
                       y1=y1+1;
                    }*/

                    StringTokenizer Tok = new StringTokenizer(linea);
                    while (Tok.hasMoreElements()) {
                        caracter = (String) Tok.nextElement();
                        arreglo[x1][y1] = Integer.parseInt((caracter));
                        System.out.println("y1 " + y1);
                        System.out.println("arreglo[x1][y1] " + arreglo[x1][y1]);
                        y1 = y1 + 1;
                    }
//
                    x1 = x1 + 1;
                    System.out.println("x1 " + x1);
                }
                cont = cont + 1;

                text = temp;
            }
            //Imprimir matriz
            // System.out.println("Inicio");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    //  System.out.println("i " + i + "j "+j+ " "+ arreglo[i][j]);
                }
            }

        } catch (Exception e) {
            System.out.println("No se encontro ningun archivo");
        }
        //  return text;
        return arreglo;

    }

}
