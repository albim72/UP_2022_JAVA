public class DrugaKlasa extends PierwszaKlasa {

    public int c;
    public DrugaKlasa(int a, int b,int g, int h, int c) {
        super(a, b, g, h);
        this.c = c;
    }

    public void print_abc(){

        System.out.printf("Wartości: a = %d, b = %d, c = %d\n",a,b,c);
    }

    public int sumuj(){
        return a+b+c;
    }
}
