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

        GetValue.getIDYouHave();
        GetValue.getYourValue();
        GetValue.getIDYouWant();
    }
}
