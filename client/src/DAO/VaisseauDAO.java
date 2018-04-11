package DAO;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import modele.Vaisseau;

public class VaisseauDAO<T> {
	
	List<Vaisseau> listeVaisseau;
	
	
	public VaisseauDAO()
	{
		listeVaisseau = new ArrayList<>();
	}
	
	public List<Vaisseau> rechercherVaisseau()
	{
		String xml = null
		
		try
		{
			URL urlListeVaisseau = new URL("http://http://localhost/service-voyage/src/vaisseau/liste/");

		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
