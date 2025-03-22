package com.mycompany.poo2tarea2;

import java.util.Date;


public class Empleado_permanente extends Empleado {
    private double porcentajeBeneficios;

    // Constructor
    public Empleado_permanente(double porcentajeBeneficios, String id, String nombre, Date fechaContrato, int salario, String cargo) {
        super(id, nombre, fechaContrato, salario, cargo);
        this.porcentajeBeneficios = porcentajeBeneficios;
    }
    
    // Getter y Setter
    public double getPorcentajeBeneficios() {
        return porcentajeBeneficios;
    }

    public void setPorcentajeBeneficios(double porcentajeBeneficios) {
        this.porcentajeBeneficios = porcentajeBeneficios;
    }
    // Método para calcular el salario
    public double calcularSalario() {
        return getSalario();
    }

    // Método para calcular los beneficios
    public double calcularBeneficios() {
        return getSalario() * porcentajeBeneficios / 100;  // Beneficios es un porcentaje del salario
    }

}