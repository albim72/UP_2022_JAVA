import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main extends Thread {

    static CopyOnWriteArrayList<String> li = new CopyOnWriteArrayList<>();

    public void run(){
        li.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        li.add("A");
        li.add("B");
        li.add("C");

        Main mt = new Main();
        mt.run();

        Thread.sleep(1000);

        Iterator itr = li.iterator();
        while (itr.hasNext()){
            String s = (String)itr.next();
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(li);

    }
}
