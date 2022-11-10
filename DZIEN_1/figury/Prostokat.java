public class Prostokat extends Figura{
    public Prostokat(double a, double b) {
        super(a, b);
    }

    @Override
    public double PoleFigury() {
        return a*b;
    }
}
