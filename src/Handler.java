import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class Handler extends DefaultHandler {
    @Override
    public void startElement(String namespaceURI, String localName,
                             String qualifiedName, Attributes att) throws SAXException {
        System.out.println("Znaleziony element: " + qualifiedName);
        if (qualifiedName.equals("employee")) {
            System.out.println("Znalezione atrybut: " + att.getValue("name"));
        }
    }

    @Override
    public void characters(char ch[], int start, int length)
            throws SAXException {

        System.out.println("Treść elementu: " + start + " to "
                + (start + length - 1) + ": " + new String(ch, start, length));
    }
}
