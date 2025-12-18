package Basics;

public class CharDataTypes {
    public static void main(String[] args) {
        // typecasting - ek data type se dusre data type conversion
        char ch = 'A';
        int x = ch;  // implicit typecasting
        System.out.println(x);

        char vivek = 'a';
        int v = (int)vivek;  // explicit typecasting
        System.out.println(v);

        char n = '1';
        System.out.println((int)n);

        char a = 'A';
        System.out.println(a+0);  // 2nd method

        //integer to character
        int x1 = 43;
        char ch1 = (char) x1;
        System.out.println(ch1);
    }
}
