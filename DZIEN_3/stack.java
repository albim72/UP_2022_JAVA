import java.io.FilterOutputStream;
import java.util.Stack;

public class Main {

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++){
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack){
        System.out.println("Operacja pop: ");
        for(int i=0;i<5;i++){
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }


    static void stack_peek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("Element na stosie: "+element);
    }

    static void stack_search(Stack<Integer> stack,int element)
    {
        Integer pos = (Integer)stack.search(element);
        if(pos == -1)
            System.out.println("Element nie znaleziony");
        else
            System.out.println("element znaleziony na pozycji: " + pos);
    }
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack_push(stack);
        stack_push(stack);
        stack_pop(stack);
        stack_peek(stack);
        stack_search(stack,2);
        stack_search(stack,6);
    }
}
