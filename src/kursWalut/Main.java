package kursWalut;

import org.xml.sax.helpers.DefaultHandler;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import org.xml.sax.*;
import javax.xml.parsers.*;
import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException, ParserConfigurationException, SAXException {

        CreateParser newList = new CreateParser();
        newList.returnList();

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
