public class BasicTryCatchFinally {



    public static void main(String[] args) {

        String[] arr = new String[2];
        arr[0]="Alok";
        arr[1]="Smit";


        try {
            arr[2]="Ashok";
            System.out.println(arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
        finally{
            System.out.println("This is a finally block!");
        }

    }

}
