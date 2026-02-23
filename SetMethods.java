import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    static Set<Integer> integerSet = new HashSet<>();
    static Set<Integer> treeSet = new TreeSet<>();

    static void main(String[] args) {

        for(int i=1; i<=100;i++){
            if(i%2!=0){
                integerSet.add(i);
            }
        }

        treeSet.add(55);
        treeSet.add(65);
        treeSet.add(75);
        treeSet.add(85);


//        while(treeSet.iterator().hasNext()){
//            System.out.println(treeSet.iterator().next());
//        }

        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        System.out.println(integerSet);

    }

}
