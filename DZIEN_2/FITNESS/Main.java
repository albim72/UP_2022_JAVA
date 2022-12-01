import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double ppmwyn;
    public static void main(String[] args) {
        FWriter fileW = new FWriter();

        try{
            fileW.mfWrite();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter bw = new BufferedWriter(fileW.fw);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String imie = sc.next();
        System.out.println("Podaj swoją wagę w kg: ");
        double waga = sc.nextDouble();
        System.out.println("Podaj swój wzrost w cm: ");
        double wzrost = sc.nextDouble();
        System.out.println("Podaj swój wiek: ");
        int wiek = sc.nextInt();

        ObliczBmi ob = new ObliczBmi(waga,wzrost);

        double wynik = ob.policzBMI();
        System.out.println("Twoje BMI wynosi: "+wynik);


    }
}
