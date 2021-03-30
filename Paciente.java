
package softwaresalud;

/**
 *
 * @author Samuel Remolina Alvarez
 */
public class Paciente extends Persona implements Interfaceimprimir{
    private int codigo;
    private String direccion;
    private String residencia;
    private String lugarAtendido;
    private String motivoConsulta;
    private String medicoQueAtendio;
    private String fecha;
 
    public int getCodigo() {
        return codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getResidencia() {
        return residencia;
    }

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getMedicoQueAtendio() {
        return medicoQueAtendio;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    public Paciente(String apellidos, String nombres,String sexo,int codigo, String direccion, String residencia, String lugarAtentido, 
            String motivoConsulta, String medicoQueAtendio,String fecha){
            super(nombres,apellidos,sexo);
            this.codigo = codigo;
            this.direccion = direccion;
            this.residencia = residencia;
            this.lugarAtendido = lugarAtentido;
            this.motivoConsulta = motivoConsulta;
            this.medicoQueAtendio = medicoQueAtendio;
            this.fecha = fecha;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Paciente"+
                "\nNombre: "+getNombres()+
                "\nApellido: "+getApellidos()+
                "\nSexo: "+getSexo()+
                "\nCodigo: "+codigo+
                "\nDirección: "+direccion+
                "\nResidencia: "+residencia+
                "\nLugar donde fue atendido: "+lugarAtendido+
                "\nMotivo de consulta: "+motivoConsulta+
                "\nMédico que atendio: "+medicoQueAtendio+
                "\nFecha: \n"+fecha);
    }

}
