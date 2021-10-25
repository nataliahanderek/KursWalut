package kursWalut;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;


public class CreateParser {
    public static List<Waluta> returnList() throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL("https://www.nbp.pl/kursy/xml/lasta.xml");

        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxparser = spf.newSAXParser();
        DefaultHandler handler = new Handler();
        saxparser.parse(url.openStream(),handler);

        List<Waluta> pozycja = ((Handler) handler).getPozycja();

        return pozycja;
    }
}
