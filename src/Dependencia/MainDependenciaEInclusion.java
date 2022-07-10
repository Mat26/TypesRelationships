package Dependencia;

public class MainDependenciaEInclusion {

    public static void main(String[] args) {
        //DEPENDENCIA
        Impresora i1 = new Impresora("2004");
        i1.imprimir("Esta es una relación de dependencia");
        //Otros ejemplos como la libreria Math

        System.out.println("<-------------------------------------------------->");
        //INCLUSIÓN AGREGACIÓN Y COMPOSICIÓN
        SmartPhone cel = new SmartPhone("A10PRO", 3400, "Samsung");

        Chip claro = new Chip("Claro", 79033881);
        Chip tigo = new Chip("Tigo", 69920081);
        Chip movistar = new Chip("Movistar", 39920081);

        cel.agregarChip(claro);
        cel.agregarChip(tigo);
        cel.agregarChip(movistar);

        cel.mostrar();
        claro.mostrar();
        System.out.println("<-------------------------------------------------->");
        //OBJETOS RECURSIVOS
        Persona estudiante = new Persona("Miguel", null);
        Persona profesor = new Persona("Marta", estudiante);

        profesor.enseñar(estudiante);

        System.out.println("<-------------------------------------------------->");
    }

}
//DEPENDENCIA

class Impresora {

    private String modelo;

    Impresora(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(String informacion) {
        System.out.println(Papel.setTexto(informacion));
    }
}

class Papel {

    private static final String MEDIDA = "2x3";

    public static String setTexto(String texto) {
        return "En el papel se imprimio: " + texto + " en hoja de " + MEDIDA;
    }
}

//INCLUSIÓN AGREGACIÓN Y COMPOSICIÓN
class Bateria {

    //Atributos
    private int mAh;
    private String marca;

    public Bateria(int mAh, String marca) {
        this.mAh = mAh;
        this.marca = marca;
    }

    public void mostrar() {
        System.out.println("Cantidad mAh: " + this.mAh);
        System.out.println("Marca: " + this.marca);
    }
}

class Chip {

    private String empresa;
    private int numero;

    public Chip(String empresa, int numero) {
        this.empresa = empresa;
        this.numero = numero;
    }

    public void mostrar() {
        System.out.println("\tEmpresa: " + empresa);
        System.out.println("\tNro cel: " + numero);
    }
}

class SmartPhone {

    private String modelo;
    private Bateria bateria; //Es el atributo que hace la relación de composición con la clase bateria.
    private int nroChips;
    private Chip[] chips;//Es el atributo que hace la relación de agregación con la clase chip.

    SmartPhone(String modelo, int cantMAh, String marcaBateria) {
        this.modelo = modelo;
        this.bateria = new Bateria(cantMAh, marcaBateria);//Hay una estrecha dependencia.
        this.nroChips = 0;//Se inicializa sin chips ya que no inicia con ninguno.
        this.chips = new Chip[2];//Un vector al que eventualmente se le agregaran los chips.
    }

    SmartPhone() {

    }

    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        bateria.mostrar();
        System.out.println("Nro Chips: " + nroChips);
        for (int i = 0; i < nroChips; i++) {
            chips[i].mostrar();
        }
    }

    //Es importante en la agregación para adicionar objetos...
    public void agregarChip(Chip nuevoChip) {
        if (nroChips < 2) {
            chips[nroChips] = nuevoChip;
            nroChips++;
        } else {
            System.out.println("No se pueden agregar mas chips.");
        }
    }

}

//OBJETOS RECURSIVOS
class Persona {

    private String nombre;
    private Persona persona;

    public Persona(String nombre, Persona persona) {
        this.nombre = nombre;
        this.persona = persona;
    }

    public void enseñar(Persona persona) {
        System.out.println(nombre + " le enseña a su alumno " + persona.nombre);
    }
}
