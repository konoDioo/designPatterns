package td2ex2;

public class ScooterElectricite extends Scooter{
    public ScooterElectricite(String modèle, String couleur, int puissance) {
        super(modèle, couleur, puissance);
    }

    @Override
    public void afficheCaracteristiques() {
        System.out.println("Scooter électrique de modèle: " + modèle +
                                   " de couleur: " + couleur + " de puissance: " + puissance);
    }
}
