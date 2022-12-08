import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean bFirstName = false;
        boolean bLastName = false;
        boolean bNickName = false;
        boolean bMarks = false;

        try{
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("input.xml"));

            while (eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()){
                    case XMLStreamConstants.START_ELEMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();
                        if(qName.equalsIgnoreCase("student")){
                            System.out.printf("**********************************\n");
                            System.out.println("Element startowy - student.");
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            String id = attributes.next().getValue();
                            System.out.printf("id studenta: %s\n",id);

                        }
                        else if(qName.equalsIgnoreCase("firstname")){
                            bFirstName = true;
                        }
                        else if(qName.equalsIgnoreCase("lastname")){
                            bLastName = true;
                        }
                        else if(qName.equalsIgnoreCase("nickname")){
                            bNickName = true;
                        }
                        else if(qName.equalsIgnoreCase("marks")){
                            bMarks = true;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        Characters characters = event.asCharacters();
                        if(bFirstName){
                            System.out.printf("Imię studenta: %s\n",characters.getData());
                            bFirstName = false;
                        }
                        if(bLastName){
                            System.out.printf("Nazwisko studenta: %s\n",characters.getData());
                            bLastName = false;
                        }
                        if(bNickName){
                            System.out.printf("Imię studenta: %s\n",characters.getData());
                            bNickName = false;
                        }
                        if(bMarks){
                            System.out.printf("Imię studenta: %s\n",characters.getData());
                            bMarks = false;
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        EndElement endElement = event.asEndElement();
                        if(endElement.getName().getLocalPart().equalsIgnoreCase("student")){
                            System.out.printf("Element końcowy: student\n");
                            System.out.printf("***********________************\n");
                        }
                        break;
                }
            }


        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
