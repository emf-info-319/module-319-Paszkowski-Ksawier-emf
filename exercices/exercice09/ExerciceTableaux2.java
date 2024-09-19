public class ExerciceTableaux2 {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = (int) (Math.random() * 6) + 1; //chaque Valeur d'un Index aura une valeur (random) entre 1 - 6
            System.out.println("Cellule " + i +" : "+tab1[i]);
        }
    }
}
