/**
 * Created by francois on 15/05/17.
 */
public class Affichage {
    public static void afficher(Piece[][] tableau){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print("|");
                if(tableau[i][j].type == 0 )
                    System.out.print("  ");
                if(tableau[i][j].type == 1 )
                    System.out.print("Ca");
                if(tableau[i][j].type == 2 )
                    System.out.print("Fo");
                if(tableau[i][j].type == 3 )
                    System.out.print("Re");
                if(tableau[i][j].type == 4 )
                    System.out.print("Ro");
                if(tableau[i][j].type == 5 )
                    System.out.print("Pi");
                if(tableau[i][j].type == 6 )
                    System.out.print("To");
            }
            System.out.println("|");
        }
    }
}
