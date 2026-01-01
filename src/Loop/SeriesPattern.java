// Take 'n' as input from user and print the following sequence.. [1 n 2 n-1 3 n-1 ...]

package Loop;
import java.util.Scanner;

public class SeriesPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1;
        int b = n;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            System.out.println(b);
            a++;
            b--;
        }
    }
}
