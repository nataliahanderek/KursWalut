package kursWalut;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class GetValue {
    private static String kodWaluty;
    private static String kodWalutyWyjsciowy;
    private static Double wartoscDoPrzeliczenia;

    public static void getData() throws IOException, ParserConfigurationException, SAXException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod waluty, którą chcesz przeliczyć:");
        kodWaluty = scan.nextLine();
        while (ListObjects.getByID(kodWaluty) == null) {
            System.out.println("Podaj ISTNIEJACY kod waluty, którą chcesz przeliczyć:");
            kodWaluty = scan.nextLine();
        }

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj kod waluty, na którą chcesz przeliczyć " + kodWaluty + ":");
        kodWalutyWyjsciowy = scann.nextLine();
        while (ListObjects.getByID(kodWalutyWyjsciowy) == null) {
            System.out.println("Podaj ISTNIEJACY kod waluty, na którą chcesz przeliczyć " + kodWaluty + ":");
            kodWalutyWyjsciowy = scann.nextLine();
        }

        System.out.println("Podaj wartość do przeliczenia z " + kodWaluty + " na " + kodWalutyWyjsciowy + ":");
        wartoscDoPrzeliczenia = scan.nextDouble();
        while (wartoscDoPrzeliczenia < 0) {
            System.out.println("Podaj DODATNIA wartość do przeliczenia z " + kodWaluty + " na " + kodWalutyWyjsciowy + ":");
            wartoscDoPrzeliczenia = scan.nextDouble();
            System.out.print("\n");
        }

        new Convert(kodWaluty,kodWalutyWyjsciowy,wartoscDoPrzeliczenia);
        double wynik = Convert.getResult();
        System.out.println("Otrzymasz: " + wynik + " " + kodWalutyWyjsciowy);
    }
}

/*      System.out.println("nazwa_waluty: " + ListObjects.getByID(kodWaluty).getNazwaWaluty());
        System.out.println("przelicznik: " + ListObjects.getByID(kodWaluty).getPrzelicznik());
        System.out.println("kod_waluty: " + ListObjects.getByID(kodWaluty).getKodWaluty());
        System.out.println("kurs_sredni: " + ListObjects.getByID(kodWaluty).getSredniKurs() + "\n");
*/
