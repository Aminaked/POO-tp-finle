package tp finale;

class clavier extends peripherique {
   private int nbTouches;
   private double puissanceclv;

public clavier(String id, String modele,int nbTouches,double puissanceclv) {
   /*  super(id,modele); */
    this.nbTouches = nbTouches;
    this.puissanceclv = puissanceclv;
}
public double calculerPuissance() {
    return puissanceclv;
}
}