import java.util.Scanner;
public class burp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How Long is Ypor Brup ?");
        int brupLength =sc.nextInt();
        String msg="";
        for(int i=1 ;i <= brupLength ; i++) {
            msg=msg+"r";
        }
        System.out.println("Bu"+msg+"p");
    }
}
