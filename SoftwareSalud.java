
package softwaresalud;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class SoftwareSalud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Andrea","Gómez Parra","Femenino",123,"Cra 2A 12-23","Urbano","Clinica Palermo","Ceguera","Diana Monsalve Perez",   
        "12/02/2038");
        Medico medico = new Medico("Diana","Monsalve Perez","Femenino","Oftalmóloga");
        CentroMedico centro = new CentroMedico("Clinica Palermo");
        paciente.mostrarDatos();
        medico.mostrarDatos();
        centro.mostrarDatos();
    }
    
}
