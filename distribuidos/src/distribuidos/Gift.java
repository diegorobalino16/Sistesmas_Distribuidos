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
public int getId() {
        return id;
    }
 public void setId(int id) {
        this.id = id;
    }
  public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }
    
     public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
     public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
}
