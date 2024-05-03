package tp finale;

class moniteur extends peripherique{
   private int classeConsommation;
   private int dimension;
   private int resolutionMax;
   
   public moniteur(String id, String modele,int classeConsommation,int dimension,int resolutionMax){
    /* super(id,modele); */
    this.classeConsommation=classeConsommation;
    this.dimension=dimension;
    this.resolutionMax=resolutionMax;
   }
   public double calculerPuissance() {
    return classeConsommation * dimension + resolutionMax * 0.015;
}
 /*   dimension (entier), resolutionMax(entier)) dont la
puissance est calculée comme suit: classe * dimension + resolutionMax * 0.015. */
}
