package coaching;

public class Tableau {
    public static void main(String[] args) {
        int[] notes = new int[5];// declaration et creation
        for (int i = 0; i < notes.length; i++) {// boucle -> i = 0 passe a l'index suivant tant que i est plus petit que notes[] donc 5
            notes[i] = 5;// chaque case d'un index = 5
        }
        System.out.println("La case 2 = " + notes[2]); // affiche la 2eme case
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Note " + i + " : " + notes[i]);// affiche a la suite chaque index avec sa valeur
        }

    }

}
