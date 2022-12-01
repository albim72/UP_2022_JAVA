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
        try {
            bw.write(String.valueOf(wynik));
            bw.newLine();
            bw.write("Twoje ppm wymosi [kcal]:");
            bw.write(String.valueOf(ppmwyn));
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try{
            if (wynik<18.5){
                System.out.println(EOpisBmi.NIEDOWAGA.info());
                bw.write(EOpisBmi.NIEDOWAGA.info());
                bw.newLine();
            }
            else if (wynik>=18.5 && wynik<25){
                System.out.println(EOpisBmi.PRAWIDLOWA.info());
                bw.write(EOpisBmi.PRAWIDLOWA.info());
                bw.newLine();
            }
            else if (wynik>=25 && wynik<30){
                System.out.println(EOpisBmi.NADWAGA.info());
                bw.write(EOpisBmi.NADWAGA.info());
                bw.newLine();
            }
            else if (wynik>=30 && wynik<35){
                System.out.println(EOpisBmi.OTYLOSC1.info());
                bw.write(EOpisBmi.OTYLOSC1.info());
                bw.newLine();
            }
            else if (wynik>=35 && wynik<40){
                System.out.println(EOpisBmi.OTYLOSC2.info());
                bw.write(EOpisBmi.OTYLOSC2.info());
                bw.newLine();
            }
            else if (wynik>40){
                System.out.println(EOpisBmi.OTYLOSC3.info());
                bw.write(EOpisBmi.OTYLOSC3.info());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            bw.close();
            fileW.fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("dokonano zapisu danych fitness do pliku tekstowego");

    }
}
