
package Generalizacion;

public class Auto extends Vehiculo{
    private String nroAsientos;

    public Auto(String nroAsientos, String placa) {
        super(placa);
        this.nroAsientos = nroAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + " Auto{" + "nroAsientos=" + nroAsientos + '}';
    }
    
    
    
}
