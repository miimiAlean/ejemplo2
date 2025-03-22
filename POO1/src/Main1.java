public class Main1 {

    public static void main(String[] args) {
        //* Conversión implícita
        int numeroEntero= 10;
        double numeroDecimal=numeroEntero;
        System.out.println("Valor convertido de entero a doble = "+numeroDecimal);
        
        double numeroDecimal1= 7.65;
        int numeroEntero1= (int)numeroDecimal1;
        System.out.println("Valor convertido de doble a entero = " +numeroEntero1);
        
        byte b= 10;
        short s=b;
        
        char c= 'A';
        int i= c;
        System.out.println("El valor de A en ascii es " +i);
        
        int j=100;
        byte b2= (byte) j;
        System.out.println("Valor de entero 100 a byte es = " +b2);
        
        //*Lecturas por teclado
        
    }
    
}
