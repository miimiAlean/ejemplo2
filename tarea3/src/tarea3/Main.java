package tarea3;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Matemáticas", "", "", 0, "", 0, 0);
        
        // Preguntar cuántos profesores se desean agregar
        int numProfesores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos profesores desea agregar?"));

        // Agregar automáticamente la cantidad de profesores solicitada
        for (int i = 0; i < numProfesores; i++) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos del profesor #" + (i + 1));
            profesor.agregarProfesor();
        }

        // Mostrar la información de todos los profesores agregados
        for (int i = 0; i < profesor.getPersona().length; i++) {
            if (profesor.getPersona()[i] != null) { // Si hay un profesor en esta posición
                System.out.println("Profesor #" + (i + 1));
                profesor.getPersona()[i].mostrarInformacion(); // Muestra la información del profesor
                System.out.println("----------------------------");
            }
        }
    }
}