package modele;

public class Vaisseau {
	
	protected int idVaisseau;
	protected String nomModele;
	protected String kilometrage;
	protected String nombreDePlace;
	protected String vitesse;
	
	public Vaisseau()
	{
		nomModele = "";
		kilometrage = "";
		nombreDePlace = "";
		vitesse = "";
	}
	
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
	public String getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(String kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getNombreDePlace() {
		return nombreDePlace;
	}
	public void setNombreDePlace(String nombreDePlace) {
		this.nombreDePlace = nombreDePlace;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	
	

}
