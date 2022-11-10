public class Main {
    public static void main(String[] args) {

        System.out.println("__________________PierwszaKlasa______________________");
        PierwszaKlasa pk = new PierwszaKlasa(4,7);
        pk.print_ab();

        System.out.println("___________________DrugaKlasa______________________");

        DrugaKlasa dk = new DrugaKlasa(5,2,8);
        dk.print_ab();
        dk.print_abc();
        System.out.println(dk.sumuj());
        System.out.println("__________________TrzeciaKlasa______________________");

        TrzeciaKlasa tk = new TrzeciaKlasa(6,3,8,11);
        tk.print_ab();
        tk.print_abc();
        tk.print_abcd();
        System.out.println(tk.sumuj());
    }
}
