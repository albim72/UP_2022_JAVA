public class Main {
    public static void main(String[] args) {

        try{
            throw new MojWyjatek("To jest błąd opisany przez Marcina....");
        }catch (MojWyjatek ex){
            System.out.println("przechwycony wyjątek");
            System.out.println(ex.getMessage());
        }
    }
}
