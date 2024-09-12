package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        
        int monage = 22;
        boolean estmajeur;

        System.out.println("J'ai " +  monage + " ans");

        if (monage >= 20) {
            estmajeur =true;
        } else {
            estmajeur = false;
        }
        if (estmajeur) {
            System.out.println("Je suis majeur");
        }
        else {System.out.println("Je suis mineur");}
    }
}
