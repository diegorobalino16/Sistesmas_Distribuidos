/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.LinkedList;
import net.spy.memcached.MemcachedClient;

/**
 *
 * @author Diego-LT
 */
public class Cache {
     public LinkedList<Gift> guardarCache()  {
       BaseDatos datos=new BaseDatos();
       //El puerto default de memcached es 11211
        InetSocketAddress[] servers = new InetSocketAddress[]{ new InetSocketAddress("127.0.0.1", 11211)};
        MemcachedClient mc;
        try {
            mc = new MemcachedClient(servers);
           LinkedList<Gift> gift=null;
            //Cuando pase una hora, esto nos devolverá null
            
            if (mc.get("gift")==(null)){
                LinkedList<Gift> lista=datos.obtenerTop10();
                //Así almacenamos un valor
                //se pasa llave, duración en segundos, valor
                mc.set("gift", 86400, lista);
                //Lo siguiente funcionará durante una hora
                gift = (LinkedList<Gift>)mc.get("gift");
            }else{
                gift = (LinkedList<Gift>)mc.get("gift");
            }
          
            mc.shutdown();
            return gift;
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
       return null;
   }
}