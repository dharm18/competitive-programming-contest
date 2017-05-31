import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SerialProcessingTest {

	
	public void readTheContent(List<String> files) {

		for (String string : files) {
			readXMLDocuments(string);
		}
	}

	public void readXMLDocuments(String fileNameWithPath){
		try {

			File fXmlFile = new File(fileNameWithPath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			if (doc.hasChildNodes()) {
				printNote(doc.getChildNodes());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void printNote(NodeList nodeList) {

	    for (int count = 0; count < nodeList.getLength(); count++) {

		Node tempNode = nodeList.item(count);

		// make sure it's element node.
		if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

			// get node name and value
			//System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
			//System.out.println("Node Value =" + tempNode.getTextContent());

			if (tempNode.hasAttributes()) {
				// get attributes names and values
				NamedNodeMap nodeMap = tempNode.getAttributes();

				for (int i = 0; i < nodeMap.getLength(); i++) {

					Node node = nodeMap.item(i);
					//System.out.print("attr name : " + node.getNodeName());
					//System.out.println(" attr value : " + node.getNodeValue());

				}
			}

			if (tempNode.hasChildNodes()) {

				// loop again if has child nodes
				printNote(tempNode.getChildNodes());

			}

			//System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
			//System.out.println("Current Running Thread = " + Thread.currentThread().getName());

		}

	    }

	  }

	
}
