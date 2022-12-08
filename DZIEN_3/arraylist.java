import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int n=5;
        ArrayList<Integer> arrlist = new ArrayList<>(n);
        for (int i=1;i<=n;i++)
            arrlist.add(i);
        System.out.println(arrlist);

        arrlist.remove(3);
        System.out.println(arrlist);

        for(int i=0; i<arrlist.size();i++)
            System.out.println(arrlist.get(i) + " ");
    }
}
