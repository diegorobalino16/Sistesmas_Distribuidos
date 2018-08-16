/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author RAFAEL
 */
public class Convertidor {
    File archivo = null;
    File archivo1 = null;
    FileReader fr = null;
    BufferedReader br = null;
    FileWriter crear = null; 
    
    String[] phones =null;
    String[] texto1=null;
    

    public void leer(){
           
       archivo = new File ("datos.txt");
       archivo1 = new File("datos1.csv");  
       try {
            crear = new FileWriter(archivo1); 
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero .tsv y guardar archivo .csv
             String linea;
            String texto;
       
            int acum=1;
            int numero;
            while((linea=br.readLine())!=null){
                   numero = (int) (Math.random() * 450000) + 1;
                  phones= linea.split("\\t");
                  crear.write(acum+",");
                  crear.write(numero+",");
                  crear.write(phones[0]+",");
                  texto=phones[1];
                  texto1= texto.split(",");
                  texto="";
                  for (int i = 0; i <texto1.length; i++) {
                    texto=texto+texto1[i];
                  }
            }
    }
       catch(Exception e){
            System.out.println("No se pudo abrir el archivo");
            e.printStackTrace();
        }
       
 
    }
}
