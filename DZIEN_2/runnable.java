public class Main {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Nowy wątek został utworzony");
            }
        }).start();
    }
}
