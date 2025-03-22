package com.mycompany.poo2tarea2;

import java.util.Date;

public class Reporte_desempenio {
    private Date fecha;
    private String Id;
    private double metricas_desempenio;

    public Reporte_desempenio(Date fecha, String Id, double metricas_desempenio) {
        this.fecha = fecha;
        this.Id = Id;
        this.metricas_desempenio = metricas_desempenio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public double getMetricas_desempenio() {
        return metricas_desempenio;
    }

    public void setMetricas_desempenio(double metricas_desempenio) {
        this.metricas_desempenio = metricas_desempenio;
    }
    
    
}
