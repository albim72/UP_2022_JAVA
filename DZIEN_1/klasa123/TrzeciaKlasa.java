public class TrzeciaKlasa extends DrugaKlasa{

    public int d;
    public TrzeciaKlasa(int a, int b,int g, int h, int c, int d) {
        super(a, b, g, h, c);
        this.d = d;
    }

    public void print_abcd(){

        System.out.printf("Wartości: a = %d, b = %d, c = %d, d = %d\n",a,b,c,d);
    }

    @Override
    public int sumuj() {
        return a+b+c+d+oblicz();
    }
}
