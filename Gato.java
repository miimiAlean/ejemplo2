public class Gato extends Animal {

     //Atributos
    String nombre;
    public int edad;
    
    //Método
    public void maullar(){
         System.out.println(nombre+ "está maullando y su edad es: " +edad +"años");
        }
     //Constructor
    public Gato(){
    
    }
    @Override
    void sonido(){
         System.out.println(nombre+ "está maullando y su edad es: " +edad +"años");
    }
}
