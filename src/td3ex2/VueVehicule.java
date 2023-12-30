package td3ex2;

public class VueVehicule implements Observateur
{
		protected Vehicule vehicule;
		protected String texte = "";
		
		public VueVehicule (Vehicule vehicule)
		{	
          this.vehicule = vehicule;
          vehicule.ajoute(this);
          this.actualise();
		}
		
		public void actualise()
		{
          texte = "Description : " + vehicule.getDescription() +
          "\nPrix : " + vehicule.getPrix();
		}
		
		public void affiche()
		{
          System.out.println(texte);
		}

}

