package kursWalut;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    private StringBuilder currentPozycja = new StringBuilder();

    List<Waluta> pozycja;
    Waluta currentWaluta;

    public List<Waluta> getPozycja() {
        return pozycja;
    }

    @Override
    public void startDocument() {
        pozycja = new ArrayList<>();
    }

    @Override
    public void startElement(String namespaceURI, String localName,
                             String qualifiedName, Attributes att) {

        currentPozycja.setLength(0);

        if(qualifiedName.equalsIgnoreCase("pozycja")) {
            currentWaluta = new Waluta();
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName,
                           String qualifiedName) {
        if(qualifiedName.equalsIgnoreCase("nazwa_waluty")) {
            currentWaluta.setNazwaWaluty(currentPozycja.toString());
        }

        if(qualifiedName.equalsIgnoreCase("przelicznik")) {
           currentWaluta.setPrzelicznik(Integer.valueOf(String.valueOf(currentPozycja)));
        }

        if(qualifiedName.equalsIgnoreCase("kod_waluty")) {
            currentWaluta.setKodWaluty(currentPozycja.toString());
        }

        if(qualifiedName.equalsIgnoreCase("kurs_sredni")) {
            currentWaluta.setSredniKurs(Float.valueOf(String.valueOf(currentPozycja).replace(',','.')));
        }

        if(qualifiedName.equalsIgnoreCase("pozycja")) {
            pozycja.add(currentWaluta);
        }
    }

    public void characters(char ch[], int start, int length) {
        currentPozycja.append(ch, start, length);
    }
}
