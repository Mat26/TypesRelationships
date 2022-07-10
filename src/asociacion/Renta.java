package asociacion;

public class Renta {

    public Persona persona;
    public Inmueble inmueble;
    public double costoMensual;
    public double duracionMeses;

    Renta(Persona persona, Inmueble inmueble, double costoMensual, double duracionMeses) {
        this.persona = persona;
        this.inmueble = inmueble;
        this.costoMensual = costoMensual;
        this.duracionMeses = duracionMeses;
    }

    public void valorTotalInmueble() {
        System.out.println("Para la persona " + persona.nombre + " el valor total por el inmueble ubicado en la calle "
                + inmueble.calle + " y N" + inmueble.numero + " es: " + costoMensual * duracionMeses);
    }
}
