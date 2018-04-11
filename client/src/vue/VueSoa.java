package vue;

import Action.ControleurPrincipal;
import javafx.application.Application;
import javafx.stage.Stage;

public class VueSoa extends Application {
	
	protected ControleurPrincipal controleur;
	protected Stage scenePrincipale;
	
	public VueSoa()
	{
		controleur = new ControleurPrincipal(this);
	}
	



	@Override
	public void start(Stage scenePrincipale){
		this.scenePrincipale = scenePrincipale;
		controleur.afficherContenu();
		
	}



}
