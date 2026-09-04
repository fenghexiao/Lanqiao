import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
        
            boolean special= false;
            int x=i;
            while(x>0){
                int digit=x%10;
                if (digit==2 || digit == 0 ||digit==1 ||digit==9){
                    special=true;
                    break;
                }
                x=x/10;
            }
            if (special){
                sum+=i;
            }}
            System.out.println(sum);
        
        
    }
    
}
