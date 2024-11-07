import java.security.PublicKey;

public class ExercicesMethodesTableaux {
    public static void main(String[] args) {
        tab1(9);
        tab2(4);

        tab4(4);
        tab5(10);
        tab6(5);
        tab7(2);
        tab9(0);
        tab10(0);
       // tab11(5.5);
       // tab12(4);
    }

    public static void tab1(int bite) {
        int[] bit = new int[bite];
        System.out.println("ok");
    }

    public static void tab2(int voka) {
        int[] voda = new int[] { voka };
        System.out.println(voda[0]);
    }

    public static void tab3(int bober) {
        int[] bobr = new int[14];
        for (int i = 0; i < bobr.length; i++) {
            bobr[i] = (int) Math.random() *(10 + 1) - 1;
        }
        System.out.println("La case 3 = " + bobr[0]);
    }

    public static void tab4(int traska) {
        int[] tras = new int[3];
        for (int i = 0; i < tras.length; i++) {
            System.out.println(tras[i]);
        }
    }

    public static void tab5(int wkawaaka) {
        System.out.println("rrrrr");
    }

    public static void tab6(int jean) {
        int min = Math.min(20, 5);
        System.out.println("Le nombre Min est : " + min);
    }

    public static void tab7(int beer) {
        int max = Math.max(15, 2);
        System.out.println("Le nombre Max est : " + max);
    }

    public static void tab8(int many, int value) {
        int[] may = new int[10];
        for (int i = 0; i < may.length; i++) {
            if (may[i] == value) {
                many++;
            }
            System.out.println("Le nombre est" + "fois dans le tableau");
            // pas compris
        }
    }

    public static void tab9(int somm) {
        int MAX = 10;
        int MIN = 5;
        int nOtab = 10;
        int tot = 0;
        int[] som = new int[nOtab];
        for (int i = 0; i < som.length; i++) {
            som[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            tot = (tot + som[i]);
        }
    }

    public static void tab10(int klok) {
        int MAX = 10;
        int MIN = 5;
        int nOtab = 10;
        int tot = 0;
        int[] som = new int[nOtab];
        for (int i = 0; i < som.length; i++) {
            som[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            tot = (tot + som[i]);
            int moyenne = tot / nOtab;
            System.out.println("La moyenne est " + moyenne);
        }
    }

    //public static double tab11(double change) {
//double = -2;
   // }

    public static void tab12(int[] Occ, int search) {
        int pos = -1;
        for (int i = 0; i < Occ.length; i++) {
            if (Occ[i] == search) {
                pos = i;
                break;
            }
        }
    }

    public static void tab13(int bober) {

    }
}
