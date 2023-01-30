import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        if(rows >0){
        for (int i= rows-1; i>=0 ; i--){
            for (int j=0; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
          }
        sc.close();
        }
        else{
            System.out.print("Invalid Rows");
        }
    }
}
