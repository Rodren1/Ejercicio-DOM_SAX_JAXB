
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */
public class SAX {

    SAXParser parser;
    ManejadorSAX manejador;
    File ficheroXML;
    
    public int abrir_XML_SAX(File fichero) {

        try {
            //se crea un objeto SAXParser para interpretar el documento XML
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            
            /*se crea una instancia del ,amejador que sera el que recorra
            el documento XML secuencialmente*/
            manejador = new ManejadorSAX();
            
            ficheroXML = fichero;

            return 0;
        } catch (Exception e) {
            return -1;
        }

    }

}

class ManejadorSAX extends DefaultHandler {

}
