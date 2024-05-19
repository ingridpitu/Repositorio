
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ingla
 */
class Alumno extends Persona{
    
    private LocalDate fechaMatriculacion;
    private String nacionalidad;

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Alumno(LocalDate fechaMatriculacion, String nacionalidad, String dni, String nombre) {
        super(dni, nombre);
        this.fechaMatriculacion = fechaMatriculacion;
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
