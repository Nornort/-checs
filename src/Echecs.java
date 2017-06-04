/**
 * Created by francois on 09/05/17.
 */
import java.util.Scanner;
public class Echecs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plateau jeu = new Plateau();
        boolean couleur = false;
       // Annonce à qui est le tour//
        while(true){
            Affichage.afficher(jeu.plateau);
            couleur = !couleur;
            System.out.println("Au tour des " + (couleur ? "Blancs." : "Rouges."));
            String caseDepart = "0";
            // Demande des coordonnées de départ et d'arrivée et réitère l'opération tant que le déplacement est impossible//
            while(true){
                do{
                    System.out.println("Quelle pièce voulez vous déplacer ?");
                    caseDepart = sc.nextLine();
                    if (!jeu.pieceExiste(caseDepart,couleur)) System.out.println("Cette pièce n'est pas disponible");
                }while(!jeu.pieceExiste(caseDepart,couleur));
                String caseArrivee = "0";
                System.out.println("Où cette pièce doit-elle aller ?");
                caseArrivee = sc.nextLine();
                if (!jeu.deplacer(caseDepart, caseArrivee)) System.out.println("Ce déplacement est impossible !");
                else break;
            }
        }
    }
}
