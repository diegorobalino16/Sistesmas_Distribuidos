/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;


import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
/**
 *
 * @author RAFAEL
 */
public class Comunicacion  implements Runnable{
      @Override
    public void run() {
        while (true) {      
            //FALTA AGREGAR LINEAS DE CODIGO
            
            
            try {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                TServerSocket serverTransport = new TServerSocket(7911);
                
                
                System.err.println("Servidor en escucha puerto 7911...");
    }catch (Exception e) {
        System.out.println("No se puede escuchar el puerto 7911");
    }
         }
    }
    
}
