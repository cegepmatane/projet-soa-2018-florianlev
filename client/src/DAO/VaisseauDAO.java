package DAO;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modele.Vaisseau;

public class VaisseauDAO<T> {
	
	List<Vaisseau> listeVaisseau;
	
	
	public VaisseauDAO()
	{
		listeVaisseau = new ArrayList<>();
	}
	
	public List<Vaisseau> rechercherVaisseau()
	{
		String xml = null;
		
		try
		{
			URL urlListeVaisseau = new URL("http://localhost/service-voyage/src/vaisseau/liste/");
			String derniereBalise = "</vaisseau>";
			InputStream flux = urlListeVaisseau.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			xml = lecteur.next() + derniereBalise;
			System.out.println(xml);
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		return listeVaisseau;
		
	}

}
