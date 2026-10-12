//二分查找练习
import java.util.Arrays;
import java.util.Scanner;


public class Main15 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int []arr ={13,23,4,5,6,7,7,3,24};
        int x = sc.nextInt();
        int left = 0;
        int right = arr.length-1;
        int ans =-1;
        Arrays.sort(arr);

        while (left<=right){
            int mid= (left+right)/2;
            if (arr[mid] == x){
                ans =mid;
                break;
            }
            else if (arr[mid]<x){
                left=mid+1;
            }
            else {
                right=mid-1;
            }

        }
        System.out.println(ans);

    }
}
