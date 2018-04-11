package Action;

import vue.VueSoa;

public class ControleurPrincipal {
	
	protected VueSoa vue;
	
	public ControleurPrincipal(VueSoa vue)
	{
		this.vue = vue;
		
	}
	
	public void afficherContenu()
	{
		System.out.println("test");
	}
	
	
}
