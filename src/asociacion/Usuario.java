
package asociacion;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nombre;
    private int clave;

    List<Programa> programas = new ArrayList<>();

    public Usuario(String nombre, int clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }

    public void instalarPrograma(Programa programa) {
        if (!this.programas.contains(programa)) {
            this.programas.add(programa);
            programa.setUsuario(this);
            System.out.println("El programa " + programa.getNombre() + " ha sido instalado/a exitosamente.");
        } else {
            System.out.println(programa.getNombre() + " ya fue instalado/a Anteriormente");
        }

    }
}
