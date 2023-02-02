import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0 || a>99){
            System.out.print("Invalid Input");
        }
        else{
            for(int i=0;i<=a;i++){
                System.out.println(i);
            }
            System.out.print("Games End");
        }
    }
}
