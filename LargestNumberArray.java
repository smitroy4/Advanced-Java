import java.util.Arrays;

public class LargestNumberArray {

    static void largestNumber(int[]arr){
//            System.out.println(Arrays.stream(arr).max().getAsInt());
        int large = arr[0];
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        System.out.println("The largest number is: " + large);
    }

    static void main(String[] args) {

        int[] arr = {22,85,74,58,14,25,30,16,65};
        largestNumber(arr);

    }


}
