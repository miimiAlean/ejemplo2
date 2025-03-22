public class CuentaBancaria {
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo (double cantidad){
        if (cantidad > 0) {
            saldo= saldo + cantidad;
        }
        
    }
}
