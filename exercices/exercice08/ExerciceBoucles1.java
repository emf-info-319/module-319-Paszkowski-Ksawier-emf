package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {

        for (int iteration = 0; iteration <= 5; iteration++) {
            if (iteration == 2) {
                continue;
            }
            System.out.println("Boucle for, iteration " + iteration);

        }

        int iiteration = 5;
        while (iiteration < 10) {
            ++iiteration;
            System.out.println("Boucle while, iteration" + iiteration);
        }

        int iiiteration = 11;
        do {
            System.out.println("Boucle do-while, iteration " + iiiteration);
            ++iiiteration;
        } while (iiiteration <= 15);
        {
        }
    }
}
