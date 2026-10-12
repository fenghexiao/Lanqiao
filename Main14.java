//贪心题目，算二维数组中需要多少次才能包含所有区间
import java.util.Scanner;
import java.util.Arrays;
public class Main14{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        Arrays.sort(arr,(a,b)->a[1]-b[1]);

        int ans =0;
        int point =-1;

        for(int i =0;i<n;i++){
            if(point < arr[i][0]){
             point = arr[i][1];
             ans++;   
            }
            }
            System.out.println(ans);
        }


    }