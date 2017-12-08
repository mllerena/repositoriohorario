

package src.com.horario.dominio;

//Proyecto de la Malla Curricular

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//Estudiantes de Tercer semestre 
// Jenniffer Pincay 
// Rolando Mestanza
// Jefferson Castro
@Entity
public class MallaCurricular {
    @Id
    @GeneratedValue
    private int id_mallacurricular;
    
    @JoinColumn(name = "id_periodo", referencedColumnName = "id_periodo") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Periodo id_periodo;
    
     @JoinColumn(name = "id_ciclo", referencedColumnName = "id_ciclo") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Ciclo id_ciclo;
     
      @JoinColumn(name = "id_semestre", referencedColumnName = "id_semestre") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Semestre  id_semestre;
      
       @JoinColumn(name = "id_materia", referencedColumnName = "id_materia") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Materia id_materia; 

    public MallaCurricular() {
    }
    
    
    
    public MallaCurricular(int id_mallacurricular, Periodo id_periodo,Ciclo id_ciclo,Semestre id_semestre, Materia id_materia){
         this.id_mallacurricular=id_mallacurricular;
         this.id_periodo=id_periodo;
         this.id_ciclo=id_ciclo;
         this.id_semestre=id_semestre;
         this.id_materia =id_materia;
    }

   
    
    public int getId_MallaCurricular(){
        return id_mallacurricular;
    }
    public void setId_Mallacurricular(int id_mallacurricular){
        this.id_mallacurricular=id_mallacurricular;
    }
    
    public Periodo getId_Periodo(){
        return id_periodo;
    }
    
    public void setId_Periodo(Periodo id_periodo){
        this.id_periodo=id_periodo;
    }

    public Ciclo getId_ciclo() {
        return id_ciclo;
    }

    public void setId_ciclo(Ciclo id_ciclo) {
        this.id_ciclo = id_ciclo;
    }

    public Semestre getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(Semestre id_semestre) {
        this.id_semestre = id_semestre;
    }

    public Materia getId_materia() {
        return id_materia;
    }

    public void setId_materia(Materia id_materia) {
        this.id_materia = id_materia;
    }
    
    
    
    
    
}
