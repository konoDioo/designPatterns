package td2ex2;

public class AutomobileElectricite extends Automobile {

    public AutomobileElectricite(String modèle, String couleur, int puissance, double espace) {
        super(modèle, couleur, puissance, espace);
    }

    @Override
    public void afficheCaractéristiques() {
        System.out.println("Automobile électrique de modèle: " + modèle +
                                   " de couleur: " + couleur + " de puissance: " + puissance +
                                   " d'espace: " + espace);
    }
}
