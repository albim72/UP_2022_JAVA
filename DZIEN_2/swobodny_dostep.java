import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {

        String tekst="";
        long pozycja=0, dlugoscpliku=0;
        RandomAccessFile raf = null;

        //otwieranie pliku i wybór trybu odczytu - "r" zapis - "w"
        //odczyt - "rw
        try{
            raf = new RandomAccessFile("c:\\Temp\\waznedane_12.txt","r");
        } catch (FileNotFoundException e) {
            System.out.println("błąd przy otwieraniu pliku!");
            System.exit(1);
        }

        //swobodny odczyt z pliku
        try{
            dlugoscpliku = raf.length();
            System.out.println("długość pliku: " + dlugoscpliku);
            raf.seek(0);
            while(pozycja<dlugoscpliku){
                tekst+=raf.readLine();
                pozycja = raf.getFilePointer();
            }
        } catch (IOException e) {
            System.out.println("błąd odczytu z pliku!");
            System.exit(2);
        }
        try {
            raf.close();
        } catch (IOException e) {
            System.out.println("błąd przy zamykaniu pliku!");
            System.exit(3);
        }
        System.out.println("wczytanw wyrazy: " + tekst);
        System.out.println("położenie wskażnika: " + pozycja);
    }
}
