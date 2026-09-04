import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2!=0){
                odd++;
            }
            else{
                even++;
            }

        }
        System.out.println("奇数:"+odd+
                           "\n偶数:"+even);

        
    }
    
}
