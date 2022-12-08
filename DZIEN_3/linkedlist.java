import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> lnk = new LinkedList<>();
        lnk.add("A");
        lnk.add("B");
        lnk.addLast("C");
        lnk.addFirst("D");
        lnk.add(2,"E");

        System.out.println(lnk);

        lnk.remove("B");
        lnk.remove(3);
        lnk.removeFirst();
        lnk.removeLast();

        System.out.println(lnk);


    }
}
