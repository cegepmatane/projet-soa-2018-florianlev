package Action;

import java.util.ArrayList;
import java.util.List;

import DAO.VaisseauDAO;
import DAO.VoyagesDAO;
import modele.Vaisseau;
import modele.Voyage;
import vue.VueSoa;

public class ControleurPrincipal {
	
	protected VueSoa vue;
	protected VoyagesDAO voyageDAO;
	
	
	public ControleurPrincipal(VueSoa vue)
	{
		this.vue = vue;
		VoyagesDAO voyageDAO = new VoyagesDAO();

		
	}
	
	public void afficherContenu()
	{
		
		List<String> listeVaisseaux = new ArrayList<String>();
		
		
		VaisseauDAO vaisseauDAO = new VaisseauDAO();
		
		
		List<Vaisseau> listeVaisseau =  vaisseauDAO.rechercherVaisseau();	
		vue.setListeVaisseaux(listeVaisseau);
		
		
	}
	
	public void afficherVoyagesPourUnVaisseau(int id) {
		List<Voyage> listeVoyage = voyageDAO.rechercherVoyage(id);
		vue.setListeVoyages(listeVoyage);
		
	}
	

}
