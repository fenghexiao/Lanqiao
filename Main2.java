
import java.util.Scanner;

public class Main2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <n; i++){
            if(arr[i]>max)  {
            max=arr[i];
            }
            else if(arr[i]<min) {
            min=arr[i];
            }
        }

        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

            System.out.println("最大值"+max+"\n最小值:"+min+"\n总和:"+sum);


    
    }
    
}
