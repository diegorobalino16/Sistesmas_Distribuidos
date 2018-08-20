/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Diego-LT
 */
public class BaseDatos {
    private  Connection cnx = null;
   
   public  LinkedList<Gift> obtenerTop10()  {
         
       try {
            Class.forName("com.mysql.jdbc.Driver");
            //Conexion con la base de datos, usuario y clave
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/datos", "diegorobaliono16", "diegoespol10");
            //se establece la conexion
            Statement st= cnx.createStatement();
            System.out.println("Se establecio con exito la conexion");
            //Parametros para consulta de la base de datos 
            PreparedStatement consulta = cnx.prepareStatement("SELECT Id,Visitas,Link,Descripción FROM gifts" );
            //contiene todo el resultado de la consulta 
            ResultSet resultado = consulta.executeQuery();
             LinkedList<Gift> lista =new  LinkedList<Gift>();
            Gift not;
            //recorremos el resultado de la consulta de la base de datos
            while(resultado.next()){
                not=new Gift();
                //guardamos en un Gift cada parametro 
                not.setId(resultado.getInt("Id"));
                not.setVisitas(resultado.getInt("Visitas"));
                not.setLink(resultado.getString("Link"));
                not.setDescripcion(resultado.getString("Descripción"));
                lista.add(not);
            }
               //Ordenamos la lista de gift segun las visitas de mayor a menor 
            Collections.sort(lista);
            //Obtenemos el top 10 de los gifts de la base de datos 
           LinkedList<Gift> top10 =new  LinkedList<Gift>();
            for (int i = 0; i < 10; i++) {
               top10.add(lista.get(i));
           }
            return top10;
            
         } catch (Exception ex) {
             System.out.println("No se pudo conectar a la Base de datos");
         }
       return null;
   }
  
}

           
    