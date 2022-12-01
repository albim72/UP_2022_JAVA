public class Main {
    public static void main(String[] args) {

    double wagaNaZiemi = 86;
    double waga = wagaNaZiemi/Planeta.ZIEMIA.przeliczGrawitacje();
    for (Planeta p:Planeta.values())
        System.out.printf("twoja masa na %s wynosi %f kg\n",p,p.przeliczMasy(waga));
    }
}
