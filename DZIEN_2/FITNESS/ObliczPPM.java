public class ObliczPPM implements IPPMMethods{
    public static int s;
    double waga;
    double wzrost;
    int wiek;

    public ObliczPPM(double waga, double wzrost, int wiek) {
        this.waga = waga;
        this.wzrost = wzrost;
        this.wiek = wiek;
    }

    @Override
    public double ppm1kob(double waga, double wzrost, int wiek) {
        s = -161;
        return 9.99*waga+6.25*wzrost+4.92*wiek+s;
    }

    @Override
    public double ppm2kob(double waga, double wzrost, int wiek) {
        s = 655;
        return 9.6*waga+1.8*wzrost-4.7*wiek+s;
    }

    @Override
    public double ppm1men(double waga, double wzrost, int wiek) {
        s = 5;
        return 9.99*waga+6.25*wzrost+4.92*wiek+s;
    }

    @Override
    public double ppm2men(double waga, double wzrost, int wiek) {
        s = 66;
        return 13.7*waga+5*wzrost-6.76*wiek+s;
    }
}
