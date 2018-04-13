package Action;

import java.util.ArrayList;
import java.util.List;

import DAO.VaisseauDAO;
import DAO.VoyagesDAO;
import modele.Vaisseau;
import vue.VueSoa;

public class ControleurPrincipal {
	
	protected VueSoa vue;
	
	
	public ControleurPrincipal(VueSoa vue)
	{
		this.vue = vue;
		
	}
	
	public void afficherContenu()
	{
		
		List<String> listeVaisseaux = new ArrayList<String>();
		
		VaisseauDAO vaisseauDAO = new VaisseauDAO();
		VoyagesDAO voyageDAO = new VoyagesDAO();
		
		List<Vaisseau> listeVaisseau =  vaisseauDAO.rechercherVaisseau();	
		vue.setListeVaisseaux(listeVaisseau);
		
		System.out.println(listeVaisseau);
	}

}
