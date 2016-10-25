package Coolledge.Tech;

import java.util.Scanner;

/**
 * Created by Жека on 13.09.2016.
 */
public class Binary {
    public static void binar(int Numbers){
        int i ;
        String binarNumber= "";
        while(Numbers!=0){
            i=Numbers%2;
            binarNumber+=i;
            Numbers/=2;


        }

        System.out.println(binarNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number= scanner.nextInt();
     binar(number);
    }
}
