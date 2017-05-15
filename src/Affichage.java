/**
 * Created by francois on 15/05/17.
 */
public class Affichage {
    public static void afficher(Piece[][] tableau){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(tableau[i][j].type == 0 )
                    System.out.println " ";
                if(tableau[i][j].type == 1 )
                    System.out.println "Ca";
                if(tableau[i][j].type == 2 )
                    System.out.println "Fo";
                if(tableau[i][j].type == 3 )
                    System.out.println "Re";
                if(tableau[i][j].type == 4 )
                    System.out.println "Ro";
                if(tableau[i][j].type == 5 )
                    System.out.println "Pi";
                if(tableau[i][j].type == 6 )
                    System.out.println "To";
            }
        }
        System.out.println"|"
    }
}
