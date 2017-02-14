import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML {

	public static void main(String[] args) throws ParserConfigurationException {
DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = factory.newDocumentBuilder();
try {
	Document doc = builder.parse("tasklist.xml");
	NodeList personlist = doc.getElementsByTagName("person");
	for (int i = 0; i<personlist.getLength();i++)
	{
		Node p = personlist.item(i);
		if(p.getNodeType() == Node.ELEMENT_NODE){
			Element person = (Element) p;
			String id = person.getAttribute("id");
			NodeList namelist = person.getChildNodes();
			for (int j = 0; j<namelist.getLength();j++)
			{
			Node n = namelist.item(j);
			if(n.getNodeType() == Node.ELEMENT_NODE){
				Element name = (Element) n;
				System.out.println("Person id" + id + ":" + name.getTagName() + "=" + name.getTextContent());
			}
		}
	}}
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
