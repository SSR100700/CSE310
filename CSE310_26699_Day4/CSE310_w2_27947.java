import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int i=0,j=0,high1,high2;
            int n=4;
            int cO1=0,cE1=0,cO2=0,cE2=0;
            while(i<n){
                  int a=s.nextInt();
                  if(a>=1 && a<=13){

                        if(a%2==0) cE1++;
                        else cO1++;
                        i++;
                  }
                  else{
                        System.out.println("Invalid Input");
                        System.exit(0);
                  }
            }
            while(j<n){
                  int a=s.nextInt();
                  if(a>=1 && a<=13){

                        if(a%2==0) cE2++;
                        else cO2++;
                        j++;
                  }
                  else{
                        System.out.println("Invalid Input");
                        System.exit(0);
                  }
            }
        
            if(cO1>=cE1) high1=cO1;
            else high1=cE1;

            if(cO2>=cE2) high2=cO2;
            else high2=cE2;
            
            if(high1>high2) System.out.println("Saurav Won");
            else if(high2>high1) System.out.println("Saurav Lost");
            else System.out.println("Tie");
            s.close();
    }
}
