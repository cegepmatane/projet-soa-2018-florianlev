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

		
	}
	
	public ControleurPrincipal()
	{

	}
	
	public void afficherContenu()
	{
			
		
		VaisseauDAO vaisseauDAO = new VaisseauDAO();
		VoyagesDAO voyageDAO = new VoyagesDAO();

		
		List<Voyage> listeVoyage = voyageDAO.rechercherVoyage(0);
		vue.setListeVoyages(listeVoyage);

		List<Vaisseau> listeVaisseau =  vaisseauDAO.rechercherVaisseau();	
		vue.setListeVaisseaux(listeVaisseau);
		
		
	}
	
	public void afficherVoyagesPourUnVaisseau(int id) {
		List<Voyage> listeVoyagePourUnVaisseau = voyageDAO.rechercherVoyage(id);
	
		vue.setListeVoyagePourUnVaisseau(listeVoyagePourUnVaisseau);
		
	}
	

}
