package td2ex2;

public class ScooterEssence extends Scooter{

	 public ScooterEssence(String modèle, String couleur, int puissance) {
	        super(modèle, couleur, puissance);
	    }

	    @Override
	    public void afficheCaracteristiques() {
	        System.out.println("Scooter à essence de modèle: " + modèle +
	                                   " de couleur: " + couleur + " de puissance: " + puissance);
	    }
}