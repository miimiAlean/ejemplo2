package com.mycompany.poo2tarea2;

import java.util.ArrayList;

public class Departamento {
    private String nombreDepartamento;
    private String id;
    private ArrayList<Empleado> empleadosContratados; //Relación de agregación
    
    // Lista estática para almacenar todos los departamentos
    public static ArrayList<Departamento> listaDepartamentos = new ArrayList<>();

    public Departamento(String nombreDepartamento, String id) {
        this.nombreDepartamento = nombreDepartamento;
        this.id = id;
        this.empleadosContratados = new ArrayList<>();
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Empleado> getEmpleadosContratados() {
        return empleadosContratados;
    }

    public void setEmpleadosContratados(ArrayList<Empleado> empleadosContratados) {
        this.empleadosContratados = empleadosContratados;
    }
 
     // Método para crear un departamento
    public static Departamento crearDepartamento(String nombreDepartamento) {
        String id = "D" + (int) (Math.random() * 1000); // Generamos un ID único para el departamento
        Departamento nuevoDepartamento = new Departamento(nombreDepartamento, id); // Creamos el objeto
        
        listaDepartamentos.add(nuevoDepartamento);
        
        System.out.println("Departamento creado: " + nombreDepartamento + " con ID: " + id);
        return nuevoDepartamento; // Devolvemos el departamento creado
}

// Método para modificar el nombre del departamento
    public void modificarDepartamento(String nuevoNombreDepartamento) {
        String nombreAnterior = this.nombreDepartamento; // Guardamos el nombre anterior
        this.nombreDepartamento = nuevoNombreDepartamento; // Actualizamos el nombre
        System.out.println("Departamento con ID " + this.id + " modificado.");
        System.out.println("Nombre anterior: " + nombreAnterior + ", Nuevo nombre: " + nuevoNombreDepartamento);
}
    // Método para eliminar un departamento por nombre
    public static void eliminarDepartamento(String nombreDepartamento) {
        boolean eliminado = false;

        for (int i = 0; i < listaDepartamentos.size(); i++) {
            Departamento departamento = listaDepartamentos.get(i);
            if (departamento.getNombreDepartamento().equals(nombreDepartamento)) {
                listaDepartamentos.remove(i); // Eliminamos el departamento por índice
                eliminado = true;
                System.out.println("Departamento " + nombreDepartamento + " eliminado exitosamente.");
                break;
            }
        }

        if (!eliminado) {
            System.out.println("Error: No se encontro el departamento con nombre " + nombreDepartamento);
        }
    }
     // Método para visualizar un empleado por su ID
    public static ArrayList<Empleado> visualizarEmpleado(String id) {
        ArrayList<Empleado> empleadosEncontrados = new ArrayList<>(); // Lista para guardar empleados encontrados

        for (Empleado empleado : Empleado.empleados) { // Accedemos directamente a Empleado.empleados
            if (empleado.getId().equals(id)) {
                empleadosEncontrados.add(empleado); // Agregamos a la lista si el ID coincide
            }
        }

        if (empleadosEncontrados.isEmpty()) {
            System.out.println("No se encontro ningun empleado con el ID: " + id);
        } else {
            System.out.println("Empleado encontrado con ID " + id + ":");
            for (Empleado emp : empleadosEncontrados) {
                System.out.println("- ID: " + emp.getId() + ", Nombre: " + emp.getNombre() + ", Cargo: " + emp.getCargo());
            }
        }

        return empleadosEncontrados; // Devolver la lista con los empleados encontrados
    }

    
    //Método para cambiar un empleado de departamento.
    public static void cambiarEmpleadodeDepartamento(String nombreDepartamento, String idEmpleado) {
    Empleado empleadoMover = null; // Para almacenar el empleado a mover
    Departamento departamentoOrigen = null; // Para almacenar el departamento original del empleado

    // Buscar al empleado en todos los departamentos
    for (Departamento departamento : listaDepartamentos) {
        for (Empleado empleado : departamento.getEmpleadosContratados()) {
            if (empleado.getId().equals(idEmpleado)) {
                empleadoMover = empleado; // Encontramos al empleado
                departamentoOrigen = departamento; // Guardamos su departamento actual
                break; // Salir del bucle interno
            }
        }
        if (empleadoMover != null) break; // Salir del bucle externo si ya encontramos al empleado
    }

    // Si no encontramos al empleado
    if (empleadoMover == null) {
        System.out.println("Error: No se encontró ningún empleado con el ID " + idEmpleado);
        return; // Salimos del método
    }

    // Remover al empleado del departamento original
    if (departamentoOrigen != null) {
        departamentoOrigen.getEmpleadosContratados().remove(empleadoMover);
        System.out.println("Empleado con ID " + idEmpleado + " eliminado del departamento " + departamentoOrigen.getNombreDepartamento());
    }

    // Buscar el nuevo departamento
    for (Departamento departamento : listaDepartamentos) {
        if (departamento.getNombreDepartamento().equals(nombreDepartamento)) {
            departamento.getEmpleadosContratados().add(empleadoMover); // Agregar al nuevo departamento
            System.out.println("Empleado con ID " + idEmpleado + " agregado al departamento " + nombreDepartamento);
            return; // Salimos del método después de agregar
        }
    }

    // Si no se encuentra el nuevo departamento
    System.out.println("Error: No se encontro el departamento con nombre " + nombreDepartamento);
    
    }


}
