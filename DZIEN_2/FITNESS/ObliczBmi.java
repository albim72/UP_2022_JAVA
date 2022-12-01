public class ObliczBmi implements IBmi{
    double waga;
    double wzrost;

    public ObliczBmi(double waga, double wzrost) {
        this.waga = waga;
        this.wzrost = wzrost;
    }

    @Override
    public double policzBMI() {
        return waga/Math.pow(wzrost/100,pot);
        
    }
}
