package coaching.Exercice2Min;

public class C1 {
    
    public static double PI = 3.14;
    public static void main(String[] args) {
        int bite = 10;
        int[] rayons = new int[bite];
        for (int i = 0; i < rayons.length; i++) {
          rayons[i]= genereNombre(1, 10);;  
        }
        for (int i = rayons.length- 1; i >= 0; i--) {
            if (rayons[i] > 50) {
    System.out.println("son aire = "+ PI*rayons[i]*rayons[i]);
            
        }
       
    }







public static int genereNombre(int min, int max) {
    int nA = min + (int) (Math.random()*(max - min + 1)) + 1;

}

}
