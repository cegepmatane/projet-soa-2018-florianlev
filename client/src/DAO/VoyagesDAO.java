package DAO;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import modele.Vaisseau;
import modele.Voyage;

public class VoyagesDAO {
	
	List<Voyage> listeVoyage;
	String xml = null;
	
	public VoyagesDAO()
	{
		listeVoyage = new ArrayList<>();
	}
	
	
	
	public List<Voyage> rechercherVoyage(int idVaisseau)
	{
		try
		{
			URL urlListeVaisseau = new URL("http://localhost/service-voyage/src/vaisseau/liste/listeVoyages.php?idVaisseau=" + idVaisseau);
			System.out.println(urlListeVaisseau);
			
			String derniereBalise = "</voyages>";
			InputStream flux = urlListeVaisseau.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			xml = lecteur.next() + derniereBalise;
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			DocumentBuilder parseur =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
			@SuppressWarnings("deprecation")
			Document document = parseur.parse(new StringBufferInputStream(xml));
			String racine = document.getDocumentElement().getNodeName();
			System.out.println(racine);
			
			if(idVaisseau >0)
			{
				listeVoyage.clear();
			}
			
			NodeList listeNoeudVoyages = document.getElementsByTagName("voyage");
			for(int position = 0; position < listeNoeudVoyages.getLength(); position++)
			{
				Voyage voyage = new Voyage();
				Element noeudVoyage = (Element)listeNoeudVoyages.item(position);
				//String id = noeudVoyage.getElementsByTagName("id").item(0).getTextContent();
				//vaisseau.setIdVaisseau("ID : " + id);

				String depart = noeudVoyage.getElementsByTagName("depart").item(0).getTextContent();
				voyage.setDepart(depart);
				String arrivee = noeudVoyage.getElementsByTagName("arrivee").item(0).getTextContent();
				voyage.setArrivee(arrivee);
				String prix = noeudVoyage.getElementsByTagName("prix").item(0).getTextContent();
				voyage.setPrix(prix);
				String distance = noeudVoyage.getElementsByTagName("distance").item(0).getTextContent();
				voyage.setDistance(distance);

				listeVoyage.add(voyage);

			}

			
			
		}catch (ParserConfigurationException e) 
		{	
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeVoyage;
	}

}
