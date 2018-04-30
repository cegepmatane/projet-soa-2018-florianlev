import DAO.VoyagesDAO;
import modele.Voyage;
import vue.VueSoa;

public class AppSoa {

	public static void main(String[] parametres) {
		
//	VoyagesDAO voyagesDAO = new VoyagesDAO();
		VueSoa vueSoa = new VueSoa();
		vueSoa.launch(VueSoa.class, parametres);

		//Voyage voyage = new Voyage("test","tes","111","44");
		
	//voyagesDAO.ajouterVoyage(voyage);
		
	}

}
