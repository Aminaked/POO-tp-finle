package tp finale;
public class TestFInale {
    public static void main(String[] args) {
        UC uc = new UC(3.4, 16, 500);
        Peripherique[] peripheriques = {
                new Moniteur("MN", "Modèle1", 2, 18, 1700),
                new Clavier("KB", "Modèle2", 102, 5)
        };
        PC pc0 = new PC(uc, peripheriques);

        try {
            double consommation = pc0.calConsoElec(5);
            System.out.println("La consommation électrique du PC pour une durée de 5 heures est de : " + consommation + " Watts.");
        } catch (ConsoException e) {
            System.out.println("La consommation électrique dépasse la valeur 1000.");
        }
    }
}
