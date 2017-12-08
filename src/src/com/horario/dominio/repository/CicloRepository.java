package src.com.horario.dominio.repository;
//Proyecto de la Malla Curricular
//Estudiantes de Tercer semestre 
// Jenniffer Pincay 
// Rolando Mestanza
// Jefferson Castro

import src.com.horario.dominio.Ciclo;
import java.util.ArrayList;


public class CicloRepository {
    
    public ArrayList<Ciclo>ciclos = new ArrayList<>();
    
    public CicloRepository(){
        Ciclo j1=new Ciclo(1,"Ciclo 1");
        Ciclo j2=new Ciclo(2,"Ciclo 2");
        
        ciclos.add(j1);
        ciclos.add(j2);
     }
    
    public Ciclo ingreso(Ciclo ciclo){
         ciclos.add(ciclo);
         return ciclo;
     }
    
    public void modificar(Ciclo ciclo){
        Ciclo result=getCiclo(ciclo.getId());
        result.setDescripcion(ciclo.getDescripcion());
        
        
    }
    public void eliminar(int id_ciclo){
        Ciclo result=getCiclo(id_ciclo);
        ciclos.remove(result);
    }
            
    public Ciclo getCiclo(int id_ciclo){
        Ciclo result=null;
        for(Ciclo ciclo:ciclos){
            if(ciclo.getId()==id_ciclo){
                result=ciclo;
                break;
            }
        }
        return result;
    }
    
    public Ciclo getCiclo(String descripcion){
        Ciclo result=null;
        for(Ciclo ciclo:ciclos){
            if(ciclo.getDescripcion().equals(descripcion)){
                result=ciclo;
            }
        }
        return result;
    }
    
    
    
}
