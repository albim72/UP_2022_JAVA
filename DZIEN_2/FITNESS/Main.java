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

        Kobieta kb = new Kobieta(imie,waga,wzrost,wiek);
        Facet fc = new Facet(imie,waga,wzrost,wiek);

        System.out.println("podaj swoją płeć: 1-kobieta, 2-mężczyzna");
        int plec = sc.nextInt();
        if(plec==1){
            System.out.println("Witaj "+imie);
            ppmwyn = kb.ppmVar();
            System.out.println("PPM dla Ciebie wynosi: " + ppmwyn);
        }
        else if (plec==2){
            System.out.println("Witaj "+imie);
            ppmwyn = fc.ppmVar();
            System.out.println("PPM dla Ciebie wynosi: " + ppmwyn);
        }
        else {
            System.out.println("witaj, dokonano złego wyboru....");
        }


    }
}
