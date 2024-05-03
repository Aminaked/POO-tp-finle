public class PC {
    private UC uc;
    private Peripherique[] peripheriques;

    public PC(UC uc, Peripherique[] peripheriques) {
        this.uc = uc;
        this.peripheriques = peripheriques;
    }

    public PC(PC pc) {
        this.uc = pc.uc;
        this.peripheriques = pc.peripheriques;
    }

    public double calConsoElec(int duree) throws ConsoException {
        double puissanceTotale = uc.getPuissance();
        for (Peripherique peripherique : peripheriques) {
            puissanceTotale += peripherique.calculerPuissance();
        }

        double consommation = puissanceTotale * duree;
        if (consommation > 1000) {
            throw new ConsoException();
        }

        return consommation;
    }