
public class Livret {
    public static int MIN = 5;
    public static int MAX = 20;

    public static void main(String[] args) {

        int nbre1 = choisirUnNombre();
        int nbre2 = choisirUnNombre();
        System.out.println("Les deux nombres sont : " + nbre1 + " , " + nbre2);
        String[] tab = construireTableMultiplication(nbre1, nbre2);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int choisirUnNombre() {
        return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
    }

    public static String[] construireTableMultiplication(int n1, int n2) {
        String[] tab = new String[n1 * n2];
        int a = 1;
        int b = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = a + " x " + b + " = " + (a * b);
            b++;
            if (b == n2 + 1) {
                b = 1;
                a++;
                if (a == n1 + 1) {

                }
            }
        }
        return tab;
    }
}
