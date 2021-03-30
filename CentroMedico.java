/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaresalud;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class CentroMedico implements Interfaceimprimir {
    private String centroMedico;

    public CentroMedico(String centroMedico) {
        this.centroMedico = centroMedico;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nCentro de servicio."+
                "\nNombre del centro de servicio: "+centroMedico);
    }
    
}
