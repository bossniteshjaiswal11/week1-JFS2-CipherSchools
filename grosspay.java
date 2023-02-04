import java.util.Scanner;
public class grosspay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter BasicPay");
        double basicpay= sc.nextInt();
        double hra=0, da=0;
        if (basicpay >=5000) {
            hra = 0.1 * basicpay;
            da = 0.2 * basicpay;
        }
        else {
            hra = 0.2 * basicpay;
            da = 0.3 * basicpay;
        }
        System.out.println("HRA = "+hra+" "+ "DA = "+da);
        System.out.println(basicpay+hra+da);
    }
}
