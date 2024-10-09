public class Paszkowski {
    public final static int NOMBRE_PTS_VICTOIRE = 3;
    public static void main(String[] args) {
        String nomEquipe1 = "Barcelone";
        String nomEqiupe2 = "Madrid";
        int nombrePointequipe1 = 0;
        int nombrePointequipe2 = 0;

            int scoreEquipe1 = 0; 
            int scoreEquipe2 = 0;
            for (int i = 0; i < 10; i++) {
            scoreEquipe1 = (int) (Math.random() * (10 - 1 + 1)) + 1;
            scoreEquipe2 = (int) (Math.random() * (10 - 1 + 1)) + 1;
                System.out.println(nomEquipe1 +"joue contre "+ nomEqiupe2 +" le résultat est : "+ scoreEquipe1 +" à "+ scoreEquipe2);
            
                        if (scoreEquipe1 > scoreEquipe2){
                            nombrePointequipe2 += NOMBRE_PTS_VICTOIRE;
                        System.out.println(nomEquipe1 + " a gagné");}
                        
                        else { nombrePointequipe1 += NOMBRE_PTS_VICTOIRE; System.out.println(nomEqiupe2 + " a gagné");
                        }
                        if (scoreEquipe1 == scoreEquipe2)
                        System.out.println("Match nul");
                    }
    
    }
}
