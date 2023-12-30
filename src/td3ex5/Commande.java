package td3ex5;

public abstract class Commande {

    protected double montantHt;
    protected double montantTva;
    protected double montantTtc;

    public Commande(double montantHt) {
        this.montantHt = montantHt;
    }

    public void calculeMontantTtc() {
        calculeTva();
        montantTtc = montantHt + montantTva;
    }

    protected abstract void calculeTva();

    public void affiche() {
        System.out.println("Montant HT: " + montantHt);
        System.out.println("Montant TVA: " + montantTva);
        System.out.println("Montant TTC: " + montantTtc);
    }
}

