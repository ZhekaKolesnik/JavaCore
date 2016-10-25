package Coolledge;

import Courses.Module1.EnterKode.User;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Жека on 25.09.2016.
 */
public class Users {


    public static void main(String[] args) {
         int[] PasswordsUsers = {1200, 250, 2000, 500, 3200};
         String[] usersLogin = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please yours login");
        String login ="Jan";
        int password;
        boolean prob;

     for (int i = 0;i<5;i++){

         if (login==usersLogin[i]) {
             prob = true;
         }else {
             prob=false;
         }
     }
        if (prob=true){
            System.out.println("welcome");
        }
        if (prob= false){
            System.out.println("no");
        }
    }






}