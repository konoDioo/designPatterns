package td2ex2;

public abstract class Automobile {
	
	  protected String modèle;
	    protected String couleur;
	    protected int puissance;
	    protected double espace;

	    public Automobile(String modèle, String couleur, int puissance, double espace) {
	        this.modèle = modèle;
	        this.couleur = couleur;
	        this.puissance = puissance;
	        this.espace = espace;
	    }

	    public abstract void afficheCaractéristiques();
}
