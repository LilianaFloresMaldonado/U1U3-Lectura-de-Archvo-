package main;

import java.io.*;
import java.util.*;

public class main {
    public static void main (String[]args)throws FileNotFoundException,IOException{
     main Metodo1 = new main();
    List <String> Cadena1 = new ArrayList <String>();
         Cadena1.add ("me siento muy estresada por la escula");
         String cade = "Esto es una prueba";

         File Archivo= null;
         FileReader TU=null;
         BufferedReader DR=null;
    
         String Fichero;
         String Fiche[];
         String Listas[];
         
         Fiche=cade.split(" ");
 
      Archivo= new File("C:\\Users\\lilliana\\Desktop\\liliana.txt");
      TU=new FileReader(Archivo);
      DR= new BufferedReader (TU);
      
      Fichero=DR.readLine();
      System.out.println("Palabras originales");
      Listas=Cadena1.get(0).split(" ");
      
      Metodo1.visualizar(Listas);
      System.out.println("Palabras del texto");
      Fiche=Fichero.split(" ");
      
      Metodo1.visualizar(Fiche);
      
      Metodo1.Intercalacion(Listas, Fiche);
   }
    
    public void Intercalacion (String AD[], String BE[]){
         ArrayList<String> V = new ArrayList<>();
         int k = 0;
         for (int i = 0; i < AD.length; i++) {
            for (int j = 0; j < BE.length; j++) {
                if (AD[i].equals(BE[j])) {
                    V.add(AD[i]);
            }
        }
    }
        VisualizarT(V);
    }
    public void visualizar (String Y[]){
        
    for ( int i=0; i < Y.length;i++){
        System.out.println (Y[i]);
    }
        System.out.println("");
    }
    public void VisualizarT(ArrayList<String>Y){
        System.out.println("***Comparación***");
        System.out.println("");
        for(int i=0; i < Y.size();i++){
        System.out.println(Y.get(i));
    }
        System.out.println("");
    }

}
