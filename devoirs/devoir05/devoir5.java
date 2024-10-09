package devoirs.devoir05;

import java.util.Scanner;

public class devoir5 {
    public static void main(String[] args) {
        // Générer un nombre aléatoire entre 1 et 100
        int nombreADeviner = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentative = 0;
        boolean trouve = false;

        // Boucle pour les tentatives de l'utilisateur
        while (!trouve) {
            // Demander à l'utilisateur d'entrer une valeur
            System.out.print("Entrez une valeur svp : ");
            tentative = scanner.nextInt();
            scanner.nextLine(); // pour ignorer la touche RETURN

            // Vérifier si la tentative est correcte
            if (tentative < nombreADeviner) {
                System.out.println("Trop petit");
            } else if (tentative > nombreADeviner) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Bravo, trouvé !");
                trouve = true;
            }
        }

        // Fermer le scanner
        scanner.close();
    }
    }

