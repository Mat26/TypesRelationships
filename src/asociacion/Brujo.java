package asociacion;

public class Brujo {

    public String nombre;
    public Mascota compañero;

    public void mostrar() {
        System.out.println("El brujo se llama " + nombre + " tiene de mascota un(a) " + compañero.tipoAnimal
                + " llamado(a) " + compañero.nombre);
    }
}
