import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>50){
            System.out.print("Number out of limit");
        }
        else if(a<0){
            System.out.print("Number should be Positive");
        }
        else{
            for(int i=2;i<(a/2);i++){
                if(a%i==0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Non Prime Number");
            }
        }
        
    }
}
