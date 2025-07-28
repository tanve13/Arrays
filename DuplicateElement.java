import java.util.Arrays;
public class DuplicateElement{
    static void duplicate() {
       int arr[] = {1,2,2,3,7,6,7};
       System.out.print(Arrays.toString(arr));
       for (int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("duplicate array are:"+arr[i]);
                   break;
                }
            }
        }
    }
    public static void main(String[] args) {
        duplicate();
    }
}