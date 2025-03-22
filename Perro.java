public class Perro extends Animal{
    //Atributos
    String nombre;
    public int edad;

    //Método
    public void ladrar(){
        System.out.println(nombre+ "está ladrando y su edad es: " +edad + "años");
    }
    //Constructor
    public Perro(){

    }
    @Override
    void sonido(){
        System.out.println(nombre+ "está ladrando y su edad es: " +edad + "años");
    }
}