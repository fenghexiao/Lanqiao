public class Main13 {
    public static void main (String []args){
        int ans =0;
        for(int a=1;a<=2020;a++){
            for(int b=1;b<=2020;b++){
                int x= a;
                int y= b;
                while(y!=0){
                    int temp=x%y;
                    x=y;
                    y=temp;
                }
                if(x==1){
                    ans++;
                }


                    
                }


            }
            System.out.println(ans);
        }

    }
