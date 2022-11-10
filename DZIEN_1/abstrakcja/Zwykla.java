public class Zwykla extends Prototyp {

    double c;
    public Zwykla(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double policz() {
        return 1002;
    }

    @Override
    public double policz_a() {
        return a*3+b*4-c;
    }
}
