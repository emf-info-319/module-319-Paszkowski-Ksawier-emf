package exercices.exercice11;

public class ExercicesInversionTableau {
    public static int min = 0;
    public static int max = 100;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("Tableau : " + tableauInitial[i]);

        }

        int[] tableauFinal = new int[4];
        inverseTableau(tableauInitial);
        System.out.println("lalalala" + tableauFinal);
    }

    public static int[] inverseTableau(int[] tableauInitial) {
        int taille = tableauInitial.length;
        for (int i = 0; i < tableauInitial.length; i++) {
            inverseTableau(tableauInitial) = tableauInitial[i--];
        }
    }

}
