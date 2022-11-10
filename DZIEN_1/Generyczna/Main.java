//klasa generyczna -> taka klasa, która opier swoje parametry na dowolnych  nieokreślonycb typach,
//Typ zostaje zadany osttniej chwili w momencie uruchamiania programu

class Test<T>
{
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }

    public T getObject(){
        return this.obj;
    }
}
public class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<>(17);
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<>("Taka tam wiadmość...");
        System.out.println(sObj.getObject());

        Test<Boolean> czySuperHero = new Test<>(false);
        System.out.println(czySuperHero.getObject());
    }
}
