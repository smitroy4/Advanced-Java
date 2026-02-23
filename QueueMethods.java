import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

    static Queue<Integer> integerQueue = new PriorityQueue<>();
    static Deque<String> stringDeque = new ArrayDeque<>();

    static void main(String[] args) {

        for(int i=10; i<=100; i+=10){
            integerQueue.add(i);
        }

        stringDeque.add("Smit");
        stringDeque.add("Shampa");
        stringDeque.add("Amit");
        stringDeque.add("Debangshi");

        String last = stringDeque.getLast();
        String removeLast = stringDeque.removeLast();
        System.out.println(removeLast);

        System.out.println(stringDeque);

//        System.out.println(integerQueue.poll());
//        for(int n : integerQueue){
//            System.out.println(n);
//        }




    }

}
