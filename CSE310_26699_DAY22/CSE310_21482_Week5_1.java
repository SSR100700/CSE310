import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
