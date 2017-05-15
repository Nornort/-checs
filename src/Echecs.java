/**
 * Created by francois on 09/05/17.
 */
import java.util.Scanner;
public class Echecs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Plateau jeu = new Plateau();
        Affichage.afficher(jeu.plateau);
        int str = sc.nextInt();
    }
}
