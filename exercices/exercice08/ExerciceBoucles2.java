package exercices.exercice08;

public class ExerciceBoucles2 {
    public static void main(String[] args) {
        for (int iteration = 5; iteration >= 1; iteration--) {
            System.out.println("Boucle for, iteration " + iteration);

            
        }

        int iiteration = 6;
        while (iiteration >1) {
                --iiteration;
            System.out.println("Boucle while, iteration " + iiteration);
        }

        int iiiteration = 5;
        do {
            System.out.println("Boucle do-while, iteration " + iiiteration);
            --iiiteration;
        } while (iiiteration >= 1);{ 
    }
    }
}
