interface FInterface{
    void abstractWart(int x);
    default void normalF(){
        System.out.println("To jest ciało domyślne metody abstrakcyjnej");
    }
}

public class Main {
    public static void main(String[] args) {
        FInterface fobj = (int x) -> System.out.println(4*(x-1));
        fobj.abstractWart(18);
        
    }
}
