
import java.util.ArrayList;



/**
 *
 * @author ingla
 */
public class Asignatura {
    
    private int codigoAsig;
    private String nombreAsig;
    private int horasAnuales;
    private Profesor profesor;
    private ArrayList<Alumno> listaAlumnos;

    public int getCodigoAsig() {
        return codigoAsig;
    }

    public void setCodigoAsig(int codigoAsig) {
        this.codigoAsig = codigoAsig;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public int getHorasAnuales() {
        return horasAnuales;
    }

    public void setHorasAnuales(int horasAnuales) {
        this.horasAnuales = horasAnuales;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Asignatura(int codigoAsig, String nombreAsig, int horasAnuales, Profesor profesor, ArrayList<Alumno> listaAlumnos) {
        this.codigoAsig = codigoAsig;
        this.nombreAsig = nombreAsig;
        this.horasAnuales = horasAnuales;
        this.profesor = profesor;
        this.listaAlumnos = listaAlumnos;
    }
	
    
}
