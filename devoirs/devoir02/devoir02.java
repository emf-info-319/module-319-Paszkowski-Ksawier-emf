package devoirs.devoir02;

public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 1 + 1) ) + 1 ;
            System.out.println("il y a " + CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B + " litres à remplir");
        while (reservoirA < 3) {
            System.out.println("Remplissage du reservoir A...");
            ++reservoirA;
            System.out.println("Le reservoir A : " + reservoirA + ", le reservoir B : " + reservoirB);
        }
        while (reservoirB < 5) {
            System.out.println("Remplissage du reservoir B...");
            ++reservoirB;
            System.out.println("Le reservoir A : " + reservoirA + ", le reservoir B : " + reservoirB);
    } System.out.println("Remplissage terminé!");
        }
    }
