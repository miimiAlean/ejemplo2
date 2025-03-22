package com.mycompany.poo2tarea2;

import java.util.Date;

public class Empleado_temporal extends Empleado{
    private int duracion_contrato; //En días
    private Date fecha_inicio;
    private Date fecha_salida;
    private int horas_trabajadas;
    private double tarifas_horas;

    public Empleado_temporal(int duracion_contrato, Date fecha_inicio, Date fecha_salida, int horas_trabajadas, double tarifas_horas, String id, String nombre, Date fechaContrato, int salario, String cargo) {
        super(id, nombre, fechaContrato, salario, cargo);
        this.duracion_contrato = duracion_contrato;
        this.fecha_inicio = fecha_inicio;
        this.fecha_salida = fecha_salida;
        this.horas_trabajadas = horas_trabajadas;
        this.tarifas_horas = tarifas_horas;
    }
    

    public int getDuracion_contrato() {
        return duracion_contrato;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public double getTarifas_horas() {
        return tarifas_horas;
    }
    
    // Método para finalizar contrato
    public void finalizarContrato() {
        this.fecha_salida = new Date();  // Establece la fecha de salida como la fecha actual
        System.out.println("Contrato del empleado " + getNombre() + " finalizado el " + fecha_salida);
    }

    // Método para extender contrato
    public void extenderContrato(int diasAdicionales) {
        // Extiende la fecha de salida añadiendo días al contrato
        long nuevaFechaSalida = this.fecha_salida.getTime() + (long) diasAdicionales * 24 * 60 * 60 * 1000;
        this.fecha_salida = new Date(nuevaFechaSalida);
        this.duracion_contrato += diasAdicionales;
        System.out.println("Contrato del empleado " + getNombre() + " extendido hasta el " + this.fecha_salida);
    }

    // Método para calcular salario
    public double calcularSalario() {
        // El salario se calcula multiplicando las horas trabajadas por la tarifa por hora
        double salario = this.horas_trabajadas * this.tarifas_horas;
        System.out.println("Salario calculado para " + getNombre() + ": " + salario);
        return salario;
    }

}
