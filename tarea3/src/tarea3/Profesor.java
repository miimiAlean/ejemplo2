package tarea3;

import javax.swing.JOptionPane;

public class Profesor extends Persona {
    private String materia;
    private int[] vector = new int[50]; // Vector que almacenará los IDs o índices
    private Persona[] persona = new Persona[50]; // Arreglo para almacenar los profesores

    public Profesor(String materia, String nombre, String apellido, int fechaNacimiento, String genero, int estatura, int peso) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public Persona[] getPersona() {
        return persona;
    }

    public void setPersona(Persona[] persona) {
        this.persona = persona;
    }

    // Método para mostrar la información del profesor
    public void mostrarInformacion1() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Materia: " + materia);
    }

    // Método para agregar profesores utilizando el vector
    public void agregarProfesor() {
        // Buscar una posición disponible en el vector
        int posicionLibre = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) { // Si la posición está libre (valor 0)
                posicionLibre = i;
                break;
            }
        }

        if (posicionLibre != -1) {
            // Capturar los datos del profesor
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            String apellido = JOptionPane.showInputDialog("Ingrese el apellido del profesor: ");
            int fechaNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del profesor (en formato AAAA): "));
            String genero = JOptionPane.showInputDialog("Ingrese el género del profesor: ");
            int estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura del profesor (en cm): "));
            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del profesor (en kg): "));
            String materia = JOptionPane.showInputDialog("Ingrese la materia que imparte: ");

            // Crear un nuevo objeto Profesor con los datos ingresados
            Persona nuevoProfesor = new Profesor(materia, nombre, apellido, fechaNacimiento, genero, estatura, peso);

            // Almacenar el profesor en la posición libre del arreglo
            persona[posicionLibre] = nuevoProfesor;

            // Marcar la posición en el vector con un valor distinto de 0 (por ejemplo, 1)
            vector[posicionLibre] = 1;

            JOptionPane.showMessageDialog(null, "Profesor agregado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más profesores, el vector está lleno.");
        }
    }
}
