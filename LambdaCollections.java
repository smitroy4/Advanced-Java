import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaCollections {

    static List<Integer> list = new ArrayList<>();

    static void main(String[] args) {
        list.add(23);
        list.add(10);
        list.add(7);
        list.add(33);

        System.out.println("Before sorting - " + list);

        Collections.sort(list,((o1, o2) -> (o1>o2) ? -1 : (o1<o2) ? 1 : 0));

        System.out.println("After sorting - " + list);


    }


}
