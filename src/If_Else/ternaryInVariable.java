package If_Else;

import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

//        int viv;
//        if(n>=0) viv = 100;
//        else viv = 0;
//        System.out.println(viv);

        int viv = (n>=0) ? 100 : 0;
        System.out.println(viv);
    }
}
