
import java.util.ArrayList;




/**
 * @author ingla
 */
public class GestionColegio {
    
    private ArrayList<Asignatura> listaAsignaturas;
    private ArrayList<Persona> listaPersonal;

    
    
    /**
     * @return devuelde lista de asignaturas
     */
    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public ArrayList<Persona> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList<Persona> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }
    
    /**
     * constructor de gestion de colegio
     *
     */
     
    public GestionColegio(ArrayList<Asignatura> listaAsignaturas, ArrayList<Persona> listaPersonal) {
        this.listaAsignaturas = listaAsignaturas;
        this.listaPersonal = listaPersonal;
    }
    
    /**
     * metodo para guardar datos de colegio
     */
    
    public void guardarDatos() {
       
    }
    
    public void cargarDatos() {
        
    }
    
    
    /**
     * metodos para listar alumnos y profesores
     */
    
    public void listarAlumnos() {
        
    }
    
    public void listarProfesores() {
        
    }
    
    /**
     * metodos para dar de alta alumnos y profesores y asignaturas
     * con sus atributos
     */
    
    
    public void altaAlumno(String dni, String nombre, String nacionalidad) {
       
    }
    
    public void altaProfesor(String dni, String nombre, String departamento) {
        
        }
    
     public void altaAsignatura(int codigoAsig, String nombreAsig, int horasAnuales, String dniProfesor) {
        

    }
     
     /**
      * metodo para matricular alumno
      *  
      */
     public void matricularAlumno(int codigoAsig, String dni) {
         
     }
     
     /**
      * metodo para mostrar cantidad de asignaturas impartidas por profesor
      
      */
     
     public void cantidadAsigProfesor(String dni) {
     

    }
     
}
