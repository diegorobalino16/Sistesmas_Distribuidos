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
    
    
    
}
