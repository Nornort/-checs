/**
 * Created by francois on 15/05/17.
 */
public class Fou extends Piece{
	
    /** 
    * Constructeur de la classe cavalier
    * @param Prend en parametre la couleur de la tour
    * 
    */	
    public Fou(boolean couleur){
        super(couleur,"Fo");
           public boolean DeplacementPossible (int M; int N; int P; int Q)
               int k;
        boolean d;
			if (P==M+k || Q==N+k){
					tableau[M][N]=0;
					tableau[P][Q]="Fo";
            }    
            if (P==M-k || Q==N+k){
					tableau[M][N]=0;
					tableau[P][Q]="Fo";
            }
            if (P==M+k || Q==N-k){
					tableau[M][N]=0;
					tableau[P][Q]="Fo";
                }
             if (P==M+k || Q==N+k){
					tableau[M][N]=0;
					tableau[P][Q]="Fo";
             }
             if (P==M+k || Q==N+k){
					tableau[M][N]=0;
					tableau[P][Q]="Fo";
                
			} else {
					System.out.println("Mouvement impossible");
				}
			

    
    }
}
