import java.util.Scanner;
public class Echecs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plateau jeu = new Plateau(); //Initialise le plateau de jeu.
        boolean couleur = false;
        while(!jeu.roiMange()){ //Tant qu'aucun des deux rois n'est mangé
            Affichage.afficher(jeu.plateau); //Afiche le plateau de jeu
            couleur = !couleur; //Change de couleur à chaque tour
            System.out.println("Au tour des " + (couleur ? "blancs." : "rouges.")); //Annonce à qui est le tour.
            String caseDepart = "0";
            while(true){
                do{
                    //Demande des coordonnées de départ
                    System.out.println("Quelle pièce voulez vous déplacer ?");
                    caseDepart = sc.nextLine();
                    //Vérifie que la pièce choisie existe et est du camp du joueur
                    if (!jeu.pieceExiste(caseDepart,couleur)) System.out.println("Cette pièce n'est pas disponible");
                }while(!jeu.pieceExiste(caseDepart,couleur));
                String caseArrivee = "0";
                //Demande les coordonnées d'arrivée
                System.out.println("Où cette pièce doit-elle aller ?");
                caseArrivee = sc.nextLine();
                //Vérifie que le déplacement est valide
                if (!jeu.deplacer(caseDepart, caseArrivee)) System.out.println("Ce déplacement est impossible !");
                else break;
            }
        }
        //Annonce le vainqueur
        System.out.println("Jeu terminé ! Les " + (jeu.gagnant() ? "blancs" : "rouges") + " ont gagné !");
    }
}
