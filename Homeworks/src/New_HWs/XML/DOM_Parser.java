package New_HWs.XML;

import java.io.File;
import javax.xml.parsers.*;

import org.w3c.dom.*;

public class DOM_Parser {
    public static void main(String[] args) {

        try {
            File inputFile = new File("D:\\Java\\Git (repository)\\homeworks\\Homeworks\\src\\New_HWs\\XML\\KidsAndSweets.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("Kid");
            System.out.println("Information about kids and sweets:");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.print("\nName of this kid is " + eElement.getElementsByTagName("kidName").item(0)
                            .getTextContent() + ". ");
                    if (eElement.getElementsByTagName("sex").item(0).getTextContent().equals("0")) {
                        System.out.println("It's a girl.");
                    } else {
                        System.out.println("It's a boy.");
                    }
                    if (eElement.getElementsByTagName("preference").item(0).getTextContent().equals("0")) {
                        System.out.print("This kid prefers candies ");
                    } else {
                        System.out.print("This kid prefers ice-cream ");
                    }
                    System.out.println("so now eating " + eElement.getElementsByTagName("taste").item(0)
                            .getTextContent() + " " + eElement.getElementsByTagName("sweetName").item(0).getTextContent
                            () + ".");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}