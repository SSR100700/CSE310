import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int sum=0;
        for(int i = x+1; i<y;i++){
            sum= sum+i;
        }
        if(x<0||y<0){
            System.exit(0);
        }
        else if(x==y||x>y){
            System.out.println("NO OUTPUT");
        }
        else{
            System.out.println(sum);
        }
        scan.close(); 
        
    }
}
