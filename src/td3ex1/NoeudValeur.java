package td3ex1;

class NoeudValeur implements Noeud {
	 private int valeur;
	 public NoeudValeur(int valeur) {
	 this.valeur = valeur;
	 }
	 public void accept(VisiteurArbre visiteur) {
	 visiteur.visiterNoeudValeur(this);
	 }
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	 
}
