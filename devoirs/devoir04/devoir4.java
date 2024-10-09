package devoirs.devoir04;

public class devoir4 {
    public static void main(String[] args) {
       // Déclaration des variables
    int annee = 2024;
    int mois = 10;
    int jour = 9;

       // Affichage de la date entrée
    System.out.println("La date entrée est le " + jour + "." + mois + "." + annee);

       // Vérification des limites de l'année
    if (annee < 0 || annee > 9999) {
        System.out.println("L'année [" + annee + "] est hors limites !");
        return;
    }

       // Vérification des limites du mois
    if (mois < 1 || mois > 12) {
        System.out.println("Le mois [" + mois + "] est hors limites !");
        return;
    }

       // Vérification des limites du jour
    if (!jourValide(jour, mois, annee)) {
        System.out.println("Le jour [" + jour + "] est hors limites !");
        return;
    }

       // Affichage de la date formatée
    System.out.println("La date formatée est le " + jour + " " + nomDuMois(mois) + " " + annee);
}

   // Méthode pour vérifier si le jour est valide
public static boolean jourValide(int jour, int mois, int annee) {
    int[] joursDansLeMois = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      // Vérification des années bissextiles
    if (mois == 2 && estBissextile(annee)) {
        joursDansLeMois[2] = 29;
    }

    return jour > 0 && jour <= joursDansLeMois[mois - 1];
}

   // Méthode pour vérifier si une année est bissextile
public static boolean estBissextile(int annee) {
    return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
}

   // Méthode pour obtenir le nom du mois
public static String nomDuMois(int mois) {
    String[] nomsDesMois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};
    return nomsDesMois[mois - 1];
    }
}

