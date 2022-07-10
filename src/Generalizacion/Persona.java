
package Generalizacion;


public class Persona {
    //Atributos
    private String nombre;
    private String ci;
    private String vehiculoAsignado;
    //Constructor
    public Persona(String nombre, String ci, String vehiculoAsignado){
        this.nombre = nombre;
        this.ci = ci;
        this.vehiculoAsignado = vehiculoAsignado;
    }
    
    public void verificar(Vehiculo vehiculo){
        if(vehiculo.getPlaca().equals(this.vehiculoAsignado)){
            System.out.println("La persona " + nombre + " tiene asignado el vehiculo " + vehiculo.getPlaca());
        }else{
            System.out.println("La persona " + nombre + " no tiene asignado el vehiculo " + vehiculo.getPlaca());
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", ci=" + ci + ", vehiculoAsignado=" + vehiculoAsignado + '}';
    }
    
    
}
