
package src.com.horario.dominio.repository;

import src.com.horario.dominio.Hora;
import java.util.ArrayList;

public class HoraRepository {
    
    ArrayList <Hora> horas = new ArrayList<>();
    
    public HoraRepository(){
         
        Hora k1= new Hora (1,"7:00 a 9:00");
        Hora k2= new Hora (2,"9:00 a 11:00");
        Hora k3= new Hora (3,"11:00 a 13:00");
        Hora k4= new Hora (4,"12:00 a 14:00");
        Hora k5= new Hora (5,"14:00 a 16:00");
        Hora k6= new Hora (6,"16:00 a 18:00");
        Hora k7= new Hora (7,"18:00 a 20:00");
        Hora k8 = new Hora (8,"20:00 a 22:00");
        Hora k9 = new Hora (9,"8:00 a 10:00");
        Hora k10= new Hora (10,"10:00 a 12:00");
       
        
  
        horas.add(k1);
        horas.add(k2);
        horas.add(k3);
        horas.add(k4);
        horas.add(k5);
        horas.add(k6);
        horas.add(k7);
        horas.add(k8);
        horas.add(k9);
        horas.add(k10);
        
       
    }
    
   public Hora ingreso(Hora hora){
         horas.add(hora);
         return hora;
    }
    
   public void modificar(Hora hora){
       Hora result=getHora(hora.getId_hora());
       result.setDescripcion(hora.getDescripcion());
       
   } 
   
   public void eliminar(int id_hora){
       Hora result= getHora(id_hora);
       horas.remove(result);
   }
   
   public Hora getHora(int id_hora){
      Hora result=null; 
      for(Hora hora:horas){
          if(hora.getId_hora()==id_hora){
              result=hora;
              break;
          }
      }
      return result;
   }
   
   public Hora getHora(String descripcion){
       Hora result=null;
       for(Hora hora:horas){
           if(hora.getDescripcion().equals(descripcion)){
               result=hora;
               break;
           }
       }
       return result;
   }
    
    
}

    

