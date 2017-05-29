/**
 * Created by francois on 09/05/17.
 */
import java.util.Scanner;
public class Echecs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plateau jeu = new Plateau();
        Affichage.afficher(jeu.plateau);
        String caseDepart = "0";
        do{
            System.out.println("Quelle pièce voulez vous déplacer ?");
            caseDepart = sc.nextLine();
            if(!jeu.pieceExiste(caseDepart)) System.out.println("Il n'y a aucune pièce sur cette case !");
        }while(!jeu.pieceExiste(caseDepart));
        String caseArrivee = "0";
        do{
            System.out.println("Où cette pièce doit-elle aller ?");
            String str = sc.nextLine();
            if(!jeu.deplacer(caseDepart,caseArrivee)) System.out.println("Ce déplacement est impossible !");
        }while(!jeu.deplacer(caseDepart,caseArrivee));

    }
}
