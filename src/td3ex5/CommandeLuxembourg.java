package td3ex5;

class CommandeLuxembourg extends Commande {

    public CommandeLuxembourg(double montantHt) {
        super(montantHt);
    }

    @Override
    protected void calculeTva() {
        montantTva = montantHt * 0.15;
    }
}
