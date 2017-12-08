
package src.com.horario.dominio.repository;

import src.com.horario.dominio.Jornada;
import java.util.ArrayList;


public class JornadaRepository {
    

    public ArrayList<Jornada>jornadas =new ArrayList<>();
    
    public JornadaRepository(){
       
        Jornada j1 = new Jornada(1,"Matutina 1");
        Jornada j2 = new Jornada(2,"Vespertina 2");
        Jornada j3 = new Jornada(3,"Nocturna 3");
        
        
        jornadas.add(j1);
        jornadas.add(j2);
        jornadas.add(j3);
        
    }
    
    public Jornada ingreso(Jornada jornada){
		jornadas.add(jornada);
		return jornada;
	}
    
    public void modificar(Jornada jornada){
        Jornada result=getJornada(jornada.getId_jornada());
        result.setDescripcion(jornada.getDescripcion());
    }
    
    public void elimimar(int id_jornada){
           Jornada result= getJornada(id_jornada);
           jornadas.remove(result);
    }
    
    
    public Jornada getJornada(int id_jornada){
        Jornada result=null;
        for (Jornada jornada:jornadas){
             if(jornada.getId_jornada()==id_jornada){
                 result=jornada;
                 break;
             }
        }
        return result;
    }
    
    public Jornada getJornada(String descripcion){
        Jornada result=null;
        for(Jornada jornada:jornadas){
            if(jornada.getDescripcion().equals(descripcion)){
                result=jornada;
                break;
            }
        }
        return result;
    }
}


