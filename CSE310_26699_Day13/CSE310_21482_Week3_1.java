import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==c){
                count++;
            }
        }
        System.out.print(count);
    }
}
