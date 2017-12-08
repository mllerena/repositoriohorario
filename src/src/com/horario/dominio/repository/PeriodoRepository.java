
package src.com.horario.dominio.repository;
import src.com.horario.dominio.Periodo;
import java.util.ArrayList;


public class PeriodoRepository {
    
    ArrayList <Periodo> periodos = new ArrayList<>();
    
    public PeriodoRepository(){
        Periodo j1= new Periodo(1,"2016-2017");
        Periodo j2= new Periodo(2,"2017-2018");
        Periodo j3= new Periodo(3,"2018-2019");
        Periodo j4= new Periodo(4,"2019-2020");
        Periodo j5= new Periodo(5,"2020-2021");
        
        periodos.add(j1);
        periodos.add(j2);
        periodos.add(j3);
        periodos.add(j4);
        periodos.add(j5);
       
    }
    
   public Periodo ingreso(Periodo periodo){
         periodos.add(periodo);
         return periodo;
    }
    
   public void modificar(Periodo periodo){
       Periodo result=getPeriodo(periodo.getId_periodo());
       result.setDescripcion(periodo.getDescripcion());
       
   } 
   
   public void eliminar(int id_periodo){
       Periodo result= getPeriodo(id_periodo);
       periodos.remove(result);
   }
   
   public Periodo getPeriodo(int id_periodo){
      Periodo result=null; 
      for(Periodo periodo:periodos){
          if(periodo.getId_periodo()==id_periodo){
              result=periodo;
              break;
          }
      }
      return result;
   }
   
   public Periodo getPeriodo(String descripcion){
       Periodo result=null;
       for(Periodo periodo:periodos){
           if(periodo.getDescripcion().equals(descripcion)){
               result=periodo;
               break;
           }
       }
       return result;
   }
    
    
}
