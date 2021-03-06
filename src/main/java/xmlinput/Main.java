/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;
import java.io.File;

package xmlinput;

public class Main {

    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try{
            SAXParser saxParser = saxParserFactory.newSAXParser();
            XmlHandler handler = new XmlHandler();
            File input = new File("products.xml");
            saxParder.parse(input, handler);
        } catch (Exception e){
            e.printStackTrace();
        }

        XmlReader myXmlReader = new XmlReader("products.xml");

        for (Product p: myXmlReader.getProducts()) {
            //System.out.println(p.values()); // When ready, use this for testing
        }

    }
}
