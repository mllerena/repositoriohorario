
package src.com.horario.dominio.repository;
//Proyecto de la Malla Curricular
//Estudiantes de Tercer semestre 
// Jenniffer Pincay 
// Rolando Mestanza
// Jefferson Castro

import src.com.horario.dominio.Docente;
import java.util.ArrayList;

public class DocenteRepository {
    
    public ArrayList<Docente> docentes = new ArrayList<>();
    
    public DocenteRepository(){
        Docente J1 = new Docente(1,"Julio Litardo");
        Docente J2 = new Docente(2,"Tanya Huano");
        Docente J3 = new Docente(3,"Alcivar Cesar");
        Docente J4 = new Docente(4,"Aguilera Silvia");
        Docente J5 = new Docente(5,"Bautista Eladio");
        Docente J6 = new Docente(6,"Bello Yadira");
        Docente J7 = new Docente(7,"Bustamante Cesar");
        Docente J8 = new Docente(8,"Cesar FrankLin");
        Docente J9 = new Docente(9,"Cadena Jorge");
        Docente J10 = new Docente(10," Caicedo José ");
        Docente J11= new Docente(11,"Carvache  Orly");
        Docente J12 = new Docente(12,"Del Pino David");
        Docente J13 = new Docente(13," Figueroa  Stalyn");
        Docente J14= new Docente(14," Garcés Felipe ");
        Docente J15= new Docente(15," García Juan Carlos ");
        Docente J16= new Docente(16," Garzón Mao ");
        Docente J17 = new Docente(17,"  González Otto ");
        Docente J18= new Docente(18,"Guales  Isabel");
        Docente J19 = new Docente(19," Guerrero Arellano Helen ");
        Docente J20 = new Docente(20," Guerrero Zambrano Erick");
        Docente J21= new Docente(21,"  Hernández José  ");
        Docente J22= new Docente(22," Huaca Francisco ");
        Docente J23= new Docente(23,"Jaramillo Maria Mercedes");
        Docente J24= new Docente(24,"Lino Katty ");
        Docente J25 = new Docente(25,"Litardo  Julio");
        Docente J26 = new Docente(26,"  Martínez Enrique");
        Docente J27= new Docente(27," Mora Marietta");
        Docente J28= new Docente(28," Moreno  Victor Hugo  ");
        Docente J29= new Docente(29,"  Muñoz César ");
        Docente J30 = new Docente(30,"  Ramos  David  ");
        Docente J31= new Docente(31,"Toapanta  Mariuxi ");
        Docente J32 = new Docente(32," Triviño  Francisco ");
        Docente J33 = new Docente(33,"  Varas Michelle  ");
        Docente J34= new Docente(34,"  Villacis Ulises ");
        Docente J35= new Docente(35,"  Villota Wellington ");
        Docente J36 = new Docente(36,"  Zapata  Sandra  ");
        
        
        docentes.add(J1);
        docentes.add(J2);
        docentes.add(J3);
        docentes.add(J4);
        docentes.add(J5);
        docentes.add(J6);
        docentes.add(J7);
        docentes.add(J8);
        docentes.add(J9);
        docentes.add(J10);
        docentes.add(J11);
        docentes.add(J12);
        docentes.add(J13);
        docentes.add(J14);
        docentes.add(J15);
        docentes.add(J16);
        docentes.add(J17);
        docentes.add(J18);
        docentes.add(J19);
        docentes.add(J20);
        docentes.add(J21);
        docentes.add(J22);
        docentes.add(J23);
        docentes.add(J24);
        docentes.add(J25);
        docentes.add(J26);
        docentes.add(J27);
        docentes.add(J28);
        docentes.add(J29);
        docentes.add(J30);
        docentes.add(J31);
        docentes.add(J32);
        docentes.add(J33);
        docentes.add(J34);
        docentes.add(J35);
    }
    public Docente ingreso(Docente docente){
          docentes.add(docente);
          return docente;
        
    }
    
    public void modificar(Docente docente){
        Docente result=getDocente(docente.getId());
        result.setNombre(docente.getNombre());
        
    }
   
    public void eliminar(int  id_docente){
        Docente result=getDocente(id_docente);
        docentes.remove(result);
        
    }
    
    public Docente getDocente(int id_docente){
        Docente result=null;
        for(Docente docente:docentes){
            if(docente.getId()==id_docente){
                result=docente;
                break;
            }
        }
        return result;
    }
    
    public Docente getDocente(String nombre){
        Docente result=null;
        for(Docente docente:docentes){
            if(docente.getNombre().equals(nombre)){
                result=docente;
                break;
            }
            
        }
        return result;
    }
    
}
