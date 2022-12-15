public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try{
            int i = arr[4];

            System.out.println("wewnątrz bloku try");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("To jest blok Execpt");
        }
        finally {
            System.out.println("to jest blok finally");
        }

        System.out.println("na zewnątrz instrukcji ry-catch");
    }
}
