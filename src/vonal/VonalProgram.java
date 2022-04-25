package vonal;
//hossz szín típus eltolás

public class VonalProgram {

    public static void main(String[] args) {
        Vonal v4 = new Vonal(11, 5, "fekete", "szimpla");
        System.out.println(v4);

        Vonal v3 = new Vonal(5, "fekete", "szimpla");
        System.out.println(v3);

        Vonal v1 = new Vonal(5);
        System.out.println(v1);

        Vonal v0 = new Vonal();
        System.out.println(v0);
        
        System.out.println("Tesztek Hibás esetre:");
                
    }

}
