public class MultipleCatch {


    static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
            System.out.println(result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index or Math error does not exist.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }

}
