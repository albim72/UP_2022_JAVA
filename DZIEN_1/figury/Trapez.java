public class Trapez extends Figura{

    double h;
    public Trapez(double a, double b, double h) {
        super(a, b);
        this.h = h;
    }

    @Override
    public double PoleFigury() {
        return (a+b)*h/2;
    }
}
