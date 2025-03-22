//Programación I: Orientada a Objetos Básica (LEONARDO MONTES) - PREICA2402B010018
//Estudiante: Angela Alean Acuña

import tarea2.Persona;
import tarea2.Estudiante;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Captura de datos para cinco personas
        Persona persona1 = capturarPersona(scanner, 1);
        Persona persona2 = capturarPersona(scanner, 2);
        Persona persona3 = capturarPersona(scanner, 3);
        Persona persona4 = capturarPersona(scanner, 4);
        Persona persona5 = capturarPersona(scanner, 5);

        // Mostrar nombres y géneros
        mostrarNombresYGeneros(persona1, persona2, persona3, persona4, persona5);

        // Calcular y mostrar el promedio de edades
        int totalEdades = persona1.getEdad() + persona2.getEdad() + persona3.getEdad() + persona4.getEdad() + persona5.getEdad();
        int promedioEdades = totalEdades / 5;
        System.out.println("El promedio de las edades de las 5 personas es = " + promedioEdades);

        // Contar y mostrar número de personas masculinas
        int contadorMasculinos = 0;
        if (persona1.getGenero().equalsIgnoreCase("masculino")) {
            contadorMasculinos++;
        }
        if (persona2.getGenero().equalsIgnoreCase("masculino")) {
            contadorMasculinos++;
        }
        if (persona3.getGenero().equalsIgnoreCase("masculino")) {
            contadorMasculinos++;
        }
        if (persona4.getGenero().equalsIgnoreCase("masculino")) {
            contadorMasculinos++;
        }
        if (persona5.getGenero().equalsIgnoreCase("masculino")) {
            contadorMasculinos++;
        }
        System.out.println("Número de personas masculinas: " + contadorMasculinos);

        // Contar y mostrar número de personas femeninas
        int contadorFemeninos = 0;
        if (persona1.getGenero().equalsIgnoreCase("femenino")) {
            contadorFemeninos++;
        }
        if (persona2.getGenero().equalsIgnoreCase("femenino")) {
            contadorFemeninos++;
        }
        if (persona3.getGenero().equalsIgnoreCase("femenino")) {
            contadorFemeninos++;
        }
        if (persona4.getGenero().equalsIgnoreCase("femenino")) {
            contadorFemeninos++;
        }
        if (persona5.getGenero().equalsIgnoreCase("femenino")) {
            contadorFemeninos++;
        }
        System.out.println("Número de personas femeninas: " + contadorFemeninos);

        scanner.close();
    }

    // Método para capturar datos de una persona
    private static Persona capturarPersona(Scanner scanner, int numero) {
        System.out.println("Ingrese el nombre de la persona " + numero + ":");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido de la persona " + numero + ":");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese el género de la persona " + numero + ":");
        String genero = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona " + numero + ":");
        int edad = scanner.nextInt();
        scanner.nextLine();
        return new Persona(nombre, apellido, genero, edad);
    }

    // Método para mostrar nombres y géneros de forma explícita
    private static void mostrarNombresYGeneros(Persona persona1, Persona persona2, Persona persona3, Persona persona4, Persona persona5) {
        System.out.println("El nombre completo de la persona 1 es " + persona1.getNombre() + " " + persona1.getApellido() + ", y su género es " + persona1.getGenero() + ".");
        System.out.println("El nombre completo de la persona 2 es " + persona2.getNombre() + " " + persona2.getApellido() + ", y su género es " + persona2.getGenero() + ".");
        System.out.println("El nombre completo de la persona 3 es " + persona3.getNombre() + " " + persona3.getApellido() + ", y su género es " + persona3.getGenero() + ".");
        System.out.println("El nombre completo de la persona 4 es " + persona4.getNombre() + " " + persona4.getApellido() + ", y su género es " + persona4.getGenero() + ".");
        System.out.println("El nombre completo de la persona 5 es " + persona5.getNombre() + " " + persona5.getApellido() + ", y su género es " + persona5.getGenero() + ".");
    
    //Implementación de polimorfismo
    Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "masculino", 20, "Universidad XYZ");
    System.out.println(estudiante1.infoEstudiante());

    }
}
