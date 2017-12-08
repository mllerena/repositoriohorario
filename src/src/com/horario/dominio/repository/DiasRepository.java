
package src.com.horario.dominio.repository;

import src.com.horario.dominio.Dias;
import java.util.ArrayList;


public class DiasRepository {
    
    public ArrayList<Dias>dias = new ArrayList<>();
    
    public DiasRepository(){
        Dias p1 =new Dias (1,"Lunes 1");
        Dias p2 =new Dias (2,"Martes 2");
        Dias p3 =new Dias (3,"Miercoles 3");
        Dias p4 =new Dias (4,"Jueves 4");
        Dias p5 =new Dias (5," Viernes 5");
        Dias p6 =new Dias (6," Sabado 6");
        Dias p7 =new Dias (7," Domingo7");
        
        dias.add(p1);
        dias.add(p2);
        dias.add(p3);
        dias.add(p4);
        dias.add(p5);
        dias.add(p6);
        dias.add(p7);
        
     }
    
    public Dias ingreso(Dias dia){
         dias.add (dia);
         return dia;
     }
    
    public void modificar(Dias dia){
        Dias result=getDias(dia.getId_dia());
        result.setDescripcion(dia.getDescripcion());
        
        
    }
    public void eliminar(int id_dias){
        Dias result=getDias(id_dias);
        dias.remove(result);
    }
            
    public Dias getDias(int id_dias){
        Dias result=null;
        for(Dias dia:dias){
            if(dia.getId_dia()==id_dias){
                result=dia;
                break;
            }
        }
        return result;
    }
    
    public Dias getDias(String descripcion){
        Dias result=null;
        for(Dias dia:dias){
            if(dia.getDescripcion().equals(descripcion)){
                result= dia;
            }
        }
        return result;
    }
    
    
    
}

