
package src.com.horario.dominio.repository;

import src.com.horario.dominio.Semestre;
import java.util.ArrayList;


public class SemestreRepository {
   
    public ArrayList <Semestre> semestres= new ArrayList<>();
    
    public SemestreRepository(){
        Semestre primer1 = new Semestre(1,"Primer Semestre");
        Semestre segundo2 = new Semestre (2,"Segundo Semestre");
        Semestre tercer3 = new Semestre(3," Tercer Semestre");
        Semestre cuarto4 = new Semestre (4," Cuarto Semestre");
        Semestre quinto5 = new Semestre(5," Quinto Semestre");
        Semestre sexto6 = new Semestre (6," Sexto Semestre");
        Semestre septimo7 = new Semestre(7," SeptimoSemestre");
        Semestre octavo8 = new Semestre (8," Octavo Semestre");
        Semestre noveno9 = new Semestre(9," Noveno Semestre");
        Semestre decimo10 = new Semestre (10," Decimo Semestre");
        
        semestres.add(primer1);
        semestres.add(segundo2);
        semestres.add(tercer3);
        semestres.add(cuarto4);
        semestres.add(quinto5);
        semestres.add(sexto6);
        semestres.add(septimo7);
        semestres.add(octavo8);
        semestres.add(noveno9);
        semestres.add(decimo10);
        
        
    }
            
            
    public Semestre ingreso(Semestre semestre){
            semestres.add(semestre);
            return semestre;
    }
    
    public void modificar(Semestre semestre){
        Semestre result = getSemestre(semestre.getId_semestre());
        result.setDescripcion(semestre.getDescripcion());
        
    }
    
    public void eliminar(int id_semestre){
        Semestre result = getSemestre(id_semestre);
        semestres.remove(result);
        
    }
            
    public Semestre getSemestre(int id_semestre){
        Semestre result=null;
        for(Semestre semestre:semestres){
            if(semestre.getId_semestre()==id_semestre){
                result =semestre;
                break;
            }
        }
        return result;
    }
    
    public Semestre getSemestre(String descripcion){
        Semestre result =null;
        for(Semestre semestre:semestres){
            if(semestre.getDescripcion().equals(descripcion)){
               result=semestre;
               break;
            }
        }
            
        return result;
    }
}
