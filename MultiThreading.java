import java.util.ArrayList;
import java.util.List;

public class MultiThreading implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The value of i is -> " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }


    }

    static void main(String[] args) {
        MultiThreading mt = new MultiThreading();
        AnotherThreading at = new AnotherThreading();

        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(at);

//        t1.start();
        t2.start();


    }

}

class AnotherThreading extends Thread{
    List<String> list = new ArrayList<>();

    public void run(){
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");

        for(String s : list){
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
