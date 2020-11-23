
import java.io.File;
import java.util.List;
import javaLibros.Libros;
import javaLibros.Libros.Libro;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi
 */
public class JAXB {
    
    Libros misLibros;

    public int abrir_XML_JAXB(File fichero) {
      
        try {
            //crea instancia de JAXB
            JAXBContext contexto = JAXBContext.newInstance(Libros.class);
            
            //crea un objeto unmarshaller
            Unmarshaller unmars = contexto.createUnmarshaller();
            
            //deserializa el fichero
            misLibros = (Libros) unmars.unmarshal(fichero);
            
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public String recorrerJAXB() {
        String cadenaRes = "";
        
        List<Libros.Libro> listaLibros = misLibros.getLibro();
        
        for(int i=0; i<listaLibros.size(); i++){
            Libro libroTemp = listaLibros.get(i);
            cadenaRes = cadenaRes + "\n Publicado en: " + libroTemp.getPublicadoEn();
            cadenaRes = cadenaRes + "\n Titulo: " + libroTemp.getTitulo();
            cadenaRes = cadenaRes + "\n Autor: " + libroTemp.getAutor();
            cadenaRes = cadenaRes + "\n Editorial: " + libroTemp.getEditorial();
            cadenaRes = cadenaRes +"\n ---------------------------------------------";
        }
        
        return cadenaRes;
    }
    
}
