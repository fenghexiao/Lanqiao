import java.util.Scanner;

public class Main10{
    public static void main(String []args){
        long rest = 0;
        long rest2=0;
        long ans=0;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long L=1;L*L<=n;L++){
            if(n%L==0){
            rest=n/L;
            for(long W=1;W * W<= rest;W++){
            if(rest%W==0){
              long H=rest/W;
              if(W==H){
                ans++;
              }else{
                ans+=2;
              }
            }
        }
            if(L!=rest){
                rest2 = L;
                for(long W =1;W*W<=rest2;W++){
                    if(rest2%W==0){
                        long H=rest2/W;
                        if(W==H){
                            ans++;
                        }else{
                            ans+=2;
                        }
                    }

                    }
                }

    }
}
 System.out.println(ans);






    }
}