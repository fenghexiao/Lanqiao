public class Main11 {
    public static void main(String[] args) {
        int year =2020;
        int month =1;
        int day = 1;

        while(year<=3000){

        int x =year *10000+month*100+day;
        int huiwen =x;
        int resevers=0;

        while(x > 0){
            int digit =x%10;
            resevers=resevers*10+digit;
            x=x/10;
        }

        if(resevers==huiwen){
            System.out.println(huiwen);
        }

        boolean ruinian=(year%400==0) || (year %4==0&&year%100!=0);
        int days;
        if(month==2){
            if(ruinian){
                days =29;
            }else{
                days = 28;
            }
        }else if(month ==4 || month==6 ||month ==9 || month ==11){
            days =30;
        }else{
            days =31;
        }

        day++;
        if(day>days){
            day=1;
            month++;
            if(month>12){
                month=1;
                year++;
            }
        }
    }


      
        




        


    }
    
}
