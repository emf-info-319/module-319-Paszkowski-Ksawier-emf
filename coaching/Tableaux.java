package coaching;

class Tableaux {
public static void main(String[] args) {
    int[] tab1 = {4, 8, 7, 9, 1, 5, 4, 6}; // créer tableau avec valeur
    int[] tab2 = {7, 6, 5, 2, 1, 3, 7, 4};

    int[] resultat = new int[tab1.length];// créer tableau avec sa taille

    for (int i = 0; i < resultat.length; i++) {
        int addition = tab1[i] + tab2[i];// plus simplement = resultat[i]= tab1[i] + tab2[i]
        resultat[i] = addition;
        System.out.println(resultat[i]);   
    }
    
}
    
}