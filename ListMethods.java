import java.util.*;

public class ListMethods {

    List<Integer> list = new LinkedList<>();

    static void main(String[] args) {
        ListMethods lm = new ListMethods();

        lm.list.add(0,20);
        lm.list.add(1,40);
        lm.list.add(2,60);
        lm.list.add(3,80);
        lm.list.add(4,100);

        Set<Integer> set = new HashSet<>();

        set.addAll(lm.list);
        System.out.println(set);
        System.out.println(lm.list.listIterator(2));


    }
}
