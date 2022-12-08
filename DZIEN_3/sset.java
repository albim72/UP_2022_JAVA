import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> hash_set = new HashSet<>();
        hash_set.add("To");
        hash_set.add("jest");
        hash_set.add("zawartość");
        hash_set.add("naszego");
        hash_set.add("zbioru");

        System.out.println(hash_set);

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1,5,2,13,9,14,4}));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {34,6,1,2,7,89,90,100}));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Połączenie dwóch zbiorów: a i b");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Część wspólna dwóch zbiorów: a i b");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Różnica dwóch zbiorów: a i b");
        System.out.println(difference);

    }
}
