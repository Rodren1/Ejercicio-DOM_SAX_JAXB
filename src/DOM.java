
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */
public class DOM {

    Document doc;
//devuelve 0 si todo ha ido bien y devuelve -1 si ha habido algun error    

    public int abrir_XML_DOM(File fichero) {
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
            return 0;
        } catch (Exception e) {
            return -1;
        }

    }

    public String recorrerYmostrarDOM() {
        String salida = "";
        Node node;
        String datos_nodo[] = null;
        Node raiz = doc.getFirstChild(); //obtiene el primer nodo del DOM
        NodeList nodelist = raiz.getChildNodes(); //obtiene una lista de nodos con todos los nodos hijos del raiz

        //procesa los nodos
        for (int i = 0; i < nodelist.getLength(); i++) {
            node = nodelist.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                datos_nodo = procesarLibro(node);
                salida = salida + "\n " + "Publicado en: " + datos_nodo[0];
                salida = salida + "\n " + "El titulo es: " + datos_nodo[1];
                salida = salida + "\n " + "El autor es: " + datos_nodo[2];
                salida = salida + "\n ----------------------------";
            }
        }
        return salida;
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

    public int añadirDOM(String titulo, String autor, String fecha) {

        try {
            //se crea un nodo tipo Element con nombre titulo(<Titulo>)
            Node ntitulo = doc.createElement("Titulo");
            
            //se crea un nodo tipo texto con el titulo del libro
            Node ntitulo_text = doc.createTextNode(titulo);
            
            //se añade eñ nodo de tecto con el titulo como hijo del elemento Titulo
            ntitulo.appendChild(ntitulo_text);

            //se hace lo mismo que con el nodo T*itulo
            Node nautor = doc.createElement("Autor");
            Node nautor_text = doc.createTextNode(autor);
            nautor.appendChild(nautor_text);

            //se crea un nodo de tipo elemento (<Libro>)
            Node nlibro = doc.createElement("Libro");
            
            //le añado un atributo al nodo elemento libro
            ((Element) nlibro).setAttribute("publicado_en", fecha);
            
            //le añado dos nodos hijos (titulo y autor)
            nlibro.appendChild(ntitulo);
            nlibro.appendChild(nautor);

            //guardo el nodo raiz y le añado el nodo libro que acabo de crear
            Node raiz = doc.getFirstChild();
            raiz.appendChild(nlibro);

            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

}