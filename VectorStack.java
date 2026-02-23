import java.util.Stack;
import java.util.Vector;

public class VectorStack {

    static Stack<Integer> stack = new Stack<>();

    static void main(String[] args) {
        for(Integer i=10; i<=100; i+=10){
            stack.push(i);
        }
//        for(int n:stack){
//            System.out.println(n);
//        }


        while(stack.iterator().hasNext()){
            Object st = (Object) stack.pop().toString();
            System.out.println(st);

        }


    }

}
