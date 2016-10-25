package Coolledge;

import java.util.Scanner;

/**
 * Created by Жека on 13.09.2016.
 */
public class Pass {
    private static String[] users = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    private static int[] passwords ={1200, 250, 2000, 500, 3200};






    public static int[] Pass(int[] passwords,String[] users) {
        int i;
        int t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Login");
        String login =scanner.nextLine();
        System.out.println(" vvedite parol");
        int p = scanner.nextInt();
        int k = 0;

        for (k=0;k<passwords.length;k++) {
            t=passwords[k];
            if (users[k].equals(login)) {

                for (i = 0; i < 3; i++) {
                    if (p==t){

                        System.out.println("Welcome user");
                    } else {
                        System.out.println("Failed, please input pass again");
                        int r = i + 1;
                        p = scanner.nextInt();
                        if (r == 3) {
                            System.out.println("ALARM!!!!! NESANKCIANOVANUI VXOD, EXIT IN PROGRAMM");

                        }

                    }


                }
            }else {
                int c=k+1;
                System.out.println("failed please enter login again");
                login=scanner.nextLine();
                if (c==3){
                    System.out.println("ALARM!!!!! NESANKCIANOVANUI VXOD, EXIT IN PROGRAMM");

                }


            }
        }
        return passwords;
    }



    public static void main(String[] args) {

      Pass(passwords,users);


    }
}