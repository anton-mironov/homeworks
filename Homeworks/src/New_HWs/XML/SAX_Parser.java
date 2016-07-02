package New_HWs.XML;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAX_Parser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        File inputFile = new File("D:\\Java\\Git (repository)\\homeworks\\Homeworks\\src\\New_HWs\\XML\\KidsAndSweets.txt");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        UserHandler userhandler = new UserHandler();
        System.out.println("Extracting information about kids and sweets using SAX:");
        saxParser.parse(inputFile, userhandler);
    }

    private static class UserHandler extends DefaultHandler {

        boolean bKidName = false;
        boolean bSex = false;
        boolean bPreference = false;
        boolean bSweetTaste = false;
        boolean bSweetName = false;

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            switch (qName) {
                case "kidName":
                    bKidName = true;
                    break;

                case "sex":
                    bSex = true;
                    break;

                case "preference":
                    bPreference = true;
                    break;

                case "taste":
                    bSweetTaste = true;
                    break;

                case "sweetName":
                    bSweetName = true;
                    break;
            }
        }

        public void characters(char ch[], int start, int length) throws SAXException {
            if (bKidName) {
                System.out.print("\n" + new String(ch, start, length));
                bKidName = false;

            } else if (bSweetTaste) {
                System.out.print(" is eating " + new String(ch, start, length));
                bSweetTaste = false;

            } else if (bSweetName) {
                System.out.print(" " + new String(ch, start, length) + ". ");
                bSweetName = false;

            } else if (bSex) {
                String localSex = new String(ch, start, length);
                if (localSex.equals("0")) {
                    System.out.print("It's a girl and she ");
                } else {
                    System.out.print("It's a boy and he ");
                }
                bSex = false;

            } else if (bPreference) {
                String localPreference = new String(ch, start, length);
                if (localPreference.equals("0")) {
                    System.out.println("prefers candies.");
                } else {
                    System.out.println("prefers ice-cream.");
                }
                bPreference = false;
            }
        }
    }
}