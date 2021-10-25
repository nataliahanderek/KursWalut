package kursWalut;

import org.xml.sax.SAXException;

import javax.sound.midi.Soundbank;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GetValue {
    private static String kodWaluty;
    private static String kodWalutyWyjsciowy;
    private static Double wartoscDoPrzeliczenia;

    public static void getIDYouHave() throws IOException, ParserConfigurationException, SAXException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod waluty, którą chcesz przeliczyć:");
        kodWaluty = scan.nextLine();
        //System.out.println(ListObjects.getByID(kodWaluty).getNazwaWaluty());
        System.out.println("nazwa_waluty: " + ListObjects.getByID(kodWaluty).getNazwaWaluty());
        System.out.println("przelicznik: " + ListObjects.getByID(kodWaluty).getPrzelicznik());
        System.out.println("kod_waluty: " + ListObjects.getByID(kodWaluty).getKodWaluty());
        System.out.println("kurs_sredni: " + ListObjects.getByID(kodWaluty).getSredniKurs() + "\n");
    }

    public static void getYourValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wartość do przeliczenia:");
        wartoscDoPrzeliczenia = scan.nextDouble();
        System.out.println("");
    }

    public static void getIDYouWant() throws IOException, ParserConfigurationException, SAXException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kod waluty, na którą chcesz przeliczyć " + wartoscDoPrzeliczenia + " " + kodWaluty + ":");
        kodWalutyWyjsciowy = scan.nextLine();
        //System.out.println(ListObjects.getByID(kodWalutyWyjsciowy).getNazwaWaluty());
        System.out.println("nazwa_waluty: " + ListObjects.getByID(kodWalutyWyjsciowy).getNazwaWaluty());
        System.out.println("przelicznik: " + ListObjects.getByID(kodWalutyWyjsciowy).getPrzelicznik());
        System.out.println("kod_waluty: " + ListObjects.getByID(kodWalutyWyjsciowy).getKodWaluty());
        System.out.println("kurs_sredni: " + ListObjects.getByID(kodWalutyWyjsciowy).getSredniKurs() + "\n");
    }
}
