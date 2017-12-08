
package src.com.horario.dominio.repository;
import java.util.ArrayList;
import src.com.horario.dominio.MallaCurricular;
import src.com.horario.dominio.Materia;
import src.com.horario.dominio.Periodo;
import src.com.horario.dominio.Ciclo;
import src.com.horario.dominio.Semestre;

public class MallaCurricularRepository {
    
    public ArrayList<MallaCurricular>mallaCurriculares =new ArrayList<>();
    
    public MallaCurricularRepository(){
            
    MateriaRepository jp =new MateriaRepository ();
    PeriodoRepository  rm = new PeriodoRepository ();
    CicloRepository jc = new CicloRepository ();
    SemestreRepository sr= new SemestreRepository ();
    
        //Primer Semestre
        Materia FundamentaDeComputacionI = jp.getMateria(1);
        Materia ContabilidadI = jp.getMateria(2);
        Materia MatematicaAplicadaI = jp.getMateria(3);
        Materia FundamentoDeLaProgramacionI = jp.getMateria(4);
        Materia FundamentoAdministrativaYTecnicaDeAnalisisI = jp.getMateria(5);
        Materia ExpresionOralyEscritaI = jp.getMateria(6);
        //Segundo Semestre
        Materia MatematicaAplicadaII = jp.getMateria(7);
        Materia ContabilidadII = jp.getMateria(8);
        Materia FundamentosDeComputacionII = jp.getMateria(9);
        Materia FundamentoDeLaProgramacionII = jp.getMateria(10);
        Materia FundamentoAdministrativaYTecnicaDeAnalisisII = jp.getMateria(11);
        Materia ExpresionOralYEscritaII = jp.getMateria(12);
        // Tercer semestre
        Materia BaseDeDatosYProcesamientoDeArchivoI  = jp.getMateria(13);
        Materia AnalisisYDesiseñoDocumentacionDeSistemaI  = jp.getMateria(14);
        Materia ProgramacionII = jp.getMateria(15);
        Materia EstructuraDeDatosI = jp.getMateria(16);
        Materia SistemaOpertivoI = jp.getMateria(17);
        Materia MantenimientoYEmsanblajeI = jp.getMateria(18);
        Materia InglesI = jp.getMateria(19);
        // Cuarto semestre
        Materia BaseDeDatosYProcesamientoDeArchivoII = jp.getMateria(20);
        Materia AnalisisYDesiseñoDocumentoDeSistemaII = jp.getMateria(21);
        Materia ProgramacionIII = jp.getMateria(22);
        Materia EstructuraDeDatosII = jp.getMateria(23);
        Materia SistemaOperativosII = jp.getMateria(24);
        Materia MantenimientoYEmsanblajeII = jp.getMateria(25);
        Materia InglesII = jp.getMateria(26);
        // Quinto  semestre
        Materia MatematicaFinancieraI = jp.getMateria(27);
        Materia AuditoriaDeEvaluacionDeSistemaI = jp.getMateria(28);
        Materia RedesDeComputadorasI = jp.getMateria(29);
        Materia ProgramacionIV = jp.getMateria(30);
        Materia ProgromacionOrientadaAObjetoI = jp.getMateria(31);
        Materia TopicosDeInformaticasI = jp.getMateria(32);
        Materia InglesIII = jp.getMateria(33);
        // Sexto semestre
        Materia InglesIV = jp.getMateria(34);
        Materia AuditoriaDeEvaluacionDeSistemaII = jp.getMateria(35);
        Materia RedesDeComputadorasII = jp.getMateria(36);
        Materia ProgramcionV = jp.getMateria(37);
        Materia ProgromacionorientadaAObjetoII = jp.getMateria(38);
        Materia TopicosDeInformaticasII = jp.getMateria(39);
        Materia MatematicasFinancieraII = jp.getMateria(40);
        // Septimo semestre
        Materia FinanzasI = jp.getMateria(41);
        Materia GestionDeLaCalidadI = jp.getMateria(42);
        Materia EstadisticaComputarizada = jp.getMateria(43);
        Materia OrganizacionYMetodos = jp.getMateria(44);
        Materia MarketingParaDesarrolladoresDeSotfware = jp.getMateria(45);
        Materia RedesYTelecomunicaciones = jp.getMateria(46);
        // Octavo semestre
        Materia FinanzasII = jp.getMateria(47);
        Materia AuditoriaDeSistemasDeInformacionI = jp.getMateria(48);
        Materia ModelosEstadisticosYSimulacion = jp.getMateria(49);
        Materia PlaneacionYControlDeProyecto = jp.getMateria(50);
        Materia AdministracionDeOperaciones = jp.getMateria(51);
        Materia SistemasDeInformacion = jp.getMateria(52);
        Materia TopicosDeGraduacion = jp.getMateria(53);
        //Noveno semestre
        Materia EstadisticasAplicadaALaInvestigacion = jp.getMateria(54);
        Materia MetodologiaDeLaInvestigacion = jp.getMateria(55);
        Materia BaseDeDatosNoSQL = jp.getMateria(56);
        Materia SeguridadDeInformaticas = jp.getMateria(57);
        Materia AdministracionDeProcesoDeNegocio = jp.getMateria(58);
        //decimo semestre
        Materia VinculacionConLaComunidad = jp.getMateria(59);
        // 10P
       Materia PracticasProfesionales = jp.getMateria(60);
        Materia Titulacion = jp.getMateria(61);
        
    Periodo  j1 = rm.getPeriodo(1);
    Periodo  j2 = rm.getPeriodo(2);
    Periodo  j3 = rm.getPeriodo(3);
    Periodo  j4 = rm.getPeriodo(4);
    Periodo  j5 = rm.getPeriodo(5);
    
    Ciclo p1 = jc.getCiclo(1);
    Ciclo p2 = jc.getCiclo(2);
    
    Semestre primer1  = sr.getSemestre(1);
    Semestre segundo2 = sr.getSemestre(2);
    Semestre tercer3  = sr.getSemestre(3);
    Semestre cuarto4  = sr.getSemestre (4);
    Semestre quinto5  = sr.getSemestre(5);
    Semestre sexto6   = sr.getSemestre (6);
    Semestre septimo7 = sr.getSemestre(7);
    Semestre octavo8  = sr.getSemestre (8);
    Semestre noveno9  = sr.getSemestre(9);
    Semestre decimo10 = sr.getSemestre (10);
    
 MallaCurricular mall1 = new MallaCurricular (1,j1, p1, primer1, FundamentaDeComputacionI);
 MallaCurricular mall2 = new MallaCurricular (2,j1, p1, primer1, ContabilidadI);
 MallaCurricular mall3 = new MallaCurricular (3,j1, p1, primer1, MatematicaAplicadaI);
 MallaCurricular mall4 = new MallaCurricular (4,j1, p1, primer1, FundamentoDeLaProgramacionI);
 MallaCurricular mall5 = new MallaCurricular (5,j1, p1, primer1, FundamentoAdministrativaYTecnicaDeAnalisisI);
 MallaCurricular mall6 = new MallaCurricular (6,j1, p1, primer1, ExpresionOralyEscritaI);

 MallaCurricular mall7 = new MallaCurricular (7,j1, p1, segundo2, MatematicaAplicadaII);
 MallaCurricular mall8= new MallaCurricular (8,j2, p2, segundo2, ContabilidadII);
 MallaCurricular mall9 = new MallaCurricular (9,j1, p1, segundo2, FundamentosDeComputacionII);
 MallaCurricular mall10 = new MallaCurricular (10,j1, p1, segundo2, FundamentoDeLaProgramacionII);
 MallaCurricular mall11= new MallaCurricular (11,j1, p1, segundo2, FundamentoAdministrativaYTecnicaDeAnalisisII);
 MallaCurricular mall12= new MallaCurricular (12,j1, p1, segundo2, ExpresionOralYEscritaII);
 
 MallaCurricular mall13= new MallaCurricular (13,j2, p2, tercer3, BaseDeDatosYProcesamientoDeArchivoI);
 MallaCurricular mall14= new MallaCurricular (14,j2, p2, tercer3, AnalisisYDesiseñoDocumentacionDeSistemaI );
 MallaCurricular mall15= new MallaCurricular (15,j2, p2, tercer3, ProgramacionII);
 MallaCurricular mall16= new MallaCurricular (16,j2, p2, tercer3, EstructuraDeDatosI);
 MallaCurricular mall17= new MallaCurricular (17,j2, p2, tercer3, SistemaOpertivoI);
 MallaCurricular mall18= new MallaCurricular (18,j2, p2, tercer3, MantenimientoYEmsanblajeI);
 MallaCurricular mall19= new MallaCurricular (19,j2, p2, tercer3, InglesI);
 
 MallaCurricular mall20= new MallaCurricular (20,j2, p2, cuarto4, BaseDeDatosYProcesamientoDeArchivoII);
 MallaCurricular mall21= new MallaCurricular (21,j2, p2, cuarto4, AnalisisYDesiseñoDocumentoDeSistemaII );
 MallaCurricular mall22= new MallaCurricular (22,j2, p2, cuarto4, ProgramacionIII);
 MallaCurricular mall23= new MallaCurricular (23,j2, p2, cuarto4, EstructuraDeDatosII);
 MallaCurricular mall24= new MallaCurricular (24,j2, p2, cuarto4, SistemaOperativosII);
 MallaCurricular mall25= new MallaCurricular (25,j2, p2,cuarto4, MantenimientoYEmsanblajeII);
 MallaCurricular mall26= new MallaCurricular (26,j2, p2, cuarto4,  InglesII);
 
 MallaCurricular mall27= new MallaCurricular (27,j3, p2, quinto5, MatematicaFinancieraI);
 MallaCurricular mall28= new MallaCurricular (28,j3, p2, quinto5, AuditoriaDeEvaluacionDeSistemaI);
 MallaCurricular mall29= new MallaCurricular (29,j3, p2, quinto5, RedesDeComputadorasI);
 MallaCurricular mall30= new MallaCurricular (30,j3, p2, quinto5, ProgramacionIV );
 MallaCurricular mall31= new MallaCurricular (31,j3, p2, quinto5, ProgromacionorientadaAObjetoII );
 MallaCurricular mall32= new MallaCurricular (32,j3, p2, quinto5, TopicosDeInformaticasI);
 MallaCurricular mall33= new MallaCurricular (33,j3, p2, quinto5, InglesIII);
 
 MallaCurricular mall34= new MallaCurricular (34,j3, p2, sexto6, InglesIV );
 MallaCurricular mall35= new MallaCurricular (35,j3, p2, sexto6, AuditoriaDeEvaluacionDeSistemaII );
 MallaCurricular mall36= new MallaCurricular (36,j3, p2, sexto6, RedesDeComputadorasII);
 MallaCurricular mall37= new MallaCurricular (37,j3, p2, sexto6, ProgramcionV);
 MallaCurricular mall38= new MallaCurricular (38,j3, p2, sexto6, ProgromacionorientadaAObjetoII);
 MallaCurricular mall39= new MallaCurricular (39,j3, p2, sexto6, TopicosDeInformaticasII);
 MallaCurricular mall40= new MallaCurricular (40,j3, p2, sexto6, MatematicasFinancieraII);
 
 MallaCurricular mall41= new MallaCurricular (41,j4, p2, septimo7, FinanzasI);
 MallaCurricular mall42= new MallaCurricular (42,j4, p2, septimo7, GestionDeLaCalidadI);
 MallaCurricular mall43= new MallaCurricular (43,j4, p2, septimo7, EstadisticaComputarizada);
 MallaCurricular mall44= new MallaCurricular (44,j4, p2, septimo7, OrganizacionYMetodos);
 MallaCurricular mall45= new MallaCurricular (45,j4, p2, septimo7, MarketingParaDesarrolladoresDeSotfware);
 MallaCurricular mall46= new MallaCurricular (46,j4, p2, septimo7, RedesYTelecomunicaciones);

 MallaCurricular mall47= new MallaCurricular (47,j4, p2, octavo8, FinanzasII);
 MallaCurricular mall48= new MallaCurricular (48,j4, p2, octavo8, AuditoriaDeSistemasDeInformacionI);
 MallaCurricular mall49= new MallaCurricular (49,j4, p2, octavo8, ModelosEstadisticosYSimulacion);
 MallaCurricular mall50= new MallaCurricular (50,j4, p2, octavo8, PlaneacionYControlDeProyecto);
 MallaCurricular mall51= new MallaCurricular (51,j4, p2, octavo8, AdministracionDeOperaciones);
 MallaCurricular mall52= new MallaCurricular (52,j4, p2, octavo8, SistemasDeInformacion);
 MallaCurricular mall53= new MallaCurricular (53,j4, p2, octavo8, TopicosDeGraduacion );
 
 MallaCurricular mall54= new MallaCurricular (54,j5, p2, noveno9, EstadisticasAplicadaALaInvestigacion);
 MallaCurricular mall55= new MallaCurricular (55,j5, p2, noveno9, MetodologiaDeLaInvestigacion );
 MallaCurricular mall56= new MallaCurricular (56,j5, p2, noveno9, BaseDeDatosNoSQL);
 MallaCurricular mall57= new MallaCurricular (57,j5, p2, noveno9, SeguridadDeInformaticas);
 MallaCurricular mall58= new MallaCurricular (58,j5, p2, noveno9, AdministracionDeProcesoDeNegocio);

 MallaCurricular mall59= new MallaCurricular (59,j5, p2, decimo10,  VinculacionConLaComunidad);
 MallaCurricular mall60= new MallaCurricular (60,j5, p2, decimo10, PracticasProfesionales );
 MallaCurricular mall61= new MallaCurricular (61,j5, p2, decimo10, Titulacion);



 
     
     
     mallaCurriculares.add(mall1);
     mallaCurriculares.add(mall2);
     mallaCurriculares.add(mall3);
     mallaCurriculares.add(mall4);
     mallaCurriculares.add(mall5);
     mallaCurriculares.add(mall6);
     mallaCurriculares.add(mall7);
     mallaCurriculares.add(mall8);
     mallaCurriculares.add(mall9);
     mallaCurriculares.add(mall10);
     mallaCurriculares.add(mall11);
     mallaCurriculares.add(mall12);
     mallaCurriculares.add(mall13);
     mallaCurriculares.add(mall14);
     mallaCurriculares.add(mall15);
     mallaCurriculares.add(mall16);
     mallaCurriculares.add(mall17);
     mallaCurriculares.add(mall18);
     mallaCurriculares.add(mall19);
     mallaCurriculares.add(mall20);
     mallaCurriculares.add(mall21);
     mallaCurriculares.add(mall22);
     mallaCurriculares.add(mall23);
     mallaCurriculares.add(mall24);
     mallaCurriculares.add(mall25);
     mallaCurriculares.add(mall26);
     mallaCurriculares.add(mall27);
     mallaCurriculares.add(mall28);
     mallaCurriculares.add(mall29);
     mallaCurriculares.add(mall30);
     mallaCurriculares.add(mall31);
     mallaCurriculares.add(mall32);
     mallaCurriculares.add(mall33);
     mallaCurriculares.add(mall34);
     mallaCurriculares.add(mall35);
     mallaCurriculares.add(mall36);
     mallaCurriculares.add(mall37);
     mallaCurriculares.add(mall38);
     mallaCurriculares.add(mall39);
     mallaCurriculares.add(mall40);
     mallaCurriculares.add(mall41);
     mallaCurriculares.add(mall42);
     mallaCurriculares.add(mall43);
     mallaCurriculares.add(mall44);
     mallaCurriculares.add(mall45);
     mallaCurriculares.add(mall46);
     mallaCurriculares.add(mall47);
     mallaCurriculares.add(mall48);
     mallaCurriculares.add(mall49);
     mallaCurriculares.add(mall50);
     mallaCurriculares.add(mall51);
     mallaCurriculares.add(mall52);
     mallaCurriculares.add(mall53);
     mallaCurriculares.add(mall54);
     mallaCurriculares.add(mall55);
     mallaCurriculares.add(mall56);
     mallaCurriculares.add(mall57);
     mallaCurriculares.add(mall58);
     mallaCurriculares.add(mall60);
     mallaCurriculares.add(mall61);
     
     }
    
