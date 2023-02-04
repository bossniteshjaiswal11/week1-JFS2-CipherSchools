import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number !");
        int num= sc.nextInt();
        if (num>0)
            System.out.println("+ve");
        else if (num==0)
            System.out.println("Neutral");
        else
            System.out.println("-ve");
    }
}
