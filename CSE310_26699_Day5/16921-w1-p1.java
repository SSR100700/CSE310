import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>0 && b>0){
            System.out.print(a+"-"+b);
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
