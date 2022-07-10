
package Generalizacion;


public class Moto extends Vehiculo{
    private String modelo;

    public Moto(String placa, String modelo) {
        super(placa);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "modelo=" + modelo + '}';
    }
    
    
}
