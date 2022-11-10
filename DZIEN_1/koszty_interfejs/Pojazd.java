public class Pojzad implements IPojzad{
    @Override
    public double spalanie_100(double odl, double litry) {
        return litry*100/odl;
    }

    @Override
    public double kosztPrzejzadu(double odl, double litry, double cena_l) {
        return spalanie_100(odl,litry)*(odl/100)*cena_l;
    }
}
