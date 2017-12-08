

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
public class Docente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_docente;

    public Docente() {
    }
    private String nombre;
    
    public Docente(int id_docente, String nombre){
        this.id_docente=id_docente;
        this.nombre=nombre;
        
    }
    
    public int getId(){
        return id_docente;
    }
    public void setId(int id_docente){
        this.id_docente=id_docente;
    }
    
    public String getNombre(){
        return nombre;
    }
     
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
}
