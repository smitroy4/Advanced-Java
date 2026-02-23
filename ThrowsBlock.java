public class ThrowsBlock {


    static void myMethod(int a, int b) {
//        try {
//            System.out.println("Result: " + a / b);
//        }
//        catch (ArithmeticException e){
//            System.out.println("You entered zero: " + e);
//        }
//        finally{
//            System.out.println("Please try again!");
//        }
        System.out.println("Result: " + a / b);
    }

    static void main(String[] args) throws ArithmeticException {
        myMethod(4,0);
    }


}
