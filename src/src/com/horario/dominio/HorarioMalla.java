
package src.com.horario.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class HorarioMalla {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
     
    @JoinColumn(name = "malla", referencedColumnName = "id_mallacurricular")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private MallaCurricular malla;
    
    @JoinColumn(name = "jornada", referencedColumnName = "id_jornada")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Jornada jornada;
    
    @JoinColumn(name = "docente", referencedColumnName = "id_docente") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Docente docente;
    
    private int grupo;
    
    @JoinColumn(name = "dia", referencedColumnName = "id_dia") 
    @ManyToOne(cascade = CascadeType.PERSIST)
    private  Dias dia;
    
    private String hora;

    public HorarioMalla(int id, MallaCurricular malla, Jornada jornada, Docente docente, int grupo, Dias dia, String hora) {
        this.id = id;
        this.malla = malla;
        this.jornada = jornada;
        this.docente = docente;
        this.grupo = grupo;
        this. dia = dia;
        this.hora = hora;
    }

    public HorarioMalla() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MallaCurricular getMalla() {
        return malla;
    }

    public void setMalla(MallaCurricular malla) {
        this.malla = malla;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getContrato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
