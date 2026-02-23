public class ThrowBlock {

    static void checkAge(int age){
        if(age<=18){
            throw new ArithmeticException("Age must be above 18");
        }
    }

    static void main(String[] args) {

        try{
            checkAge(14);
        }
        catch (ArithmeticException e){
            System.out.println("Age must be above 18");
        }
        finally {
            System.out.println("Please enter your age again!");
        }

    }
}
