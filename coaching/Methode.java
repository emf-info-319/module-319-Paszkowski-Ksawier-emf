public class Methode {
    public static void main(String[] args) {
        int resultat = additionne(5, 7);
        System.out.println("Le resultat est : "+ resultat);

        int reponse2 = additionne(3,3);
        System.out.println("Le resultat est : "+ reponse2);

        String[] tab = new String[10];
        tab = Tablesau(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    public static int additionne(int nbre1, int nbre2) {
int resultat = nbre1 + nbre2;
return resultat;
    }
    public static String[] Tablesau(String[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] = "Bonjour";
        }
        return tab;
    }

    
}
