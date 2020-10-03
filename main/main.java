package main;

import java.io.*;
import java.util.*;

public class main {
    public static void main (String[]args)throws FileNotFoundException,IOException{
    String linea1;
    String linea2;
 
       BufferedReader leer1 = new BufferedReader (new FileReader ("C:\\Users\\lilliana\\Desktop\\liliana.txt"));
       linea1 = leer1.readLine();
 int numTokens = 0;
        StringTokenizer leer = new StringTokenizer (linea1);           
 while (leer.hasMoreTokens())
        {
            linea2 = leer.nextToken();
            numTokens++;
            System.out.println ( linea2);
        }
        System.out.println("");
        String cad2 = "Estoy muy estresada";
        String[] frase1 = cad2.split(" ");
        for (String frase : frase1)
        {
            System.out.println(frase);
            {
                
              }
        }}}
