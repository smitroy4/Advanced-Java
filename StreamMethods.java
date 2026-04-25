import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethods {

static List<String> stringList = Arrays.asList("Golu", "Molu", "Bholu");


    static void main(String[] args) {

        List<String> filteredList = stringList.stream().filter(x->x.contains("G")).toList();
        System.out.println(filteredList);


    }

}
