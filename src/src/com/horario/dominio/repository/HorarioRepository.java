
package src.com.horario.dominio.repository;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import src.com.horario.dominio.Hora;
import src.com.horario.dominio.HorarioMalla;
import src.com.horario.dominio.Dias;
import src.com.horario.dominio.Jornada;
import src.com.horario.dominio.Docente;
import src.com.horario.dominio.MallaCurricular;

public class HorarioRepository {
    
    ArrayList <HorarioMalla>horarios = new ArrayList<>();
    
   public HorarioRepository(){
       
    

    DiasRepository dia =new DiasRepository ();
    DocenteRepository doc = new DocenteRepository ();
    JornadaRepository  jor= new JornadaRepository ();
    MallaCurricularRepository mallarepository = new MallaCurricularRepository();
    HoraRepository hra=new HoraRepository();
    
     MallaCurricular malla1 = mallarepository.getMallaCurricular(1);
        MallaCurricular malla2 = mallarepository.getMallaCurricular(2);
        MallaCurricular malla3 = mallarepository.getMallaCurricular(3);
        MallaCurricular malla4 = mallarepository.getMallaCurricular(4);
        MallaCurricular malla5 = mallarepository.getMallaCurricular(5);
        MallaCurricular malla6 = mallarepository.getMallaCurricular(6);
        MallaCurricular malla7 = mallarepository.getMallaCurricular(7);
        MallaCurricular malla8 = mallarepository.getMallaCurricular(8);
        MallaCurricular malla9 = mallarepository.getMallaCurricular(9);
        MallaCurricular malla10 = mallarepository.getMallaCurricular(10);
        MallaCurricular malla11 = mallarepository.getMallaCurricular(11);
        MallaCurricular malla12 = mallarepository.getMallaCurricular(12);
        MallaCurricular malla13 = mallarepository.getMallaCurricular(13);
        MallaCurricular malla14 = mallarepository.getMallaCurricular(14);
        MallaCurricular malla15 = mallarepository.getMallaCurricular(15);
        MallaCurricular malla16 = mallarepository.getMallaCurricular(16);
        MallaCurricular malla17 = mallarepository.getMallaCurricular(17);
        MallaCurricular malla18 = mallarepository.getMallaCurricular(18);
        MallaCurricular malla19 = mallarepository.getMallaCurricular(19);
        MallaCurricular malla20 = mallarepository.getMallaCurricular(20);
        MallaCurricular malla21 = mallarepository.getMallaCurricular(21);
        MallaCurricular malla22 = mallarepository.getMallaCurricular(22);
        MallaCurricular malla23 = mallarepository.getMallaCurricular(23);
        MallaCurricular malla24 = mallarepository.getMallaCurricular(24);
        MallaCurricular malla25 = mallarepository.getMallaCurricular(25);
        MallaCurricular malla26 = mallarepository.getMallaCurricular(26);
        MallaCurricular malla27 = mallarepository.getMallaCurricular(27);
        MallaCurricular malla28 = mallarepository.getMallaCurricular(28);
        MallaCurricular malla29 = mallarepository.getMallaCurricular(29);
        MallaCurricular malla30 = mallarepository.getMallaCurricular(30);
        MallaCurricular malla31 = mallarepository.getMallaCurricular(31);
        MallaCurricular malla32 = mallarepository.getMallaCurricular(32);
        MallaCurricular malla33 = mallarepository.getMallaCurricular(33);
        MallaCurricular malla34 = mallarepository.getMallaCurricular(34);
        MallaCurricular malla35 = mallarepository.getMallaCurricular(35);
        MallaCurricular malla36 = mallarepository.getMallaCurricular(36);
        MallaCurricular malla37 = mallarepository.getMallaCurricular(37);
        MallaCurricular malla38 = mallarepository.getMallaCurricular(38);
        MallaCurricular malla39 = mallarepository.getMallaCurricular(39);
        MallaCurricular malla40 = mallarepository.getMallaCurricular(40);
        MallaCurricular malla41 = mallarepository.getMallaCurricular(41);
        MallaCurricular malla42 = mallarepository.getMallaCurricular(42);
        MallaCurricular malla43 = mallarepository.getMallaCurricular(43);
        MallaCurricular malla44 = mallarepository.getMallaCurricular(44);
        MallaCurricular malla45 = mallarepository.getMallaCurricular(45);
        MallaCurricular malla46 = mallarepository.getMallaCurricular(46);
        MallaCurricular malla47 = mallarepository.getMallaCurricular(47);
        MallaCurricular malla48 = mallarepository.getMallaCurricular(48);
        MallaCurricular malla49 = mallarepository.getMallaCurricular(49);
        MallaCurricular malla50 = mallarepository.getMallaCurricular(50);
        MallaCurricular malla51 = mallarepository.getMallaCurricular(51);
        MallaCurricular malla52 = mallarepository.getMallaCurricular(52);
        MallaCurricular malla53 = mallarepository.getMallaCurricular(53);
        MallaCurricular malla54 = mallarepository.getMallaCurricular(54);
        MallaCurricular malla55 = mallarepository.getMallaCurricular(55);
        MallaCurricular malla56 = mallarepository.getMallaCurricular(56);
        MallaCurricular malla57 = mallarepository.getMallaCurricular(57);
        MallaCurricular malla58 = mallarepository.getMallaCurricular(58);
     
        // obtengo la jornada
    Jornada j1 = jor.getJornada(1);//Jornada matutina
        Jornada j2 = jor.getJornada(2);//Jornada vespertina
        Jornada j3 = jor.getJornada(3);//Jornada Nocturna
    
        
     
     // obtengo los docentes 
   Docente do1 = doc.getDocente(1);
        Docente do2 = doc.getDocente(2);
        Docente do3 = doc.getDocente(3);
        Docente do4 = doc.getDocente(4);
        Docente do5 = doc.getDocente(5);
        Docente do6 = doc.getDocente(6);
        Docente do7 = doc.getDocente(7);
        Docente do8 = doc.getDocente(8);
        Docente do9 = doc.getDocente(9);
        Docente do10 = doc.getDocente(10);
        Docente do11 = doc.getDocente(11);
        Docente do12 = doc.getDocente(12);
        Docente do13 = doc.getDocente(13);
        Docente do14 = doc.getDocente(14);
        Docente do15 = doc.getDocente(15);
        Docente do16 = doc.getDocente(16);
        Docente do17 = doc.getDocente(17);
        Docente do18 = doc.getDocente(18);
        Docente do19 = doc.getDocente(19);
        Docente do20 = doc.getDocente(20);
        Docente do21 = doc.getDocente(21);
        Docente do22 = doc.getDocente(22);
        Docente do23 = doc.getDocente(23);
        Docente do24 = doc.getDocente(24);
        Docente do25 = doc.getDocente(25);
        Docente do26 = doc.getDocente(26);
        Docente do27 = doc.getDocente(27);
        Docente do28 = doc.getDocente(28);
        Docente do29 = doc.getDocente(29);
        Docente do30 = doc.getDocente(30);
        Docente do31 = doc.getDocente(31);
        Docente do32 = doc.getDocente(32);
        Docente do33 = doc.getDocente(33);
        Docente do34 = doc.getDocente(34);
        Docente do35 = doc.getDocente(35);
     
   // obtengo los dias
        Dias dia1 = dia.getDias(1);
        Dias dia2 = dia.getDias(2);
        Dias dia3 = dia.getDias(3);
        Dias dia4 = dia.getDias(4);
        Dias dia5 = dia.getDias(5);
        Dias dia6 = dia.getDias(6);
        Dias dia7 = dia.getDias(7);
    
     
        
        
      // obtengo las horas 
   /* Hora hr1 = hra.getHora(1);
    Hora hr2 = hra.getHora(2);
    Hora hr3 = hra.getHora(3);
    Hora hr4 = hra.getHora(4);
    Hora hr5 = hra. getHora(5);
    Hora hr6 = hra.getHora(6);
    Hora hr7 = hra.getHora(7);
    Hora hr8 = hra.getHora(8);
    Hora hr9 = hra.getHora(9);
    Hora hr10 = hra. getHora(10)*/
    
    
       
     // Matutina 
     
      EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProgramacionHorarioPU");
    EntityManager manager = factory.createEntityManager();   
       
    EntityTransaction tx = manager.getTransaction();
    tx.begin(); 
     
     
        horarios.add(new HorarioMalla(1, malla51, j3, do1, 1, dia1 , "20:00 pm - 22:00 pm"));
        horarios.add(new HorarioMalla(2, malla14, j3, do1, 1, dia2, "20:00 pm -22:00 pm"));
        horarios.add(new HorarioMalla(3, malla45, j3, do1, 1, dia3, "20:00pm - 22:00pm")); //0
        horarios.add(new HorarioMalla(4, malla14, j3, do1, 1, dia4, "20:00pm - 22:00 pm ")); //0
        horarios.add(new HorarioMalla(5, malla14, j3, do1, 1, dia5, "18:00pm - 20:00 pm ")); //0
        horarios.add(new HorarioMalla(6, malla51, j3, do1, 1, dia5, "20:00pm - 22:00 pm ")); //0

        //                      DOCENTE 2
        horarios.add(new HorarioMalla(1, malla22, j1, do2, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla15, j1, do2, 1, dia1, "9:00 am -11:00 am"));
        horarios.add(new HorarioMalla(3, malla15, j1, do2, 1, dia2, "7:00am - 9:00am")); //0
        horarios.add(new HorarioMalla(4, malla50, j1, do2, 1, dia2, "9:00am - 11:00 am ")); //0
        horarios.add(new HorarioMalla(5, malla22, j3, do2, 1, dia3, "20:00 pm - 22:00 pm"));
        horarios.add(new HorarioMalla(6, malla15, j3, do2, 1, dia3, "20:00pm - 22:00pm")); //0
        horarios.add(new HorarioMalla(7, malla15, j1, do2, 1, dia4, "7:00am - 9:00am")); //0
        horarios.add(new HorarioMalla(8, malla50, j1, do2, 1, dia4, "9:00am - 11:00 am ")); //0
        horarios.add(new HorarioMalla(9, malla22, j1, do2, 1, dia5, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(10, malla15, j3, do2, 1, dia5, "4:00 pm -20:00 pm"));
        horarios.add(new HorarioMalla(11, malla15, j1, do2, 1, dia6, "8:00 am -10:00 am"));

        //                      DOCENTE 3
        horarios.add(new HorarioMalla(1, malla7, j1, do3, 1, dia1, "11:00 Am - 1:00 pm"));
        horarios.add(new HorarioMalla(2, malla1, j1, do3, 1, dia2, "11:00 Am - 1:00 pm"));
        horarios.add(new HorarioMalla(3, malla7, j1, do3, 1, dia3, "11:00 Am - 1:00 pm"));
        horarios.add(new HorarioMalla(4, malla1, j1, do3, 1, dia3, "9:00 Am - 11:00 am"));
        horarios.add(new HorarioMalla(5, malla1, j1, do3, 1, dia5, "9:00 Am - 11:00 am"));
        horarios.add(new HorarioMalla(6, malla7, j1, do3, 1, dia5, "11:00 Am - 1:00 pm"));

        //                      DOCENTE 4
        horarios.add(new HorarioMalla(1, malla1, j2, do4, 1, dia1, "16:00 pm - 18:00 pm"));
        horarios.add(new HorarioMalla(2, malla14, j2, do4, 1, dia3, "12:00 pm - 14:00 pm"));
        horarios.add(new HorarioMalla(3, malla1, j2, do4, 1, dia4, "16:00 pm - 18:00 pm"));
        horarios.add(new HorarioMalla(4, malla14, j2, do4, 1, dia5, "12:00 pm - 14:00 pm"));
        horarios.add(new HorarioMalla(5, malla1, j1, do4, 1, dia6, "10:00 am - 12:00 pm"));

        //                      DOCENTE 5
        horarios.add(new HorarioMalla(1, malla23, j1, do5, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla11, j1, do5, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla16, j1, do5, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(4, malla23, j1, do5, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla11, j1, do5, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(6, malla16, j1, do5, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 6
        horarios.add(new HorarioMalla(1, malla11, j3, do6, 1, dia1, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(2, malla44, j1, do6, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla44, j3, do6, 1, dia2, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(4, malla42, j1, do6, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla44, j1, do6, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(6, malla42, j1, do6, 1, dia5, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(7, malla44, j3, do6, 1, dia5, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(8, malla11, j1, do6, 1, dia6, "10:00 Am - 12:00 Pm"));

        //                      DOCENTE 7
        horarios.add(new HorarioMalla(1, malla46, j3, do7, 1, dia2, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla58, j3, do7, 1, dia2, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(3, malla58, j3, do7, 1, dia3, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(4, malla46, j3, do7, 1, dia4, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(5, malla53, j1, do7, 1, dia6, "8:00 Am - 10:00 Am"));
        horarios.add(new HorarioMalla(6, malla53, j1, do7, 1, dia6, "10:00 Am - 112:00 Am"));

        //                      DOCENTE 8
        horarios.add(new HorarioMalla(1, malla30, j1, do8, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla15, j1, do8, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(3, malla15, j1, do8, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(4, malla30, j1, do8, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla15, j1, do8, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(6, malla30, j1, do8, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 9
        horarios.add(new HorarioMalla(1, malla7, j3, do9, 1, dia3, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(1, malla49, j3, do9, 1, dia4, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(1, malla49, j3, do9, 1, dia5, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(1, malla7, j3, do9, 1, dia5, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(1, malla7, j2, do9, 1, dia3, "12:00 Am - 2:00 Pm"));

        //                      DOCENTE 10
        horarios.add(new HorarioMalla(1, malla45, j1, do10, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla17, j1, do10, 1, dia1, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(1, malla24, j1, do10, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla17, j2, do10, 1, dia2, "12:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(1, malla45, j1, do10, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla24, j1, do10, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla17, j1, do10, 1, dia4, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(1, malla17, j1, do10, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 11
        horarios.add(new HorarioMalla(1, malla17, j1, do11, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla36, j2, do11, 1, dia1, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(1, malla15, j2, do11, 1, dia1, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(1, malla29, j1, do11, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla17, j1, do11, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla15, j2, do11, 1, dia3, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(1, malla29, j1, do11, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(1, malla36, j1, do11, 1, dia5, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(1, malla15, j2, do11, 1, dia5, "14:00 Pm - 16:00 Pm"));

        //                      DOCENTE 12
        horarios.add(new HorarioMalla(1, malla54, j2, do12, 1, dia1, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla54, j2, do12, 1, dia4, "18:00 Pm - 20:00 Pm"));

        //                      DOCENTE 13
        horarios.add(new HorarioMalla(1, malla37, j1, do13, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(1, malla39, j1, do13, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(1, malla56, j3, do13, 1, dia2, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(1, malla37, j1, do13, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(1, malla56, j3, do13, 1, dia3, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(1, malla39, j1, do13, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(1, malla37, j1, do13, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 14
        horarios.add(new HorarioMalla(1, malla3, j1, do14, 1, dia1, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(2, malla13, j1, do14, 1, dia2, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(2, malla3, j1, do14, 1, dia2, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(3, malla20, j1, do14, 1, dia4, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(4, malla3, j1, do14, 1, dia5, "16:00 Am - 18:00 Pm"));

        //                      DOCENTE 15
        horarios.add(new HorarioMalla(1, malla10, j1, do15, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(2, malla32, j1, do15, 1, dia1, "11:00 Am - 13:00 Am"));
        horarios.add(new HorarioMalla(3, malla32, j1, do15, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(4, malla10, j1, do15, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(5, malla10, j1, do15, 1, dia3, "11:00 Am - 13:00 Am"));
        horarios.add(new HorarioMalla(6, malla32, j1, do15, 1, dia5, "9:00 Am - 13100 Am"));
        horarios.add(new HorarioMalla(7, malla3, j1, do14, 1, dia5, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 16  GUALES DUMES ISABEL MARITZA ojo c aki
        horarios.add(new HorarioMalla(1, malla10, j3, do16, 1, dia2, ":20:00 Pm - 22:00Ppm"));
        horarios.add(new HorarioMalla(2, malla42, j3, do16, 1, dia3, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(3, malla10, j3, do16, 1, dia4, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(4, malla12, j1, do16, 1, dia6, "8:00 Am - 10:00 Am"));
        horarios.add(new HorarioMalla(5, malla42, j1, do16, 1, dia6, "10:00 Am - 12:00 Pm"));

        //                      DOCENTE 17
        horarios.add(new HorarioMalla(1, malla18, j1, do17, 1, dia3, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(2, malla25, j1, do17, 1, dia4, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(3, malla18, j1, do17, 1, dia5, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(4, malla18, j2, do17, 1, dia6, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 18
        horarios.add(new HorarioMalla(1, malla14, j1, do18, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla38, j1, do18, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla9, j1, do18, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(4, malla14, j1, do18, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla9, j1, do18, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(6, malla38, j1, do18, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(7, malla9, j1, do18, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 19
        horarios.add(new HorarioMalla(1, malla16, j3, do19, 1, dia1, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla43, j3, do19, 1, dia1, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(3, malla43, j3, do19, 1, dia4, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(4, malla18, j1, do19, 1, dia6, "8:00 Am - 10:00 Am"));

        //                      DOCENTE 20
        horarios.add(new HorarioMalla(1, malla5, j1, do20, 1, dia1, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(2, malla7, j2, do20, 1, dia1, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(3, malla27, j1, do20, 1, dia2, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(4, malla5, j2, do20, 1, dia2, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(5, malla7, j2, do20, 1, dia2, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(6, malla5, j1, do20, 1, dia3, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(7, malla5, j2, do20, 1, dia3, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(8, malla5, j2, do20, 1, dia3, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(9, malla27, j1, do20, 1, dia5, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(10, malla5, j2, do20, 1, dia5, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(11, malla7, j2, do20, 1, dia5, "16:00 Pm - 18:00 Pm"));

        //                      DOCENTE 21 JARAMILLO CAMPOS MERCEDES
        horarios.add(new HorarioMalla(1, malla4, j2, do21, 1, dia1, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(2, malla2, j2, do21, 1, dia1, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(3, malla2, j1, do21, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(4, malla4, j2, do21, 1, dia2, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(5, malla4, j2, do21, 1, dia3, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(6, malla21, j2, do21, 1, dia3, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(7, malla2, j1, do21, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(8, malla2, j2, do21, 1, dia4, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(9, malla21, j2, do21, 1, dia5, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 22
        horarios.add(new HorarioMalla(1, malla31, j1, do22, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(2, malla16, j1, do22, 1, dia1, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(3, malla21, j1, do22, 1, dia2, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(4, malla31, j1, do22, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(5, malla16, j1, do22, 1, dia3, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(6, malla14, j1, do22, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(7, malla14, j1, do22, 1, dia5, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(8, malla21, j1, do22, 1, dia5, "9:00 Am - 11:00 Pm"));

        //                      DOCENTE 23
        horarios.add(new HorarioMalla(1, malla1, j2, do23, 1, dia1, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(2, malla9, j2, do23, 1, dia1, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(3, malla9, j2, do23, 1, dia2, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(4, malla13, j3, do23, 1, dia2, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(5, malla1, j2, do23, 1, dia3, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(6, malla9, j2, do23, 1, dia4, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(7, malla13, j3, do23, 1, dia4, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(8, malla1, j2, do23, 1, dia5, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 24
        horarios.add(new HorarioMalla(1, malla41, j3, do24, 1, dia1, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla8, j3, do24, 1, dia2, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(3, malla47, j3, do24, 1, dia3, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(4, malla8, j3, do24, 1, dia4, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(5, malla47, j1, do24, 1, dia6, "10:00 Am - 12:00 Am"));
        horarios.add(new HorarioMalla(6, malla41, j2, do24, 1, dia6, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 25 DE NIVELACION
        //                      DOCENTE 26
        horarios.add(new HorarioMalla(1, malla48, j1, do26, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla28, j1, do26, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(3, malla48, j3, do26, 1, dia2, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(4, malla48, j1, do26, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla28, j1, do26, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(6, malla48, j2, do26, 1, dia6, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 27
        horarios.add(new HorarioMalla(1, malla8, j1, do27, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla2, j2, do27, 1, dia2, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(3, malla8, j2, do27, 1, dia2, "14:00Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(4, malla8, j1, do27, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla51, j1, do27, 1, dia3, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(6, malla2, j2, do27, 1, dia4, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(7, malla8, j2, do27, 1, dia4, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(8, malla51, j1, do27, 1, dia5, "7:00 Am - 9:00 Am"));

        //                      DOCENTE 28
        horarios.add(new HorarioMalla(1, malla41, j1, do28, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla47, j1, do28, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla43, j1, do28, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(4, malla41, j1, do28, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(5, malla34, j1, do16, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(6, malla47, j1, do28, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(7, malla43, j1, do28, 1, dia4, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(5, malla34, j1, do16, 1, dia5, "9:00 Am - 11:00 Am"));

        //                      DOCENTE 29
        horarios.add(new HorarioMalla(1, malla50, j3, do29, 1, dia1, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla17, j3, do29, 1, dia1, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(3, malla50, j3, do29, 1, dia2, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(4, malla52, j3, do29, 1, dia3, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(5, malla52, j3, do29, 1, dia4, "20:00 Pm - 22:00 Pm"));
        horarios.add(new HorarioMalla(6, malla17, j3, do29, 1, dia5, "20:00 Pm - 22:00 Pm"));

        //                      DOCENTE 30
        horarios.add(new HorarioMalla(1, malla16, j2, do30, 1, dia1, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(2, malla10, j2, do30, 1, dia1, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(3, malla4, j2, do30, 1, dia1, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(4, malla16, j2, do30, 1, dia2, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(5, malla11, j2, do30, 1, dia3, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(6, malla10, j2, do30, 1, dia3, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(7, malla4, j2, do30, 1, dia4, "16:00 Pm - 18:00 Pm"));
        horarios.add(new HorarioMalla(8, malla11, j2, do30, 1, dia5, "14:00 Pm - 16:00 Pm"));

        //                      DOCENTE 31
        horarios.add(new HorarioMalla(1, malla10, j3, do31, 1, dia1, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(2, malla10, j3, do31, 1, dia3, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(3, malla46, j1, do31, 1, dia5, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(4, malla10, j3, do31, 1, dia5, "18:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(5, malla46, j1, do31, 1, dia6, "10:00 Am - 12:00 Pm"));

        //                      DOCENTE 32
        horarios.add(new HorarioMalla(1, malla6, j1, do32, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(2, malla49, j1, do32, 1, dia1, "11:00 Am - 13:00 Pm"));
        horarios.add(new HorarioMalla(3, malla4, j1, do32, 1, dia2, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(4, malla6, j1, do32, 1, dia2, "12:00 Am - 14:00 Am"));
        horarios.add(new HorarioMalla(5, malla6, j2, do32, 1, dia3, "14:00 Pm - 16:00 Pm"));
        horarios.add(new HorarioMalla(6, malla4, j1, do32, 1, dia4, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(7, malla12, j2, do32, 1, dia4, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(8, malla12, j2, do32, 1, dia5, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(2, malla49, j1, do32, 1, dia5, "11:00 Am - 13:00 Pm"));

        //                      DOCENTE 33
        horarios.add(new HorarioMalla(1, malla3, j1, do33, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla20, j1, do33, 1, dia1, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla9, j2, do33, 1, dia1, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(4, malla9, j2, do33, 1, dia2, "12:00 Pm - 14:00 Pm"));
        horarios.add(new HorarioMalla(5, malla3, j1, do33, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(6, malla20, j1, do33, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(7, malla3, j1, do33, 1, dia5, "7:00 Pm - 9:00 Pm"));
        horarios.add(new HorarioMalla(8, malla9, j2, do33, 1, dia5, "12:00 Pm - 14:00 Pm"));

        //                      DOCENTE 34
        horarios.add(new HorarioMalla(1, malla13, j1, do34, 1, dia1, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(2, malla13, j1, do34, 1, dia2, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(3, malla13, j1, do34, 1, dia3, "7:00 Am - 9:00 Am"));
        horarios.add(new HorarioMalla(4, malla52, j1, do34, 1, dia3, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(5, malla13, j1, do34, 1, dia4, "9:00 Am - 11:00 Am"));
        horarios.add(new HorarioMalla(6, malla52, j1, do34, 1, dia5, "9:00 Am - 11:00 Am"));

        //                      DOCENTE 35
        horarios.add(new HorarioMalla(1, malla26, j2, do35, 1, dia1, "11:00 Am - 14:00 Pm"));
        horarios.add(new HorarioMalla(2, malla19, j2, do35, 1, dia1, "16:00 Am - 19:00 Am"));
        horarios.add(new HorarioMalla(3, malla19, j2, do35, 1, dia2, "11:00 Am - 14:00 Pm"));
        horarios.add(new HorarioMalla(4, malla33, j2, do35, 1, dia3, "11:00 Am - 14:00 Pm"));
        horarios.add(new HorarioMalla(5, malla19, j3, do35, 1, dia3, "17:00 Pm - 20:00 Pm"));
        horarios.add(new HorarioMalla(6, malla34, j2, do35, 1, dia4, "11:00 Am - 14:00 Pm"));
        horarios.add(new HorarioMalla(7, malla19, j2, do35, 1, dia5, "11:00 Am - 14:00 Pm"));
        
        for (HorarioMalla k:  horarios){
            manager.persist(k);
        }
            
        
        tx.commit();

    }

    
   public HorarioMalla ingreso(HorarioMalla horario){
         horarios.add(horario);
         return horario;
    }
    
   public void modificar(HorarioMalla horario){
       HorarioMalla result=getHorario(horario.getId());
       result.setId(horario.getId());
       
   } 
   
   public void eliminar(int id_horario){
       HorarioMalla result= getHorario(id_horario);
       horarios.remove(result);
   }
   
   public HorarioMalla getHorario(int id_horariomalla){
      HorarioMalla result=null; 
      for(HorarioMalla horar:horarios){
          if(horar.getId()==id_horariomalla){
              result=horar;
              break;
          }
      }
      return result;
   }
   
  public ArrayList<HorarioMalla> getHorarioxDocente(int id_docente){
    ArrayList<HorarioMalla> result = new ArrayList<>();
      for(HorarioMalla horar:horarios){
          if(horar.getDocente().getId()== id_docente){
               result.add(horar);
              
              
          }
      }
      return result;
  }
      
  
    
    
}


