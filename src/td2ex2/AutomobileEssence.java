package td2ex2;

public class AutomobileEssence extends Automobile {

    public AutomobileEssence(String modèle, String couleur, int puissance, double espace) {
        super(modèle, couleur, puissance, espace);
    }

    @Override
    public void afficheCaractéristiques() {
        System.out.println("Automobile à essence de modèle: " + modèle +
                                   " de couleur: " + couleur + " de puissance: " + puissance +
                                   " d'espace: " + espace);
    }
}
