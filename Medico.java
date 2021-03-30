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
public class Medico extends Persona implements Interfaceimprimir {
    private String especialidad;

    public Medico(String nombres, String apellidos, String sexo,String especialidad) {
        super(apellidos, nombres, sexo);
        this.especialidad = especialidad;
    }
    
    
    
    @Override
    public void mostrarDatos() {
        System.out.println("\nMédico."+
                "\nNombre del médico: "+getNombres()+
                "\nApellidos del médico: "+getApellidos()+
                "\nSexo: "+getSexo()+
                "\nEspecialista: "+especialidad);
    }
     
}

    
