class Deplacement {
    //Coordonnées case de départ
    private Coordonnees depart;

    //Coordonnées case d'arrivée
    private Coordonnees arrivee;

    //Déplacement sur les lignes
    private int dL;

    //Déplacement sur les colonnes
    private int dC;

    /*
        CONSTRUCTEUR
        @param prend en paramètre les coordonnées de départ et d'arrivée
    */
    Deplacement (Coordonnees depart, Coordonnees arrivee){
        this.arrivee = arrivee;
        this.depart = depart;
        this.dL = arrivee.getLigne() - depart.getLigne();
        this.dC = arrivee.getColonne() - depart.getColonne();
    }


    //getter
    int getdL(){
        return dL;
    }

    int getdC(){
        return dC;
    }

    Coordonnees getDepart(){
        return depart;
    }

    Coordonnees getArrivee(){
        return arrivee;
    }

}
