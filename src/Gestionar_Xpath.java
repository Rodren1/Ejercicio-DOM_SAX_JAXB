
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xp
 */
public class Gestionar_Xpath {

    Document doc;

    XPath xpath;

    public int abrir_XML(File fichero) {
        doc = null; //representa el arbol DOM

        try {
            //Se crea un objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);  //ignora comentarios
            factory.setIgnoringElementContentWhitespace(true); //ignora espacios en blanco

            /*se crea un objeto DocumentBuilder para cargar en el la estructura de arbol
            DOM a partir del XML seleccionado*/
            DocumentBuilder builder = factory.newDocumentBuilder();

            //interpreta el documento XML y genera el DOM equivalente
            doc = builder.parse(fichero);
            //ahora doc apunta al arbol DOM listo para ser recorrido

            xpath = XPathFactory.newInstance().newXPath();
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public String ejecutarXPath(String consulta) {

        String salida = "";
        try {
            XPathExpression exp = xpath.compile(consulta);

            Object resultado = exp.evaluate(doc, XPathConstants.NODESET);
            NodeList listaNodos = (NodeList) resultado;

            for (int i = 0; i < listaNodos.getLength(); i++) {
                //si listaNodo es Libro entra en el if y se llama al metodo procesar libro para 
                //sacar los datos de ese libro e imprimirlos por pantalla
                if (listaNodos.item(i).getNodeName().equals("Libro")) {
                    String datos_nodo[] = procesarLibro(listaNodos.item(i));
                    salida = salida + "\n " + "Publicado en: " + datos_nodo[0];
                    salida = salida + "\n " + "El titulo es: " + datos_nodo[1];
                    salida = salida + "\n " + "El autor es: " + datos_nodo[2];
                    salida = salida + "\n  ---------------------------------------------------";
                }else{
                    salida = salida + "\n" + listaNodos.item(i).getFirstChild().getNodeValue();
                }

            }
            System.out.println(salida);
            return salida;
        } catch (Exception e) {
            return "Error en la ejecución de la consulta";
        }
    }

    public String[] procesarLibro(Node n) {
        String datos[] = new String[3];
        Node nodoTemporal = null;
        int contador = 1;

        //obtiene el valor del primer atributo del nodo
        datos[0] = n.getAttributes().item(0).getNodeValue();

        NodeList nodos = n.getChildNodes(); //obtiene los nodos titulo y autor

        for (int i = 0; i < nodos.getLength(); i++) {
            nodoTemporal = nodos.item(i);

            if (nodoTemporal.getNodeType() == Node.ELEMENT_NODE) {
                /*Para obtener el texto con el titulo y autor se accede al nodo TEXT hijo 
                del nodoTemporal y se saca su valor*/
                datos[contador] = nodoTemporal.getFirstChild().getNodeValue();
                contador++;
            }
        }
        return datos;
    }

}
