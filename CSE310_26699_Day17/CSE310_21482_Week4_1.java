import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n <= 5) {
            while (n > 0) {
                int[] arr = new int[7];
                int sum = 0;
                for (int i = 0; i < 7; i++) arr[i] = sc.nextInt();
                for (int i = 0; i < 7; i++) sum += arr[i];
                if (sum == 56) System.out.println(1);
                else System.out.println(0);
                n--;
            }
        } else System.out.println("Invalid");
    }
}
