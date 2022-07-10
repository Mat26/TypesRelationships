
package asociacion;


public class MainAsociacion {
    public static void main(String[] args) {
        //ASOCIACIÓN NORMAL(COMUNICACIÓN MUTUA)
        Futbolista f1 = new Futbolista("Juan", 18);
        Pelota p1 = new Pelota("Adidas", "Brazuka", f1);//Se establece la relación para que haya comunicación entre las dos..
        //Ambos ya se pueden comunicar...
        f1.saludar();
        System.out.println("<-------------------------------------------------->");
        //ASOCIACIÓN DIRECTA(COMUNICACIÓN NO MUTUA)        
        Brujo brujo1 = new Brujo();
        brujo1.nombre = "Harry Potter";
        Brujo brujo2 = new Brujo();
        brujo2.nombre = "Ron";

        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Hedwing";
        mascota1.tipoAnimal = "Buho";
        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Scabbers";
        mascota2.tipoAnimal = "Rata";
        //Asociación...
        brujo1.compañero = mascota1;
        brujo2.compañero = mascota2;

        brujo1.mostrar();
        brujo2.mostrar();
        System.out.println("<-------------------------------------------------->");
        //CLASE DE ASOCIACIÓN
        Persona per1 = new Persona("Juan");
        Inmueble in1 = new Inmueble("116A", 11);
        Renta r1 = new Renta(per1, in1, 1000000, 24);

        r1.valorTotalInmueble();
        System.out.println("<-------------------------------------------------->");
        //ASOCIACIÓN DE UNO A MUCHOS O DE MUCHOS A UNO
        Jefe jefe1 = new Jefe("Diana", 123);
        Empleado e1 = new Empleado("Sandra", 1000000, 1);
        Empleado e2 = new Empleado("Diego", 2000000, 2);
        Empleado e3 = new Empleado("Laura", 3000000, 3);

        jefe1.contratar(e1);
        jefe1.contratar(e2);
        jefe1.contratar(e3);
        jefe1.contratar(e1);
        System.out.println("<-------------------------------------------------->");
        
        //ASOCIACION DE MUCHOS A MUCHOS
        Usuario u1 = new Usuario("Javier", 111);
        Usuario u2 = new Usuario("Angie", 222);

        Programa p3 = new Programa("Adobe Illustrator", 5.2f);
        Programa p2 = new Programa("Call of Duty", 3.2f);

        u1.instalarPrograma(p3);
        u2.instalarPrograma(p3);
        u1.instalarPrograma(p3);
        System.out.println("<-------------------------------------------------->");
    }
    
}
