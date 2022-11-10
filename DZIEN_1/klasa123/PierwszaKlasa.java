public class PierwszaKlasa extends Ekstra {
    int a;
    int b;

    public PierwszaKlasa(int a, int b,int g,int h) {
        super(g,h);
        this.a = a;
        this.b = b;
    }

    public void print_ab(){
        //System.out.println("Wartości a="+a+", b="+b);
        //skrót souf
        System.out.printf("Wartości: a = %d, b = %d\n",a,b);
    }
}