    public MallaCurricular ingreso(MallaCurricular mallaCurricular){
          mallaCurriculares.add(mallaCurricular);
          return mallaCurricular;
        
    }
    
    public void modificar(MallaCurricular mallaCurricular){
        MallaCurricular result= getMallaCurricular(mallaCurricular.getId_MallaCurricular());
        result.setId_Mallacurricular(mallaCurricular.getId_MallaCurricular());
        
    }
   
    public void eliminar(int  id_mallaCurricular ){
        MallaCurricular result=getMallaCurricular(id_mallaCurricular);
        mallaCurriculares.remove(result);
        
    }
    
    public MallaCurricular getMallaCurricular(int id_mallaCurricular){
        MallaCurricular result=null;
        for(MallaCurricular mallaCurricular:mallaCurriculares){
            if(mallaCurricular.getId_MallaCurricular()==id_mallaCurricular){
                result= mallaCurricular ;
                break;
            }
        }
        return result;
    }
    
     public ArrayList<MallaCurricular> getMallaxsemestre(int id_semestre) {
        ArrayList<MallaCurricular> result= new ArrayList<>() ;
        for(MallaCurricular mallaCurricular:mallaCurriculares){
            //comparas el id de semestre llamando primero al obejto semestre
            // luego llamas al id_semestre
            if(mallaCurricular.getId_semestre().getId_semestre()==id_semestre){
               result.add(mallaCurricular);
                break;
            }
        }
    
     return result;
    
}
}