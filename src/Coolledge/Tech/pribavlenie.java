package Coolledge.Tech;

import java.util.Scanner;

/**
 * Created by Жека on 14.09.2016.
 */
public class pribavlenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Please first number");
        int number1=scanner.nextInt();
        System.out.println("Input Please second number");
        int number2=scanner.nextInt();
        int sum=number1+number2;
        int sym2=number2+number1;
        String i = Integer.toString(sym2, 2);
        System.out.println("в двоичной системе сумма = "+i);
    }

}
