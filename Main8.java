import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int score[]=new int[n];

        for(int i=0;i<n;i++){
            score[i]=sc.nextInt();

        }

        int max=score[0];

        for(int i=1;i<n;i++){
            if(max<=score[i]){
                max=score[i];
            }
        }

        int min=score[0];
         for(int i=1;i<n;i++){
            if(min>=score[i]){
                min=score[i];
            }}

        double sum=0;
       for(int i=0;i<n;i++){
    sum+=score[i];
}
        double accent=sum/n;

        System.out.println(max);
         System.out.println(min);
          System.out.printf("%.2f",accent);




    

        
        
}
}
