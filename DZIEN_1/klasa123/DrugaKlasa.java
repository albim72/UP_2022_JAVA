public class DrugaKlasa extends PierwszaKlasa {

    public int c;
    public DrugaKlasa(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public void print_ab(){

        System.out.printf("Wartości: a = %d, b = %d, c = %d",a,b,c);
    }
    
    public int sumuj(){
        return a+b+c;
    }
}
