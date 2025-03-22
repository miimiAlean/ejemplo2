package tarea3;

import javax.swing.JOptionPane;

public class Persona {
    private String nombre;
    private String apellido;
    private int fechaNacimiento; 
    private String genero;
    private int estatura;
    private int peso;

    public Persona(String nombre, String apellido, int fechaNacimiento, String genero, int estatura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
    public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n"
                + "Apellido: "+ apellido +"\n"
                + "Fecha de nacimiento: "+ fechaNacimiento +"\n"
                + "Genero: "+ genero +"\n"
                + "Estatura: "+ estatura +"\n"
                + "Peso: " + peso +"\n");
                
    }
    
    
 
}
