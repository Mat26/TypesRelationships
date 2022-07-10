
package Generalizacion;


public class Afiliado extends Persona {
    private int antiguedad;
    
    public Afiliado(String nombre, String ci, String vehiculoAsignado, int antiguedad){
        super(nombre, ci, vehiculoAsignado);
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + "Afiliado{" + "antiguedad=" + antiguedad + '}';
    }
    
}
