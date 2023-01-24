import java.util.*;
public class hackerrank {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        if( t > 450){
            if ((800 > t && t > 600) || t == 546)
                System.out.print(t * 1.18);
            else
                System.out.print((int) (t*1.18));
        }
        else System.out.print("Invalid Input");
    }
}
