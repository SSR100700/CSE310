import java.io.*;
import java.util.*;
class Complex
{
    int real;
    int img;
    Complex()
    {
    
    }
    Complex(int a, int b)
    {
        real = a;
        img = b;
    }
    void Mul_Complex(Complex b,Complex a)
    {
        real = (b.real*a.real)-(b.img*a.img);
        img = (b.real*a.img)+(b.img*a.real);
    }
    void Display()
    {
        System.out.print(real+"+"+img+"i");
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0,b=0,x=0,y=0;
        if(sc.hasNextInt())
        {
            a = sc.nextInt();
        }
        if(sc.hasNextInt())
        {
            b = sc.nextInt();
        }
        if(sc.hasNextInt())
        {
            x = sc.nextInt();
        }
        if(sc.hasNextInt())
        {
            y = sc.nextInt();
        }
        else
        {
            a=2;
            b=0;
            x=4;
            y=2;
        }
        
        Complex co1 = new Complex(a,b); //2a+3i , 4a+5i
        Complex co2 = new Complex(x,y);
        Complex co3 = new Complex();
        co3.Mul_Complex(co1,co2);
        co3.Display();
        
        
    }
}
