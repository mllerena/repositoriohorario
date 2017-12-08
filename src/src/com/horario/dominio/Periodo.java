
package src.com.horario.dominio;

//Proyecto de la Malla Curricular

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Estudiantes de Tercer semestre 
// Jenniffer Pincay 
// Rolando Mestanza
// Jefferson Castro
@Entity
@Table
public class Periodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_periodo;

    public Periodo() {
    }
    private String descripcion;
    
    public Periodo(int id_periodo, String descripcion){
        this.id_periodo=id_periodo;
        this.descripcion=descripcion;
        
    }

    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
    
    
}

 
