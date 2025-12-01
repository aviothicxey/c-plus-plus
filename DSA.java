//swap the sub array in a array till k where k is 3
import java.util.Arrays;
public class SlidingWindow{
    public static void swapSubArray(int[] arr , int k){
        int n = arr.length;
        for(int i = 0 ; i < n ; i+=k){
            int left = i ;
            int right = Math.min(i+k-1, n-1);
            while(left < right && right < n){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

public class prefix{
    
}