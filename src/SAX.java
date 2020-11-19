
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
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

    public String recorrerSAX() {

        try {
            manejador.cadenaResultado = "";

            parser.parse(ficheroXML, manejador);
            return manejador.cadenaResultado;

        } catch (SAXException ex) {
            return "Error al parsear con SAX";
        } catch (IOException ex) {
            return "Error al parsear con SAX";
        }
    }

}

class ManejadorSAX extends DefaultHandler {

    String cadenaResultado = "";

    @Override
    public void characters(char[] chars, int start, int length) throws SAXException {
        for (int i = start; i < length + start; i++) {
            cadenaResultado = cadenaResultado + chars[i];
        }
        cadenaResultado = cadenaResultado.trim() + "\n";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("Libro")) {
            cadenaResultado = cadenaResultado + "_______________________________________________\n";
            cadenaResultado = cadenaResultado + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n" + "\n";
        } 
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //qName es el nombre del nodo
        if (qName.equals("Libros")) { 
            cadenaResultado = cadenaResultado + " _______________________________________________\n";
            cadenaResultado = cadenaResultado + "| SE VAN A MOSTRAR LOS LIBROS DE ESTE DOCUMENTO |\n";
            cadenaResultado = cadenaResultado + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n";
            
        } else if (qName.equals("Libro")) {
            cadenaResultado = cadenaResultado + "Se van a mostrar los datos de un libro:\n" + "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯ \n";
            cadenaResultado = cadenaResultado + "Publicado en: " + attributes.getValue(attributes.getQName(0).trim());

        } else if (qName.equals("Titulo")) {
            cadenaResultado = cadenaResultado + "El titulo es: ".trim();

        } else if (qName.equals("Autor")) {
            cadenaResultado = cadenaResultado + "El autor es: ".trim();

        }

    }

}
