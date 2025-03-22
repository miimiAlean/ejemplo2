public class EdificioResidencial{

    // Propiedades protegidas
    protected String direccion;
    protected int pisos;
    protected boolean tieneAscensor;

    // Constructor
    public EdificioResidencial(String direccion, int pisos, boolean tieneAscensor) {
        this.direccion = direccion;
        this.pisos = pisos;
        this.tieneAscensor = tieneAscensor;
    }
    
    // Métodos para interactuar con el objeto
    
    public String getDireccion() {
        return direccion;
    }
    
    public int getPisos() {
        return pisos;
    }
    
    public boolean getTieneAscensor() {
        return tieneAscensor;
    }
    
}