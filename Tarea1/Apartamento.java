public class Apartamento extends EdificioResidencial{
    protected int numeroHabitaciones;
    protected boolean tieneBalcon;

    // Constructor
    public Apartamento(String direccion, int pisos, boolean tieneAscensor, int numeroHabitaciones, boolean tieneBalcon) {
        super(direccion, pisos, tieneAscensor);
        this.numeroHabitaciones = numeroHabitaciones;
        this.tieneBalcon = tieneBalcon;
    }

    // Métodos para interactuar con el objeto
    
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public boolean getTieneBalcon() {
        return tieneBalcon;
    }
    
    public static void main(String[] args) {
        // Instancia de Apartamento
        Apartamento miApartamento = new Apartamento("Calle 123", 5, true, 3, true);

        // Imprimir
        System.out.println("Dirección: " + miApartamento.getDireccion());
        System.out.println("Piso n°: " + miApartamento.getPisos());
        System.out.println("Tiene ascensor: " + miApartamento.getTieneAscensor());
        System.out.println("Número de habitaciones: " + miApartamento.getNumeroHabitaciones());
        System.out.println("Tiene balcón: " + miApartamento.getTieneBalcon());
    }
}