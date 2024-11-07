package RP.java;

public class RPe1 {
    public static double PI = 3.14;

    public static void main(String[] args) {
//if / else

//if / else if
int temperature = 16;
if (temperature < -10)
                        System.out.println("Il fait très froid");
                else if (temperature >= -10 && temperature < 0)
                        System.out.println("Il fait froid");
                else if (temperature >= 0 && temperature <25) 
                        System.out.println("Il fait normal");
                else if (temperature >= 25 && temperature <35 ) 
                        System.out.println("Il fait chaud");
                else if (temperature >= 35) 
                        System.out.println("Il fait très chaud"); {
        }

//MathRandom
int[] tab1 = new int[10];
       for (int i = 0; i < tab1.length; i++) {
           tab1[i] = (int) Math.random() * (10 - 0 + 1) + 0; //chaque Valeur d'un Index aura une valeur (random) entre 1 - 6
           System.out.println("Cellule " + i +" : "+tab1[i]);

//boucles
for (int iteration = 0; iteration <= 5; iteration++) {
    if (iteration == 2) {
        continue;
    }
    System.out.println("Boucle for, iteration " + iteration);

}

int iiteration = 5;
while (iiteration < 10) {
    ++iiteration;
    System.out.println("Boucle while, iteration" + iiteration);
}

int iiiteration = 11;
do {
    System.out.println("Boucle do-while, iteration " + iiiteration);
    ++iiiteration;
} while (iiiteration <= 15);
{
}



        int[] rayons = new int[10];
        for (int j = 0; j < rayons.length; j++) {
            if (rayons[i] > 0) {
                System.out.println("Aire = " + PI * rayons[j] + rayons[j]);
            }
        }

        }
    }
}

