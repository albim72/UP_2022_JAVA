import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

public class Main {



    public static void main(String[] args) throws ParserConfigurationException {

        StringWriter stringWriter = new StringWriter();

        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);

            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("cars");
            xmlStreamWriter.writeStartElement("supercars");
            xmlStreamWriter.writeAttribute("company","Ferrari");

            xmlStreamWriter.writeStartElement("carname");
            xmlStreamWriter.writeAttribute("type","formula one");
            xmlStreamWriter.writeCharacters("Ferrari 101");
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();

            xmlStreamWriter.flush();
            xmlStreamWriter.close();
            String xmlString = stringWriter.getBuffer().toString();
            stringWriter.close();
            System.out.println(xmlString);



        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
