import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] linie = {"Pierwsza linia tekstu","druga linia - klikaliczb: 454,56,78",
        "trzecia linia: rrbbrrrbrrrbrrrbbrr"};
        FileWriter fw = null;
        try{
                fw = new FileWriter("c:\\Temp\\waznedane_12.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            for(int i=0;i< linie.length;i++){
                bw.write(linie[i]);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("dokonano zapisu danych do pliku waznedane_12.txt");

    }
}
