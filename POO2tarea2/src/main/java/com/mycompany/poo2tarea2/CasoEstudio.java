/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo2tarea2;

import java.util.ArrayList;
import java.util.Date;

public class CasoEstudio {

    public static void main(String[] args) {
        //Crear empleados y agregarlos a la lista.
        Empleado.crearEmpleado("001", "Isabela", "Gerente");
        Empleado.crearEmpleado("002", "Salome", "Asistente");
        Empleado.crearEmpleado("003", "Santiago", "Analista");
        Empleado.crearEmpleado("004", "Angela", "Administrador");
        
        //Actualizar un empleado.
         Empleado.actualizarEmpleado("002", "Juan Perez", "Supervisor");
        
        //Eliminar un empleado
        Empleado.eliminarEmpleado("001");
        
        
        // Crear un departamento
        Departamento  departamentoVentas = Departamento.crearDepartamento("Ventas");
        Departamento departamentoRH = Departamento.crearDepartamento("Recursos Humanos");
       
        // Modificar el nombre del departamento
        departamentoVentas.modificarDepartamento("Marketing");
        
        //Añadir empleado a departamento 
        Empleado empleado1 = new Empleado("003", "Santiago", new Date(), 5000, "Analista");
        Empleado.asignarADepartamento(empleado1, "Marketing");
        
        // Cambiar empleado de departamento
        Departamento.cambiarEmpleadodeDepartamento("Recursos Humanos", "003");
        
        
        // Eliminar un departamento
        Departamento.eliminarDepartamento("Recursos Humanos");
        
        // Buscar un empleado por su ID
        ArrayList<Empleado> resultado = Departamento.visualizarEmpleado("002");
        
        // Crear un empleado temporal con duración de contrato de 6 meses, fecha de inicio y salida, horas trabajadas y tarifa por hora
        Empleado_temporal empleadoTemp = new Empleado_temporal(6, new Date(), new Date(), 160, 20.0, "T001", "Juan Perez", new Date(), 0, "Desarrollador");

        // Finalizar contrato
        empleadoTemp.finalizarContrato(); 

        // Extender contrato (agregar 30 días)
        empleadoTemp.extenderContrato(30); 

        // Calcular salario basado en horas trabajadas y tarifa por hora
        double salarioTemp = empleadoTemp.calcularSalario(); 
        System.out.println("El salario del empleado temporal es: " + salarioTemp);

        // Crear un empleado permanente con un salario de 5000 y un porcentaje de beneficios del 20%
        Empleado_permanente empleado = new Empleado_permanente(20, "P001", "Carlos López", new Date(), 5000, "Desarrollador");

        // Calcular salario para el empleado permanente
        double salarioPerm = empleado.calcularSalario();
        System.out.println("El salario del empleado permanente es: " + salarioPerm);

        // Calcular y mostrar los beneficios para el empleado permanente
        double beneficios = empleado.calcularBeneficios();
        System.out.println("Los beneficios del empleado permanente son: " + beneficios);
    }
       
        
}
