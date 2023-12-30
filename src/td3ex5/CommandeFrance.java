package td3ex5;

class CommandeFrance extends Commande {

    public CommandeFrance(double montantHt) {
        super(montantHt);
    }

    @Override
    protected void calculeTva() {
        montantTva = montantHt * 0.196;
    }
}
