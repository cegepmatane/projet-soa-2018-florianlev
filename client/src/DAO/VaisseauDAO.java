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
import org.xml.sax.SAXException;

import modele.Vaisseau;

public class VaisseauDAO<T> {
	
	List<Vaisseau> listeVaisseau;
	String xml = null;

	
	
	public VaisseauDAO()
	{
		listeVaisseau = new ArrayList<>();
		
		
		try
		{
			URL urlListeVaisseau = new URL("http://localhost/service-voyage/src/vaisseau/liste/");
			String derniereBalise = "</vaisseaux>";
			InputStream flux = urlListeVaisseau.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter(derniereBalise);
			xml = lecteur.next() + derniereBalise;
			
		} catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public List<Vaisseau> rechercherVaisseau()
	{
		
		try
		{
			DocumentBuilder parseur =  DocumentBuilderFactory.newInstance().newDocumentBuilder();
			@SuppressWarnings("deprecation")
			Document document = parseur.parse(new StringBufferInputStream(xml));
			String racine = document.getDocumentElement().getNodeName();
			//System.out.println(racine);
			
			List<Vaisseau> listeVaisseau = new ArrayList<Vaisseau>();
			NodeList listeNoeudsVaisseau = document.getElementsByTagName("vaisseau");
			
			
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
		return listeVaisseau;
		
	}

}
