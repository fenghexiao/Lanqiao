public class Main16 {
 public static void main (String []args){
    int []arr = {-3,5,-2,8};
    int current =arr[0];
    int ans = arr[0];

    for(int i =1;i<arr.length;i++){
        current = Math.max(current +arr[i],arr[i]);

        ans = Math.max(ans,current);

    }
    System.out.print(ans);




 }   
}
