
package src.horario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
        

import src.com.horario.dominio.Ciclo;
import src.com.horario.dominio.Docente;
import src.com.horario.dominio.MallaCurricular;
import src.com.horario.dominio.Materia;               
import src.com.horario.dominio.Periodo;
import src.com.horario.dominio.Semestre;
import src.com.horario.dominio.Hora;  
import src.com.horario.dominio.HorarioMalla;

import src.com.horario.dominio.repository.CicloRepository;       
import src.com.horario.dominio.repository.DocenteRepository;       
import src.com.horario.dominio.repository.MallaCurricularRepository;
import src.com.horario.dominio.repository.MateriaRepository;
import src.com.horario.dominio.repository.PeriodoRepository;
import src.com.horario.dominio.repository.SemestreRepository;    
import src.com.horario.dominio.repository.HorarioRepository; 

public class Main {

 
    public static void main(String[] args) {
        
       
    
    
        Scanner entrada =new Scanner (System.in);
        int i=0,j=0,s=0;
        
              
       HorarioRepository horariorepository =new HorarioRepository();
        ArrayList<HorarioMalla> horarios = new ArrayList<>();
        
       // se ingresa 1 porq litardo tiene el id de 1
       
        horarios = horariorepository.getHorarioxDocente(1
        );
         
        for (HorarioMalla horario:horarios){
            System.out.println(" docente:"+ horario.getDocente().getNombre()
            +"\n dias: "+horario.getDia().getDescripcion() +"\n hora: "+horario.getHora()
            +"\n semestre: "+horario.getMalla().getId_semestre().getDescripcion()
            +"\n materia: "+horario.getMalla().getId_materia().getNombre()
            +"\n jornada: "+horario.getJornada().getDescripcion()
            +"\n------------------------------"
            
            );
        } 
         
    
        
        
         
   
        
        
    }
    
    
    
    
    
}
