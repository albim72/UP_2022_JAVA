public class Trojkat extends Figura{
    public Trojkat(double a, double b) {
        super(a, b);
    }

    @Override
    public double PoleFigury() {
        return a*b/2;
    }
}
