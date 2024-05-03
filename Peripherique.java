package tp finale;

public abstract class Peripherique {
    private string id;
    private string modele;


    public peripherique(string id, string modele) {
        this.id=id;
        this.modele = modele;
    }

    public abstract double calculerPuissance();
}
