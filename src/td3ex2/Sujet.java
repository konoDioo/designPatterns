package td3ex2;

import java.util.*;
public abstract class Sujet
{

	protected List<Observateur> observateurs = new ArrayList<Observateur>();

	public void ajoute (Observateur observateur)
	{
	observateurs.add(observateur);
	
	}
	public void retirer (Observateur observateur)
	{
	observateurs.remove(observateur);
	
	}
	public void notifie()
	{
		System.out.println("Notifie les observeurs");
	}

}

