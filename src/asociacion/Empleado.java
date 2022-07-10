
package asociacion;


public class Empleado {
    private String nombre;
    private float sueldo;
    private int codigo;
    private Jefe jefe;

    public Empleado(String nombre, float sueldo, int codigo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.codigo = codigo;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }
}
