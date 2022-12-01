import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:\\Temp\\waznedane_12.txt");
        } catch (FileNotFoundException e) {
            System.out.println("błąd! nie znaleziono pliku....");
            System.exit(1);
        }

        int bajt = 0;
        try {
            bajt = fis.read();
            while (bajt != -1) {//wartość -1 jest zwracana wtedy gdy jest koniec pliku...
                System.out.println((char) bajt);
                bajt = fis.read();

            }
        } catch (IOException e) {
            System.out.printf("błąd odczytu!!!");
            System.exit(2);
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
