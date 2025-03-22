package tarea2;

public class Estudiante extends Persona {
    private String institucion;

    // Constructor que llama al constructor de Persona
    public Estudiante(String nombre, String apellido, String genero, int edad, String institucion) {
        super(nombre, apellido, genero, edad);
        this.institucion = institucion;
    }

    // Método que devuelve información del estudiante
    public String infoEstudiante() {
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Género: " + getGenero() + ", Edad: " + getEdad() + ", Institución: " + institucion;
    }
}
