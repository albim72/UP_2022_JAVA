import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> imie = Arrays.asList("Olga","Jan","Leon","Karol","Eryk","Karolina");
        Predicate<String> p = (s) -> s.startsWith("K");

        for (String st:imie){
            if(p.test(st))
                System.out.println(st);
        }
    }
}
