import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }

        int smax = arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>=smax && arr[i]<max){
                smax=arr[i];
            }
        }

        System.out.print(smax);



    }

}
