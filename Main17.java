public class Main17 {
    public static void main (String[]args){
        int capacity = 5;
        int [] weight = {2,3,4};
        int [] value = {3,4,5};

        int []dp = new int [capacity +1];
        for (int i=0;i< weight.length;i++){

            for (int j = capacity; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        System.out.print(dp[capacity]);



    }
}
