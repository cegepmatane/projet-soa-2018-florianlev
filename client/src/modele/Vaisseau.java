package modele;

public class Vaisseau {
	
	protected int idVaisseau;
	protected String nomModele;
	protected int kilometrage;
	protected int nombreDePlace;
	protected int vitesse;
	
	
	public int getIdVaisseau() {
		return idVaisseau;
	}
	public void setIdVaisseau(int idVaisseau) {
		this.idVaisseau = idVaisseau;
	}
	public String getNomModele() {
		return nomModele;
	}
	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public int getNombreDePlace() {
		return nombreDePlace;
	}
	public void setNombreDePlace(int nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}
	public int getVitesse() {
		return vitesse;
	}
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	

}
