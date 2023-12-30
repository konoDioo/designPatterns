package td3ex3;

public class CommandeValidee extends EtatCommande {

    public CommandeValidee(Commande commande) {
        super(commande);
    }

    public void ajouteProduit(Produit produit) {
    	System.out.println("Empty implementation, as products cannot be added to a validated order"); 
    }

    public void efface() {
        commande.getProduits().clear();
    }

    public void retireProduit(Produit produit) {
    	System.out.println("Empty implementation, as products cannot be removed from a validated order");       
    }

    public EtatCommande etatSuivant() {
        return new CommandeLivree(commande);
    }
}

