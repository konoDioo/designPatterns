package td2ex2;

public abstract class Scooter {
	protected String modèle;
	protected String couleur;
	protected int puissance;
	
	public Scooter(String modèle, String couleur, int puissance) {		
		this.modèle = modèle;
		this.couleur = couleur;
		this.puissance = puissance;
	}

	public abstract void afficheCaracteristiques();	
}
