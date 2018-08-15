/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;

import Thrift.Servidor;
import java.util.LinkedList;
import org.apache.thrift.TException;






/**
 *
 * @author ARAUZ - ROBALINO - SUQUINAHUA
 */
public class Microservicio implements Servidor.Iface {

    /**
     * @param args the command line arguments
     */
    
    private static LinkedList<Gift> gifts;
    public static void main(String[] args) {
       
//        Convertidor cv =new Convertidor();
//        cv.leer();
        Cache con =new Cache();
        gifts=con.guardarCache();
        for(Gift gift: gifts){
            System.out.println(gift);
       }
     }

    @Override
    public String top10(String dato1) throws TException {
        Cache con =new Cache();
        gifts=con.guardarCache();
        for(Gift gift: gifts){
            System.out.println(gift);
       } 
        String top="";
        for(Gift gift: gifts){
            top=top+gift+";";
        }
        return top;       
    }

    @Override
    public String optenerLista() throws TException {
        return "";
    }
        
    
}
