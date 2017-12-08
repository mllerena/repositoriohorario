
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
public class Hora {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_hora;
    private String descripcion;

    public Hora() {
    }
    
   
    public Hora(int id_hora, String descripcion){
        this.id_hora=id_hora;
        this.descripcion=descripcion;
    
}

    public int getId_hora() {
        return id_hora;
    }

    public void setId_hora(int id_hora) {
        this.id_hora = id_hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    
}