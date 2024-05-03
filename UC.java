package tp finale;

public class UC{
    private double FrequenceCPU; //Frequence CPU en MHz
    private CpaciteRAM;
    private double Puissance;
    public UC(double FrequenceCPU, int CpaciteRAM, double Puissance) { 
       /*  super();  */
        this.FrequenceCPU = FrequenceCPU;  
        this.CpaciteRAM=cpaciteRAM;
        this.Puissance=Puissance;
    }
    
    /*
     * Retourne la fréquence de la CPU.
     */
    public double getFrequenceCPU() 
    { return FrequenceCPU; }

    /*
     * Modifie la fréquence de la CPU.
     */
    public void setFrequenceCPU(double freq) 
    { this.FrequenceCPU = freq; }

    /*
     * Retourne la capacité en octets de la RAM associée à cette UC.
     */
    public int getCapaciteRAM()
     { return CpaciteRAM; }

    /*
     *modifier la capacite de la ram
     */
    public void setCapaciteRAM(int CapaciteRAM)
     { this.CapaciteRAM = CapaciteRAM; }

    /*   
    * retourne la puissance l'UC
    */
     public int getPuissance()
     { return Puissance; }

    /*
     *modifier la puissance
     */
    public void setPuissance(int puissance)
     { this.Puissance = puissance; }

    /*
     * Ajoute une mémoire RAM à l'UC courante. Si on dépasse la capacité maximale,
     * il y a un échec et false est retourné. Sinon, true est retourné.
     */
    public boolean ajouterMemoire(int octet) {
        if (octet + CpaciteRAM > CpaciteRAM) return false;
        else {
            CpaciteRAM += octet
}}}
