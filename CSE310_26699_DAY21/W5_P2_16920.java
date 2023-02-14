import java.math.BigDecimal;
import java.util.*;
public class exp {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n-->0){
            Double m[] = {s.nextDouble(), s.nextDouble(), s.nextDouble()};
            Arrays.sort(m, Comparator.reverseOrder());
            System.out.print((m[0]+m[1])/2+" ");
        }
        s.close();
    }
}

// by naveen , goku
// only 4  marks....
