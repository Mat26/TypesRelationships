
package asociacion;

import java.util.ArrayList;
import java.util.List;


public class Programa {
     private String nombre;
    private float peso;

    List<Usuario> usuarios = new ArrayList<>();

    public Programa(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUsuario(Usuario usuario) {
        if (!this.usuarios.contains(usuario)) {
            this.usuarios.add(usuario);
            System.out.println("Usuario " + usuario.getNombre() + " bienvenido a " + nombre + ".");
        } else {
            System.out.println("Este usuario ya ha sido registrado en la base de datos.");
        }
    }
}
