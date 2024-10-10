package Eval;

import java.security.PublicKey;

public class Paszkowski {
    public static final int NOTE_MIN = 1;
    public static final int NOTE_MAX = 6;
    public static final int NBRE_NOTE = 5;
public static void main(String[] args) {

    int[] noteObtenues = new int[NBRE_NOTE];
        for (int i = 0; i < noteObtenues.length; i++) {
            noteObtenues[i] = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1) + 1);
}
double totalNote = 0;
    for (int i = 0; i < noteObtenues.length; i++) {
        
        int noteFinal = (noteObtenues[i]);
        totalNote = totalNote + noteObtenues[i];
            switch (noteFinal) {
                case 4://si 4 est = a note alors sout ...
                    System.out.println("La note obtenue est " + noteObtenues[i] + " : suffisant");
                    break;
                case 5:
                System.out.println("La note obtenue est " + noteObtenues[i] + ": bien");
                    break;
                case 6:
                    System.out.println("La note obtenue est " + noteObtenues[i] + ": très bien");
                    break;
                default:
                    System.out.println("La note obtenue est " + noteObtenues[i] + ": insuffisant");
                    break;
        }
    }
    double totalNote = (noteObtenues[0]+noteObtenues[1]+noteObtenues[2]+noteObtenues[3]+noteObtenues[4]);
            double moyenne = (totalNote/NBRE_NOTE);
            System.out.println("La moyenne est de :" + moyenne);
            if (moyenne >= 4) {System.out.println("L'élève est promu !");}
            else {System.out.println("L'élève est non promu !");}
    
    
}
}