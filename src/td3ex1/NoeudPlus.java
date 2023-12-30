package td3ex1;

class NoeudPlus implements Noeud {
	 private Noeud gauche;
	 private Noeud droit;
	 public NoeudPlus(Noeud gauche, Noeud droit) {
	 this.gauche = gauche;
	 this.droit = droit;
	 }
	 public void accept(VisiteurArbre visiteur) {
	 visiteur.visiterNoeudPlus(this);
	 }
	public Noeud getGauche() {
		return gauche;
	}
	public void setGauche(Noeud gauche) {
		this.gauche = gauche;
	}
	public Noeud getDroite() {
		return droit;
	}
	public void setDroite(Noeud droit) {
		this.droit = droit;
	}
	 
}

