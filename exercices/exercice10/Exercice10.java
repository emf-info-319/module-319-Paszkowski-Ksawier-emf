package exercices.exercice10;

public class Exercice10 {
    public static void main(String[] args) {
       direBonjour();
       dire(null);
       math();

    }
    public static void direBonjour() {
System.out.println("Bonjour");
    }
    public static void dire(String bababa) {
System.out.println("nimp");
    }
  
    public static void math() {
        int max = Math.max(15, 2);
            System.out.println("Le nombre Max est : "+ max);
        int min  = Math.min(50, 30);
            System.out.println("Le nombre Min est : "+ min);
        double pow = Math.pow(5, 2);
            System.out.println(5 +" a la puissance de " + 2 + " = " + pow);
        double sqrt = Math.sqrt(1000.1);
            System.out.println("Le ");
        int abs = Math.abs(69);
    }

}
   

