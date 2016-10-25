package Coolledge;

import java.util.Scanner;

/**
 * Created by Жека on 10.10.2016.
 */
public class number0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int  sum=0;
        int klkst=0;
        double serarifmetic=0;
         while (true){

         int number=scanner.nextInt();
             if (number==0){
                 break;
             }
         klkst=klkst+1;
         sum=sum+number;




         }
        serarifmetic=sum/klkst;
        System.out.println("arithmetic mean= "+serarifmetic);
    }
}
