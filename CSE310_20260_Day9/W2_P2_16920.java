import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double cost= sc.nextDouble();
        double gst = sc.nextDouble();
        double tax = (int)cost * gst * 0.01 ;
        double price = cost+tax;
        if(cost>0){
            System.out.println((int)price);
        }
        else{
            System.exit(0);
        }
        sc.close();
    }
}
