package td2ex2;

public class FabriqueVehiculeElectricite implements FabriqueVehicule{

	@Override
	public Automobile creeAutomobile(String modèle, String couleur, int puissance, double espace) {
		return new AutomobileElectricite(modèle, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modèle, String couleur, int puissance) {
		return new ScooterElectricite(modèle, couleur, puissance);		
	}

}
