package Action;

import DAO.VaisseauDAO;
import vue.VueSoa;

public class ControleurPrincipal {
	
	protected VueSoa vue;
	
	public ControleurPrincipal(VueSoa vue)
	{
		this.vue = vue;
		
	}
	
	public void afficherContenu()
	{
		
		VaisseauDAO vaisseauDAO = new VaisseauDAO();
		
		vaisseauDAO.rechercherVaisseau();	}
	
	
}
