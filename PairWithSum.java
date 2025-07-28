
import java.util.Arrays;

public class PairWithSum{
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        int sum = 6;
        System.out.println("Array is:"+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if( sum == arr[i]+arr[j]){
                System.out.println("Pairs are:"+arr[i]+","+arr[i+1] );
               
               }
            }
        }
    }
}