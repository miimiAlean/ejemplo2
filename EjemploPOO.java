public class EjemploPOO{
    public static void main(String[] args) {
        Perro miPerrito=new Perro();
        miPerrito.nombre="Firulais";
        miPerrito.edad=3;
        miPerrito.ladrar();

        Gato miGato=new Gato();
        miGato.nombre="Pelusa";
        miGato.edad= 2;
        miGato.maullar();

        CuentaBancaria cuenta=new CuentaBancaria();
        cuenta.setSaldo(100.000);
        System.out.println("El saldo es "+cuenta.getSaldo());
    }
}
