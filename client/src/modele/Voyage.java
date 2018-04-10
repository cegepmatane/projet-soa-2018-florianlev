package modele;

public class Voyage {
	
	protected int idVoyage;
	protected String depart;
	protected String arrivee;
	protected int prix;
	protected int distance;
	
	
	public int getIdVoyage() {
		return idVoyage;
	}
	public void setIdVoyage(int idVoyage) {
		this.idVoyage = idVoyage;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrivee() {
		return arrivee;
	}
	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}

}
	