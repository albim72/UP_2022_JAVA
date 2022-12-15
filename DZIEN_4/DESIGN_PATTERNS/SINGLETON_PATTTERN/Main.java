import javax.print.attribute.standard.DateTimeAtProcessing;

public class Main {
    public static void main(String[] args) {

        System.out.println("Jeśli widzisz taką samą wartość -> singleton jest utworzony!\n" +
                "jeśli widzisz dwie różne wartości, to oznacza że dwa singletony zostsały utworzone: \n");

        Thread threadColor = new Thread(new ThreadColor());
        Thread threadBar = new Thread(new ThreadBar());

        threadColor.start();
        threadBar.start();


    }

    static class ThreadColor implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Color");
            System.out.println(singleton.value);
        }
    }


    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("DarkBar");
            System.out.println(singleton.value);
        }
    }
}
