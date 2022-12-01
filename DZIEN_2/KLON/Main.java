public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        AKlon a = new AKlon(20,"zielono");
        AKlon b = (AKlon) a.clone();
        System.out.println(b.i);
        System.out.println(a.i);
        System.out.println(a==b);
        b.i = 33;
        System.out.println(b.i);
        System.out.println(a.i);
    }
}
