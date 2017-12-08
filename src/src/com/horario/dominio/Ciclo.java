
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
public class Ciclo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ciclo;
    
    private String descripcion;

    public Ciclo() {
    }
    
    public Ciclo(int id_ciclo, String descripcion){
        this.id_ciclo=id_ciclo;
        this.descripcion=descripcion;
              
   }
    
   public int getId(){
       return id_ciclo;
   } 
   
   public void setId(int id_ciclo){
       this.id_ciclo=id_ciclo;
   }
    
   public String getDescripcion(){
       return descripcion;
   } 
   
   public void setDescripcion(String descripcion) {
       this.descripcion=descripcion;
   }
   
}
