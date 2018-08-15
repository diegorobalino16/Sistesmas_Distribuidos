/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidos;

import java.io.Serializable;

/**
 *
 * @author ARAUZ - ROBALINO - SUQUINAHUA
 */
public class Gift implements Comparable<Gift>, Serializable {
   private int id;
   private int visitas;
   private String link;
   private String Descripcion;
   

    public Gift() {
    }

    public Gift(int id, int visitas, String link, String Descripcion) {
        this.id = id;
        this.visitas = visitas;
        this.link = link;
        this.Descripcion = Descripcion;
    }

}
