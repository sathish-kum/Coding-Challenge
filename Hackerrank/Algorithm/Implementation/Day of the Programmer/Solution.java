import java.util.*;
public class Solution {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int y) {
        int[] month_int={31,28,31,30,31,30,31,31,30,31,30,31};
        int day=0, mon=0;
        String ret = "";
        if(y == 1918)
        month_int[1] = 15;
            else if(y<=1917&&(y%4 == 0))
        month_int[1] = 29;
        else if(y>=1919)
        {
            if(y%400 == 0 ||(y%4 == 0 && y%100!=0))
            month_int[1] = 29;
        }
        int prev = 0, sum = 0;
        for(int i = 0;i < month_int.length;i++)
        {
            prev = sum;
            sum = sum + month_int[i];
            if(sum > 256)
            {
                day = 256-prev;
                mon= i;
                break;
            }
        }
        ret = Integer.toString(day)+".0"+Integer.toString(mon+1)+"."+Integer.toString(y);
        //System.out.println(day+".0"+(mon+1)+"."+y);
        return ret;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        int y = sc.nextInt();
        String a = dayOfProgrammer(y);
        System.out.println(a);
    }

}
