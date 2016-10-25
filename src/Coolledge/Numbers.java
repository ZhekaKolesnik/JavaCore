package Coolledge;

import java.util.Scanner;

/**
 * Created by Жека on 27.09.2016.
 */
public class Numbers {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть чотирохзначне число");
        int fourthnumber= scanner.nextInt();
        int a4=fourthnumber/1000;
        int test=fourthnumber%1000;
        int a3=test/100;
        int test1=test%100;
        int a2=test1/10;
        int test2=test1%10;
        int a1=test2/1;
        System.out.println("ваше число наооборот");
        System.out.println(a1+""+a2+""+a3+""+a4);



    }
}
