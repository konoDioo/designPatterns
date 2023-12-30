package td3ex3;

public class Produit {
	protected String name;

	public Produit(String name) {
		super();
		this.name = name;
	}
	public void affiche()
	{
		System.out.println("Produit" + name);
	}
}
