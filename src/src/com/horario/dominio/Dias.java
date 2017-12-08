
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
public class Dias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dia;

    public Dias() {
    }
    
    private String descripcion;
    
    
    public Dias(int id_dia, String descripcion){
        this.id_dia= id_dia;
        this.descripcion=descripcion;              

    }

    public int getId_dia() {
        return id_dia;
    }

    public void setId_dia(int id_dia) {
        this.id_dia = id_dia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
        
        
        
}





    