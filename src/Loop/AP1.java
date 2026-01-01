// print this series - 99,95,91,87,.. upto all terms which are positive

package Loop;

import java.util.Scanner;

public class AP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 99, d = -4;

//        while (a > 0) {
//            System.out.print(a + " ");
//            a += d;
//        }

        for (int i = 1; i<=n && a>0; i++) {
            System.out.print(a + " ");
            a += d;
        }

    }
}
