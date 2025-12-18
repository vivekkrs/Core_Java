package If_Else;

import java.util.Scanner;

public class ElseIfMultCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        if(a%5 == 0 && a%3 == 0){
            System.out.println("Vivek");
        }else if(a%3==0){
            System.out.println("Rohit");
        }else if (a%5==0){
            System.out.println("Anil");
        }else {
            System.out.println("Riya");
        }
    }
}
