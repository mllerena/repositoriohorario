
package src.com.horario.dominio;
//Proyecto de la Malla Curricular
//Estudiantes de Tercer semestre 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Jenniffer Pincay 
// Rolando Mestanza
// Jefferson Castro
@Entity
@Table
public class Jornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id_jornada;

    public Jornada() {
    }
    private String descripcion;
   
    
    public Jornada(int id_jornada, String descripcion){
        this.id_jornada= id_jornada;
        this.descripcion=descripcion;   
    
    
    }

    public int getId_jornada() {
        return id_jornada;
    }

    public void setId_jornada(int id_jornada) {
        this.id_jornada = id_jornada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
