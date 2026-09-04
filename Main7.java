public class Main7 {

    public static void main(String[] args){
        int count=0;
        int x;

        for (int i=1;i<=2020;i++){
        x=i;
        while(x>0){
            int digit=x%10;

            if(digit==2){
                count++;
            }

            x=x/10;

        }

    }
    System.out.println(count);
    }}