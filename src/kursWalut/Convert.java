package kursWalut;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Convert {
    private static double endValue;
    private static String kodWaluty;
    private static String kodWalutyWyjsciowy;
    private static double wartosc;

    public Convert(String nowyKodWaluty, String nowyKodWalutyWyjsciowy, double nowaWartosc){
        kodWaluty = nowyKodWaluty;
        kodWalutyWyjsciowy = nowyKodWalutyWyjsciowy;
        wartosc = nowaWartosc;
    }

    public static double getResult() throws IOException, ParserConfigurationException, SAXException {
        double sredniKurs1 = ListObjects.getByID(kodWaluty).getSredniKurs();
        double sredniKurs2 = ListObjects.getByID(kodWalutyWyjsciowy).getSredniKurs();
        int przelicznik1 = ListObjects.getByID(kodWaluty).getPrzelicznik();
        int przelicznik2 = ListObjects.getByID(kodWalutyWyjsciowy).getPrzelicznik();

        endValue = (sredniKurs1*przelicznik2*wartosc)/(sredniKurs2*przelicznik1);

        return endValue;
    }
}
