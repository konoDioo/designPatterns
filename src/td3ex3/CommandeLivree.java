package td3ex3;

public class CommandeLivree extends EtatCommande {

    public CommandeLivree(Commande commande) {
        super(commande);
    }

    public void ajouteProduit(Produit produit) {
    	System.out.println("Empty implementation, as products cannot be added to a delivered order");       
    }

    public void efface() {
    	System.out.println("Empty implementation, as a delivered order cannot be cleared");        
    }

    public void retireProduit(Produit produit) {
    	System.out.println("Empty implementation, as products cannot be removed from a delivered order");        
    }

    public EtatCommande etatSuivant() {
        return this;
    }
}

