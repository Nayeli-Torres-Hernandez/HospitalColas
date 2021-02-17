
package modelo;

/**
 *EDA: Colas
 * 13/07/2020
 * @author Nayeli Torres Hernández
 * DSM304
 */

public class Tickets {
    
    private int numSeguro;
    private String nombre;
    private String padecimiento;
    private String alergias;
    private String tipoAtencion;

    //CONSTRUCTOR
    public Tickets() {
    }

    public Tickets(int numSeguro, String nombre, String padecimiento, String alergias, String tipoAtencion) {
        this.numSeguro = numSeguro;
        this.nombre = nombre;
        this.padecimiento = padecimiento;
        this.alergias = alergias;
        this.tipoAtencion = tipoAtencion;
    }
    
    //SET

    public void setNumSeguro(int numSeguro) {
        this.numSeguro = numSeguro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }
    
    //GET

    public int getNumSeguro() {
        return numSeguro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }
    
    //toString

    @Override
    public String toString() {
        return "Paciente {" + "Numero de Seguro=" + numSeguro + ", Nombre Paciente=" + nombre + ", Padecimiento=" + padecimiento + ", Alergias=" + alergias + ", Tipo de Atencion=" + tipoAtencion + "}";
        }    
}
