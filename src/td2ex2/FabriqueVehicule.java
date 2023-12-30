package td2ex2;

public interface FabriqueVehicule {
	Automobile creeAutomobile(String modèle, String couleur, int puissance, double espace);
	Scooter creeScooter(String modèle, String couleur, int puissance);	
}
