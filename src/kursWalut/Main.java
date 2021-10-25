package kursWalut;

import java.util.Scanner;
import org.xml.sax.*;
import javax.xml.parsers.*;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException, ParserConfigurationException, SAXException {

        String warunek;
        Scanner scan = new Scanner(System.in);

        CreateParser newList = new CreateParser();
        newList.returnList();

        do {
            GetValue.getData();
            System.out.println("Chcesz wprowadzic nowe wartosci? (T/N)");
            warunek = scan.next();
        }
        while (warunek.equals("T"));
    }
}
