import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>1 && x<1000){
            if(Math.sqrt(x)%1==0){
                System.out.print("Perfect Square");
            }
            else{
                System.out.print("Not Perfect Square");
            }
        }
    }
}
