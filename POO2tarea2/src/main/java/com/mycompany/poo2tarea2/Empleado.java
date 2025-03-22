package com.mycompany.poo2tarea2;

import java.util.ArrayList;
import java.util.Date;

public class Empleado {
    private String id;
    private String nombre;
    private Date fechaContrato;
    private int salario;
    private String cargo;

    // Lista estática para almacenar empleados
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    
    public Empleado(String id, String nombre, Date fechaContrato, int salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaContrato = fechaContrato;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    // Método para crear empleados
    public static Empleado crearEmpleado(String id, String nombre, String cargo) {
        Date fechaContrato = new Date(); // Fecha actual
        int salario = 0; // Valor predeterminado
        Empleado nuevoEmpleado = new Empleado(id, nombre, fechaContrato, salario, cargo);
        
        // Agregamos el nuevo empleado a la lista estática
        empleados.add(nuevoEmpleado);
    
        System.out.println("Empleado creado: " + nuevoEmpleado.getNombre());
        return nuevoEmpleado;
        
        
    }
    
    // Método para eliminar un empleado por ID sin usar Iterator
    public static void eliminarEmpleado(String id) {
        boolean eliminado = false;

        for (int i = 0; i < empleados.size(); i++) {
            // Comparamos el ID proporcionado con el ID almacenado en el empleado
            if (empleados.get(i).getId().equals(id)) {
                empleados.remove(i); // Eliminamos el empleado por índice
                eliminado = true;
                System.out.println("Empleado con ID " + id + " eliminado exitosamente.");
                break; // Salimos del ciclo después de eliminar
            }
        }

        // Si no se eliminó ningún empleado, mostramos un mensaje de error
        if (!eliminado) {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }
    
   
    // Método para actualizar un empleado por ID
    public static void actualizarEmpleado(String id, String nombre, String cargo) {
        boolean actualizado = false;

    for (Empleado empleado : empleados) {
        if (empleado.getId().equals(id)) {
            empleado.setNombre(nombre); // Actualizamos el nombre
            empleado.setCargo(cargo);   // Actualizamos el cargo
            actualizado = true;
            System.out.println("Empleado con ID " + id + " actualizado exitosamente.");
            break; // Salimos del ciclo una vez actualizado
        }
    }

    if (!actualizado) {
        System.out.println("Error: Empleado con ID " + id + " no encontrado.");
    }
}
    
    //Método para asignar un empleado al departamento.
    public static void asignarADepartamento(Empleado empleado, String nombreDepartamento) {
    // Buscar el departamento por nombre
    for (Departamento departamento : Departamento.listaDepartamentos) {
        if (departamento.getNombreDepartamento().equals(nombreDepartamento)) {
            // Agregar directamente el empleado a la lista del departamento
            if (!departamento.getEmpleadosContratados().contains(empleado)) { 
                departamento.getEmpleadosContratados().add(empleado);
                System.out.println("Empleado " + empleado.getNombre() + " asignado al departamento " + nombreDepartamento);
            } else {
                System.out.println("El empleado ya está asignado al departamento " + nombreDepartamento);
            }
            return; // Salimos del método después de asignar
        }
    }

    // Si no se encuentra el departamento
    System.out.println("Error: No se encontró el departamento con el nombre " + nombreDepartamento);
}

    
}
