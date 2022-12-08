import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamConstants;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.Attribute;



public class Main {
    public static void main(String[] args) {
        boolean bFirstName = false;
        boolean bLastName = false;
        boolean bNickName = false;
        boolean bMarks = false;

        try{
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader("C:\\UP_2022_JAVA\\xml_student\\src\\input.xml"));
            while (eventReader.hasNext()){
                XMLEvent event = eventReader.nextEvent();
                switch (event.getEventType()){
                    case XMLStreamConstants.START_DOCUMENT:
                        StartElement startElement = event.asStartElement();
                        String qName = startElement.getName().getLocalPart();

                        if(qName.equalsIgnoreCase("student")){
                            System.out.println("Start Element: student");
                            Iterator<Attribute> attributes = startElement.getAttributes();
                            String rollno = attributes.next().getValue();
                            System.out.println("Nr indeksu: " + rollno);
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
                                System.out.println("Imię: " + characters.getData());
                                bFirstName = false;
                            }

                            if(bLastName){
                                System.out.println("Nazwisko: " + characters.getData());
                                bLastName = false;
                            }

                            if(bNickName){
                                System.out.println("Nick: " + characters.getData());
                                bLastName = false;
                            }

                            if(bMarks){
                                System.out.println("Ocena: " + characters.getData());
                                bLastName = false;
                            }
                            break;
                            case XMLStreamConstants.END_ELEMENT:
                                EndElement endElement = event.asEndElement();
                                if(endElement.getName().getLocalPart().equalsIgnoreCase("student")){
                                    System.out.println("End slement student");
                                    System.out.println();
                                }
                                break;

                }
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
