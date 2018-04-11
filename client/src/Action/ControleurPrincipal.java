package Action;

import java.util.ArrayList;
import java.util.List;

import DAO.VaisseauDAO;
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
		
		List<Vaisseau> listeVaisseau =  vaisseauDAO.rechercherVaisseau();	
		
		System.out.println(listeVaisseau);
		for (Vaisseau vaisseau : listeVaisseau)
		{
			System.out.println(vaisseau.getNomModele());
			/*listeVaisseaux.add(vaisseau.getNomModele());
			listeVaisseaux.add(vaisseau.getKilometrage());
			listeVaisseaux.add(vaisseau.getNombreDePlace());
			listeVaisseaux.add(vaisseau.getVitesse());
			listeVaisseaux.add(vaisseau.getKilometrage());
*/

		}
		
		
		
	}
	
	
}
