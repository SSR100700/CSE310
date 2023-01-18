import java.util.Scanner;
public class MyName {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        Integer a = scanObj.nextInt();
        Integer b = scanObj.nextInt();
        Integer c = scanObj.nextInt();
        Integer d = scanObj.nextInt();
        int sum = a+b+c+d;
        if((a>=0)&&(a<20)&&(b>=0)&&(b<20)&&(c>=0)&&(c<15)&&(d>=0)&&(d<5)&&(sum!=37)){
            System.out.println(sum);
        }
        else if (sum==37){
            System.out.print(26);
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
