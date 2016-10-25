package Coolledge.Tech;

import jdk.nashorn.internal.runtime.Source;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by Жека on 03.10.2016.
 */
public class sumneparn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number diapazone");
        int a1 = scanner.nextInt();
        System.out.println("input second number diapazone");
        int a2 = scanner.nextInt();
        int k=0;
        int sum=0;
        int i=0;
        for ( i = a1; i <=a2; i++) {
            if (i %2==0) {
                sum=sum+i;

            }





        }

        System.out.println(sum+k);

    }

}

