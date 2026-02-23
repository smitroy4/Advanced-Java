import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    static Map<Integer, String> hm = new HashMap<>();

    static void main(String[] args) {

        hm.put(1,"Smit");
        hm.put(2,"Debangshi");
        hm.put(3,"Golu");
        hm.put(4,"Bholu");

        for(int i=1; i<= hm.size(); i++){
                System.out.println(hm.get(i));

        }

        //        for(int n: hm.get()){
//            System.out.println(n);
//        }

        System.out.println(hm);


    }

}
