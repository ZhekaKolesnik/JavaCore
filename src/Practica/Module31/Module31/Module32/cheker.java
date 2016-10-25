package Practica.Module31.Module31.Module32;

import java.util.Scanner;

/**
 * Created by Жека on 21.09.2016.
 */
public class cheker {
    public static void main(String[] args) {
        Adder rer=new Adder();
        Scanner scanner=new Scanner(System.in);
        System.out.println("vvedite a i b");
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(rer.checc(a,b));
        System.out.println(rer.addd(a,b));

    }

}
