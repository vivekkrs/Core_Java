//Ques: Display this AP - 2,5,8,11.... upto 'n' terms

package Loop;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=2; i<=3*n-1; i+=3){ // formula base  an=a+(n-1)d
//            System.out.print(i+" ");
//        }
        int a = 2, d = 3;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
