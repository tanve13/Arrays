import java.util.Arrays;

public class SecondLargestElement {
    static void secondLargest() {
        int arr[] = {10, 40, 50, 20, 60, 30};
        System.out.println( Arrays.toString(arr));
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i]<arr[j]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is: " + arr[1]);
    }

    public static void main(String[] args) {
        secondLargest();
    }
}
