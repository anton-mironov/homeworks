package New_HWs.XML;

import java.io.File;
import javax.xml.parsers.*;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

public class SAX_Parser {
    public static void main(String[] args) {

        try {
            File inputFile = new File("D:\\Java\\Git (repository)\\homeworks\\Homeworks\\src\\New_HWs\\XML\\KidsAndSweets.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            System.out.println("Information about kids and sweets:");
            saxParser.parse(inputFile, userhandler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class UserHandler extends DefaultHandler {

        boolean bKidName = false;
        boolean bSweetTaste = false;
        boolean bSex = false;
        boolean bPreference = false;
        boolean bSweetName = false;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equalsIgnoreCase("Kid")) {

            } else if (qName.equals("kidName")) {
                bKidName = true;

            } else if (qName.equals("taste")) {
                bSweetTaste = true;

            } else if (qName.equals("sweetName")) {
                bSweetName = true;

            } else if (qName.equals("sex")) {
                bSex = true;

            } else if (qName.equals("preference")) {
                bPreference = true;

            } else if (qName.equals("sweetName")) {
                bSweetName = true;
            }

        }

        public void characters(char ch[], int start, int length) throws SAXException {
            if (bKidName) {
                System.out.print("\n"+new String(ch, start, length));
                bKidName = false;

            } else if (bSweetTaste) {
                System.out.print(" is eating " + new String(ch, start, length));
                bSweetTaste = false;

            } else if (bSweetName) {
                System.out.println(" " + new String(ch, start, length) + ".");
                bSweetName = false;

            } else if (bSex) {
                String localSex = new String(ch, start, length);
                if (localSex.equals("0")) {
                    System.out.print("It's a girl and she prefers ");
                } else {
                    System.out.print("It's a boy and he prefers ");
                }
                bSex = false;

            } else if (bPreference) {
                String localPreference = new String(ch, start, length);
                if (localPreference.equals("0")) {
                    System.out.println("candies.");
                } else {
                    System.out.println("ice-cream.");
                }
                bPreference = false;
            }
        }
    }
}