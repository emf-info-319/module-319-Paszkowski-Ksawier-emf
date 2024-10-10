package exercices.exercice12;

public class ExercicesString {
    public static void main(String[] args) {
        String maChaineDeCaractere = "Voici du contenu stocké dans un String";
        System.out.print("Nombre de caractères contenu dans la variable maChaineDeCaractere : ");
        System.out.println(maChaineDeCaractere.length());
        System.out.print("Le mot \"contenu\" commence à la position : ");
        System.out.println(maChaineDeCaractere.indexOf("contenu"));
        System.out.print("La position 10 contient la lettre : ");
        System.out.println(maChaineDeCaractere.substring(10, 11));

        String monPrenom = "Ksawier";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère" + monPrenom + " contient le texte " + "test");

        } else {
            System.out.println("La chaîne de caractère" + monPrenom + " ne contient pas le texte " + "test");
        }
    }
}
