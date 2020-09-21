package xmlinput;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class XmlHandler extends DefaultHandler {

    ArrayList<Product> products = new ArrayList<Product>();  // ArrayList of all Products
    Product currentProduct = null;  // Reference to the current Product


    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        System.out.println("Start element");
        // Check if this is an opening element for a product
        System.out.println("URI: " + uri);
        System.out.println("LOCALNAME: " + localName);
        System.out.println("QNAME: " +qName);
        System.out.println("ATTRIBUTES: " attributes);
        // If so, store each of its attribute values
    for( int i = 0; i < attributes.getLength(); i++)
        // Determine type of product (taxable vs. nontaxable)

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element");
        // check if this is a closing element for a product

        // If so, add product to array list

    }

    // Return a reference to array list
    public ArrayList<Product> getProducts() {
        return products;
    }
}


