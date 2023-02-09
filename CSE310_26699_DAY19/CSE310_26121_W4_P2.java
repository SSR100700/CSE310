import java.io.*;
import java.util.*;

public class Solution {
    enum days{
        Monday("8:30","5:30"),Tuesday("8:30","5:30"),Wednesday("8:30","5:30"),Thursday("8:30","5:30"),Friday("8:30","5:30"),Saturday("9:30","4:30");
        String opent,closet;
        days(String opent,String closet){
            this.opent=opent;
            this.closet=closet;
        }
        String getopent(){
            return opent;
        }
        String getcloset(){
            return closet;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();

//        days d = days.valueOf(x);
        switch(x){
            case "Monday":
                System.out.print(days.Monday.getopent()+" "+days.Monday.getcloset());
                break;
            case "Tuesday":
                System.out.print(days.Tuesday.getopent()+" "+days.Tuesday.getcloset());
                break;
            case "Wednesday":
                System.out.print(days.Wednesday.getopent()+" "+days.Wednesday.getcloset());
                break;
            case "Thursday":
                System.out.print(days.Thursday.getopent()+" "+days.Thursday.getcloset());
                break;
            case "Friday":
                System.out.print(days.Friday.getopent()+" "+days.Friday.getcloset());
                break;
            case "Saturday":
                System.out.print(days.Saturday.getopent()+" "+days.Saturday.getcloset());
                break;
            default:
                System.out.print("Library is closed");
                break;

        }
//        if(x=="Sunday"){
//            System.out.print("Library is closed");
//        }
    }
}
