package asociacion;

public class Futbolista {

    //Atributos
    private String nombre;
    private int edad;
    Pelota pelota;

    //Constructor
    public Futbolista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setPelota(Pelota pelota) {
        this.pelota = pelota;
    }

    public void saludar() {
        System.out.println("Hola soy " + nombre + " y  tengo " + edad + " años.");
        pelota.presentarse();
    }

    public void pelotear() {
        System.out.println("Yo " + nombre + " estoy jugando con mi pelota " + pelota.getModelo());
    }
}
