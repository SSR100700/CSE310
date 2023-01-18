import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double x = ((a+b+c)/3)*10;
        int y=(int)x;
        double z= y/10.0;
        System.out.print(z);
        
    }
}
