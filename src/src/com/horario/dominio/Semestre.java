
package src.com.horario.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Semestre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_semestre;

    public Semestre() {
    }
    private String descripcion;
    
    public Semestre(int id_semestre, String descripcion){
        this.id_semestre=id_semestre;
        this.descripcion=descripcion;
        
    }

    public int getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(int id_semestre) {
        this.id_semestre = id_semestre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
