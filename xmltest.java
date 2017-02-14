import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class xmltest {

	public static void main(String[] args) throws SAXException, IOException {
		DocumentBuilderFactory factory1 = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder	builder1 = factory1.newDocumentBuilder();
				Document doc1 = builder1.parse("tasklist.xml");
				NodeList personlist = doc1.getElementsByTagName("person");
				for(int i=0;i<personlist.getLength();i++){
				System.out.println(personlist.item(i));
				}
				NodeList peoplelist = doc1.getElementsByTagName("people");
				for(int i=0;i<peoplelist.getLength();i++){
					System.out.println(peoplelist.item(i));
					}
				NodeList namelist = doc1.getElementsByTagName("lastname");
				for(int i=0;i<namelist.getLength();i++){
					System.out.println(namelist.item(i));
					}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}