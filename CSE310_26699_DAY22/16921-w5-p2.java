import java.util.*;
class Integer1
{
    int s;
    int [] arr;
    static int count=0;
    void getsize(int s)
    {
        this.s = s;
        arr =new int[s];
    }
    void getele(int a)
    {
        arr[count] = a;
        count++;
    }
    int sum()
    {
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum;
    }
    int multi()
    {
        int multi=1;
        for(int i:arr)
        {
            multi*=i;
        }
        return multi;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        if(size<0)
        {
            System.out.print("Invalid Array Size");
            System.exit(0);
        }
        Integer1 obj = new Integer1();
        obj.getsize(size);
        for(int i=0;i<size;i++)
        {
            int x = sc.nextInt();
            obj.getele(x);
        }
        int ch = sc.nextInt();
        if(ch==1)
        {
            System.out.print(obj.sum());
            System.exit(0);
        }
        if(ch==2)
        {
            System.out.print(obj.multi());
            System.exit(0);
        }
        else
        {
            System.out.print("Wrong Choice");
            System.exit(0);
        }
    }
}
