package td3ex1;

class OperationArbre implements VisiteurArbre {	
	 public void visiterNoeudPlus(NoeudPlus noeud) {
		 System.out.println("Effectuer des opérations spécifiques pour un nœud d'addition"); 
	 }
	 public void visiterNoeudMoins(NoeudMoins noeud) {
		 System.out.println("Effectuer des opérations spécifiques pour un nœud de soustraction"); 
	 }
	 public void visiterNoeudValeur(NoeudValeur noeud) {
		 System.out.println("Effectuer des opérations spécifiques pour un nœud de valeur"); 
	 }
	}


