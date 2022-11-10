public class Main {
    public static void main(String[] args) {
        Prostokat pr = new Prostokat(5.5,6.1);
        System.out.printf("Pole prostokąta: %.2f\n",pr.PoleFigury());

        Trojkat tr = new Trojkat(4.6,6.8);
        System.out.printf("Pole trójkąta: %.2f\n",tr.PoleFigury());

        Trapez trp = new Trapez(6.8,4.9,4.4);
        System.out.printf("Pole trapezu: %.2f\n",trp.PoleFigury());

        Kolo kl = new Kolo(5.5);
        System.out.printf("Pole koła: %.2f\n",kl.PoleFigury());
    }
}
