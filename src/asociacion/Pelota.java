package asociacion;

public class Pelota {

    private String marca;
    private String modelo;

    Futbolista futbolista;

    public Pelota(String marca, String modelo, Futbolista futbolista) {
        this.marca = marca;
        this.modelo = modelo;
        this.futbolista = futbolista;
        futbolista.setPelota(this);//Comunicación entre clases, se conocen!!!
    }

    public String getModelo() {
        return modelo;
    }

    public void presentarse() {
        System.out.println("Soy la pelota " + marca + " y de modelo " + modelo);
        futbolista.pelotear();
    }
}
