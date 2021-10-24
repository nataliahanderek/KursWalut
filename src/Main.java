import java.util.Scanner;

import org.xml.sax.*;

import javax.xml.parsers.*;

public class Main {
    public static void main (String[] args) throws Exception {

        // Tworzenie parsera
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        XMLReader parser = saxParser.getXMLReader();

        // Tworzenie klasy Handler
        Handler handler = new Handler();
        parser.setContentHandler(handler);

        // start parsowania dokumentu
        parser.parse("https://www.nbp.pl/kursy/xml/lasta.xml");



/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj kod waluty, którą chcesz przeliczyć:");
        String kodWaluty = scan.nextLine();

        System.out.println("Podaj wartość do przeliczenia:");
        Double wartoscDoPrzeliczenia = scan.nextDouble();

        System.out.println("Podaj kod waluty, na którą chcesz przeliczyć " + wartoscDoPrzeliczenia + " " + kodWaluty + ":");
        String kodWalutyWyjsciowy = scan.nextLine();
 */
    }

}
