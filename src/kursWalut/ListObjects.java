package kursWalut;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class ListObjects {
    public static Waluta getByID(String ID) throws IOException, ParserConfigurationException, SAXException {
        List<Waluta> lista = CreateParser.returnList();
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getKodWaluty().equals(ID)){
                return lista.get(i);
            }
        }
        return null;
    }
}
