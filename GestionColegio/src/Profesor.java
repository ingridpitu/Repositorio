




/**
 *
 * @author ingla
 */
class Profesor extends Persona{
    
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, String dni, String nombre) {
        super(dni, nombre);
        this.departamento = departamento;
    }
    
    
    
}
