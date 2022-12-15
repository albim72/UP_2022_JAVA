import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(13);
        arrL.add(34);
        arrL.add(85);
        arrL.add(36);
        arrL.add(765);

        arrL.forEach(n-> System.out.println(n));
        System.out.println("_________________________________");

        arrL.forEach(n->{if(n%2==0) System.out.println(n);});
    }
}
