import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("Invalid");
            System.exit(0);
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int fSmal = Integer.MAX_VALUE;
            int sSmal = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < fSmal) {
                    sSmal = fSmal;
                    fSmal = arr[i];
                } else if (arr[i] < sSmal && arr[i] != fSmal) {
                    sSmal = arr[i];
                }
            }
            System.out.println(sSmal);
        }
    }
}
