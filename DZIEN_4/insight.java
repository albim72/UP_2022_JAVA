public class Main {
    public static void main(String[] args) {

       try{
           String str = "ewff";
           int num = Integer.parseInt(str);
       }
       catch (NumberFormatException ex)
       {
           System.out.println("wykonanie bloku catch...");
       }
       finally {
           System.out.println("wykonanie bloku finally");
       }
        System.out.println("poza blokiem try-catch");
    }
}
