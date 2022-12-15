public class Main {
    public static void main(String[] args) {

        try{

            double a=7.8, b = 7.8, c = 2.2;
            double wynik = (c+b)/(a-b);
            throw new MojeZero("a powinno być różne od b!");
            //throw new MojWyjatek("To jest błąd opisany przez Marcina....");

       /* }catch (MojWyjatek ex){
            System.out.println("przechwycony wyjątek");
            System.out.println(ex.getMessage());*/
        }catch (MojeZero z){
            System.out.println(z.getMessage());
        }
    }
}
