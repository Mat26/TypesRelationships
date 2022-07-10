
package Generalizacion;


public class Principal {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan", "9123123123", "1852 - PDH");
        Afiliado jose = new Afiliado("Jose", "89123131", "1452 - POO",3);
        Afiliado pedro = new Afiliado("Jose", "89123131", "1452 - OOP",4);
        
        Auto auto1 = new Auto("3","1852 - PDH");
        Auto auto2 = new Auto("4","1452 - POO");
        Moto moto = new Moto("1452 - OOP", "Forza 750-2021");
        
        System.out.println(juan);
        System.out.println("------------------------");
        System.out.println(jose);
        System.out.println("------------------------");
        System.out.println(pedro);
        System.out.println("------------------------");
        System.out.println(auto1);
        System.out.println("------------------------");
        System.out.println(auto2);
        System.out.println("------------------------");
        System.out.println(moto);
        
        juan.verificar(moto);
        jose.verificar(auto2);  
        
        
    }
}
