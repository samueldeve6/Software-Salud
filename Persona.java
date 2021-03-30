
package softwaresalud;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class Persona {
    private String apellidos;
    private String nombres;
    private String sexo;

    public Persona(String apellidos, String nombres, String sexo) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
}
