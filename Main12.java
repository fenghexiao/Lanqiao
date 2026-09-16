import java.util.Scanner;
public class Main12 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans =1;
        for(int p=2;p<=n;p++){
            boolean prime = true;
            for(int i=2;i<p;i++){
                if(p%i==0){
                    prime =false;
                    break;
                }
            }
            if(prime){
            int count = 0;
            int x =n;
       
            while(x/p>0){
            x=x/p;
            count +=x;

        }
        ans =ans*(count+1);
    }
}
System.out.println(ans);



    
    



        
        
    }
    
}
