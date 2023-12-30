package td2ex2;

public class FabriqueVehiculeEssence implements FabriqueVehicule{

	@Override
	public Automobile creeAutomobile(String modèle, String couleur, int puissance, double espace) {
		
		return new AutomobileEssence(modèle, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modèle, String couleur, int puissance) {
		return new ScooterEssence(modèle, couleur, puissance);
	}

}
