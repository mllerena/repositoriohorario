
package src.com.horario.dominio.repository;

import src.com.horario.dominio.Materia;
import java.util.ArrayList;


public class MateriaRepository {
    
    public ArrayList<Materia>materias =new ArrayList<>();
    
    public MateriaRepository(){
        //primer semestre
        Materia primerA1 = new Materia(1," Fundamenta de Computacion  I",4);
        Materia primerB1 = new Materia(2,"Contabilidad I",4);
        Materia primerC1 = new Materia(3,"Matematica aplicada I",6);
        Materia primerD1 = new Materia(4," Fundamento de la programacion I",6);
        Materia primerE1 = new Materia(5," Fundamenta Administrativa y Tecnica de Analisis I",4);
        Materia primerF1 = new Materia(6,"Expresion Oral y Escrita I",2);
        //Segundo Semestre
        Materia segundoA2 = new Materia(7," Matematica Aplicada II ",6);
        Materia segundoB2 = new Materia(8," Contabilidad  II ",4);
        Materia segundoC2= new Materia(9," Fundamenta de Computacion  II",4);
        Materia segundoD2 = new Materia(10," Fundamento de la programacion II",6);
        Materia segundoE2 = new Materia(11," Fundamenta Administrativa y Tecnica de Analisis II",4);
        Materia segundoF2 = new Materia(12,"Expresion Oral y Escrita II",2);
        // Tercer semestre
        Materia tercerA3 = new Materia(13," Base de datos y procesamiento de archivo I ",4);
        Materia tercerB3 = new Materia(14," Analisis y desiseño documento de sistema I ",4);
        Materia tercerC3 = new Materia(15," Programacion II",6);
        Materia tercerD3 = new Materia(16," Estructura de datos I",4);
        Materia tercerE3 = new Materia(17," Sistema Operativos I ",4);
        Materia tercerF3 = new Materia(18," Mantenimiento y Emsanblaje I",2);
        Materia tercerH3 = new Materia(19," Ingles I ",3);
        // Cuarto semestre
        Materia cuartoA4 = new Materia(20," Base de datos y Procesamiento de archivo II ",4);
        Materia cuartoB4 = new Materia(21," Analisis y desiseño documento de sistema II ",4);
        Materia cuartoC4 = new Materia(22," Programacion III",6);
        Materia cuartoD4 = new Materia(23," Estructura de datos II",4);
        Materia cuartoE4 = new Materia(24," Sistema Operativos II",4);
        Materia cuartoF4 = new Materia(25," Mantenimiento y Emsanblaje II",2);
        Materia cuartoH4 = new Materia(26," Ingles II",3);
        // Quinto  semestre
        Materia quintoA5 = new Materia(27," Matematica  Financiera I ",4);
        Materia quintoB5 = new Materia(28," Auditoria de evaluacion de sistema I ",4);
        Materia quintoC5= new Materia(29," Redes de computadoras I",4);
        Materia quintoD5 = new Materia(30," Programcion IV",6);
        Materia quintoE5 = new Materia(31," Progromacion orientada a Objeto I",4);
        Materia quintoF5 = new Materia(32," Topicos de informaticas I ",4);
        Materia quintoH5 = new Materia(33," Ingles III",3);
        // Sexto semestre
        Materia sextoA6 = new Materia(34," Ingles IV",3);
        Materia sextoB6 = new Materia(35," Auditoria de evaluacion de sistema II ",4);
        Materia sextoC6= new Materia(36," Redes de computadoras II",4);
        Materia sextoD6 = new Materia(37," Programcion V",6);
        Materia sextoE6 = new Materia(38," Progromacion orientada a Objeto II",4);
        Materia sextoF6 = new Materia(39," Topicos de informaticas II ",4);
        Materia sextoH6 = new Materia(40," Matematicas Financiera II",4);
        // Septimo semestre
        Materia septimoA7 = new Materia(41," Finanzas I",4);
        Materia septimoB7 = new Materia(42," Gestion de la calidad I",4);
        Materia septimoC7= new Materia(43," Estadistica Computarizada ",4);
        Materia septimoD7 = new Materia(44,"Organizacion y  metodos ",4);
        Materia septimoE7= new Materia(45," Marketing para desarrolladores de sotfware ",4);
        Materia septimoF7 = new Materia(46," Redes y telecomunicaciones ",4);
        // Octavo semestre
        Materia octavoA8 = new Materia(47," Finanzas II",4);
        Materia octavoB8 = new Materia(48," Auditoria de sistemas de informacion I",4);
        Materia octavoC8 = new Materia(49," Modelos estadisticos y simulacion ",4);
        Materia octavoD8 = new Materia(50," Planeacion y control de proyecto ",4);
        Materia octavoE8 = new Materia(51," Administracion de operaciones ",4);
        Materia octavoF8 = new Materia(52," Sistemas de informacion",4);
        Materia octavoh8 = new Materia(53," Topicos de graduacion ",2);
        //Noveno semestre
        Materia novenoA9 = new Materia(54," Estadisticas Aplicada a la investigacion ",0);
        Materia novenoB9 = new Materia(55," Metodologia de la investigacion",0);
        Materia novenoC9 = new Materia(56," Base de datos No SQL ",0);
        Materia novenoD9 = new Materia(57," Seguridad de informaticas ",0);
        Materia novenoE9 = new Materia(58," Administracion de Proceso de negocio",0);
        //decimo semestre
        Materia decimoA10 = new Materia(59," Vinculacion con la comunidad  ",10);
        // 10P
       Materia decimoB10 = new Materia(60," Practicas profesionales  ",15);
        Materia decimoC10= new Materia(61," Titulacion",160);
        
        
        materias.add(primerA1);
        materias.add(primerB1);
        materias.add(primerC1);
        materias.add(primerD1);
        materias.add(primerE1);
        materias.add(primerF1);
        
        materias.add(segundoA2);
        materias.add(segundoB2);
        materias.add(segundoC2);
        materias.add(segundoD2);
        materias.add(segundoE2);
        materias.add(segundoF2);
        
        materias.add(tercerA3);
        materias.add(tercerB3);
        materias.add(tercerC3);
        materias.add(tercerD3);
        materias.add(tercerE3);
        materias.add(tercerF3);
        materias.add(tercerH3);

        materias.add(cuartoA4);
        materias.add(cuartoB4);
        materias.add(cuartoC4);
        materias.add(cuartoD4);
        materias.add(cuartoE4);
        materias.add(cuartoF4);
        materias.add(cuartoH4);
        
        materias.add(quintoA5);
        materias.add(quintoB5);
        materias.add(quintoC5);
        materias.add(quintoD5);
        materias.add(quintoE5);
        materias.add(quintoF5);
        materias.add(quintoH5);
        
        materias.add(sextoA6);
        materias.add(sextoB6);
        materias.add(sextoC6);
        materias.add(sextoD6);
        materias.add(sextoE6);
        materias.add(sextoF6);
        materias.add(sextoH6);
        
        materias.add(septimoA7);
        materias.add(septimoB7);
        materias.add(septimoC7);
        materias.add(septimoD7);
        materias.add(septimoE7);
        materias.add(septimoF7);
        
        materias.add(octavoA8);
        materias.add(octavoB8);
        materias.add(octavoC8);
        materias.add(octavoD8);
        materias.add(octavoE8);
        materias.add(octavoF8);
        materias.add(octavoh8);
        
        materias.add(novenoA9);
        materias.add(novenoB9);
        materias.add(novenoC9);
        materias.add(novenoD9);
        materias.add(novenoE9);
        
        materias.add(decimoA10);
        
        materias.add(decimoB10);
        materias.add(decimoC10);
        
        
        
        
        
        
    }
    
    public Materia ingreso(Materia materia){
		materias.add(materia);
		return materia;
	}
    
    public void modificar(Materia materia){
        Materia result=getMateria(materia.getId_materia());
        result.setNombre(materia.getNombre());
    }
    
    public void elimimar(int id_materia){
           Materia result= getMateria(id_materia);
           materias.remove(result);
    }
    
    
    public Materia getMateria(int id_materia){
        Materia result=null;
        for (Materia materia:materias){
             if(materia.getId_materia()==id_materia){
                 result=materia;
                 break;
             }
        }
        return result;
    }
    
    public Materia getMateria(String nombre){
        Materia result=null;
        for(Materia materia:materias){
            if(materia.getNombre().equals(nombre)){
                result=materia;
                break;
            }
        }
        return result;
    }
}
