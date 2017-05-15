/**
 * Created by francois on 15/05/17.
 */
public class Affichage {
    public static void afficher(Piece[][] tableau){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(tableau[i][j]. == 0 )
                    System.out.println "Tour";
                if(tableau[i][j]. == 1 )
                    System.out.println "Cavalier";
                if(tableau[i][j]. == 2 )
                    System.out.println "Fou";
                if(tableau[i][j]. == 3 )
                    System.out.println "Reine";
                if(tableau[i][j]. == 4 )
                    System.out.println "Roi";
                if(tableau[i][j]. == 5 )
                    System.out.println "Pion";
            }
        }
    }
}
