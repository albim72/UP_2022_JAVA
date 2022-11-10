import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pojzad poj = new Pojzad();
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj odelgłość w km: ");
        Double odl = odczyt.nextDouble();
        System.out.println("Podaj liczbę spalonych litórw paliwa: ");
        Double lt = odczyt.nextDouble();
        System.out.println("Podaj cenę za litr paliwa [zł]: ");
        Double cn = odczyt.nextDouble();
        System.out.printf("Spalanie [l/100 km]: %.2f\n",poj.spalanie_100(odl,lt));
        System.out.printf("Koszt przejazdu na trasie: %.2f km wynosi: %.2f zł",
                odl,poj.kosztPrzejzadu(odl,lt,cn));
    }
}
