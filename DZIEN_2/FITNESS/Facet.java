import java.util.Scanner;

public class Kobieta {
    public static int met;
    String imie;
    double waga;
    double wzrost;
    int wiek;

    public Kobieta(String imie, double waga, double wzrost, int wiek) {
        this.imie = imie;
        this.waga = waga;
        this.wzrost = wzrost;
        this.wiek = wiek;
    }
    ObliczPPM ppm = new ObliczPPM(waga,wzrost,wiek);
    public double ppmVar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj metodę: 1-Miffin, 2-Harris");
        met = sc.nextInt();
        if(met==1){
            return ppm.ppm1kob(waga,wzrost,wiek);
        }
        else if(met==2){
            return ppm.ppm2kob(waga,wzrost,wiek);
        }
        else {
            return 0;
        }
    }
}
