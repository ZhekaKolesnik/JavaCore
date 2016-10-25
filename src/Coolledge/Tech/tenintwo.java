package Coolledge.Tech;

import java.util.Scanner;

/**
 * Created by Жека on 14.09.2016.
 */
public class tenintwo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число которое нужно перевести в двуичную систему");
        int b1 = scanner.nextInt();
        String i = Integer.toString(b1, 2);


        System.out.println(Integer.parseInt(i, 2));
    }
}

