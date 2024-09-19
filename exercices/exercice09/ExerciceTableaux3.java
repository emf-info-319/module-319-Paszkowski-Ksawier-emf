public class ExerciceTableaux3 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 6) + 1; //chaque Valeur d'un Index aura une valeur (random) entre 1 - 6
            System.out.println("Cellule " + i +" : "+tab1[i]);
        }
        int M =  0;
        for (int i = 0; i < tab1.length; i++) {
            M += tab1[i];
        // calcule de la somme des valeurs de tableau
        }
    
        M = (M /10); //calcule la moyenne
        System.out.println("la moyenne est de "+ M);
        }
    }

