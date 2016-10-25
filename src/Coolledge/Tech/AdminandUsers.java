package Coolledge.Tech;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Жека on 25.09.2016.
 */
public class AdminandUsers {
    public static void main(String[] args) {
        String adminlogin = "admin";
        int adminpass = 5555;
        int[] UsersPasswords = {123, 321, 1111, 888};
        String[] UserLogin = {"zheka", "Nika", "Jack", "Lenon"};
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int y = 0;
        String c = "";
        int passwords;


        System.out.println("Input your login  please");
        for (i = 0; i < UserLogin.length; i++) {
            String k = scanner.nextLine();
            //
            if (k.equals(adminlogin)) {
                System.out.println("Please input yours password admin");
                for (int t = 0; t < 3; t++) {
                    passwords = scanner.nextInt();
                    if (passwords == adminpass) {
                        System.out.println("Welcome ADMIN");
                        System.out.println(Arrays.asList(UserLogin));
                    } else {
                        if (t == 2) {

                            System.out.println("ERROR. System off");
                            break;

                        }
                        System.out.println("Admin, pleae input your login again");
                    }
                }

            } else {
                for (j = 0; j < UserLogin.length; j++) {
                    if (UserLogin[j].equals(k)) {
                        y = j;
                        k = UserLogin[i];
                        c = UserLogin[j];
                    }
                }
//
                if (k == UserLogin[i]) {
                    System.out.println("Input Please your password");

                    for (int p = 0; p < UsersPasswords.length; p++) {
                        passwords = scanner.nextInt();

                        if (passwords == UsersPasswords[y]) {
                            System.out.println("Welcome " + c);


                        } else {
                            if (p == 2) {
                                System.out.println("ERROR. System off");
                              continue;


                            }

                            System.out.println("Invalid Password, please input again");
                        }
                    }

                } else {

                    if (i == 2) {
                        System.out.println("ERROR. System off");

                        break;
                    }

                    System.out.println("Invalid Login, please input again");
                }
            }
        }
    }

}






