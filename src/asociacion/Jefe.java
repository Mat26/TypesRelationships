
package asociacion;

import java.util.ArrayList;
import java.util.List;


public class Jefe {
    private String nombre;
    private int dni;
    List<Empleado> empleados = new ArrayList<>();

    public Jefe(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void contratar(Empleado empleado) {
        boolean encontrado = false;
        if (this.empleados.isEmpty()) {
            empleado.setJefe(this);
            this.empleados.add(empleado);
            System.out.println("Empleado " + empleado.getNombre() + " ha sido contratado/a exitosamente.");
        } else {
            for (Empleado e : this.empleados) {
                if (e.getCodigo() == empleado.getCodigo()) {
                    System.out.println(empleado.getNombre() + " ya fue agregado/a Anteriormente");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                this.empleados.add(empleado);
                empleado.setJefe(this);
                System.out.println("Empleado " + empleado.getNombre() + " ha sido contratado/a exitosamente.");
            }

        }
    }
}
