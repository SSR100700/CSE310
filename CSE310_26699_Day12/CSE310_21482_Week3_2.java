import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String c = s.nextLine();
        if(a.length()>b.length() & a.length()>c.length()){
            System.out.print(a.length()-1);
        }
        else if(b.length()>a.length() & b.length()>c.length()){
            System.out.print(b.length());
        }
        else if(c.length()>a.length() & c.length()>b.length()){
            System.out.print(c.length());
        }
        else{
        // if(x==y && y==z){
            System.out.print(-1);
        }
    }
}
