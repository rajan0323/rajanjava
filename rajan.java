import java.util.Scanner;

public class rajan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        for (c = 2; c <=n; c++) {
            int d = b;
            b = b + a;
            a = d;
            
        }
        System.out.println(b);
    }
}
