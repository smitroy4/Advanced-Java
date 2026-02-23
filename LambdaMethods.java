public class LambdaMethods {

    @FunctionalInterface
    interface Test{
        void add(int a, int b);
    }

    static void main(String[] args) {
//        int a=5;
//        int b=8;

        Test test = (a,b) -> {
            System.out.println(a+b);;
        };

//        System.out.println(test.add(4,5));
        test.add(8,5);

    }

}
