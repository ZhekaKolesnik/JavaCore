package Courses.Module1.Module2.Homework;

/**
 * Created by Жека on 31.08.2016.
 */
public class Homework22 {
    static double  bank(double balance, double withdraw,double commision){
        double res=commision*withdraw+withdraw;
        if (res<balance) {

            balance = balance - res;
            commision = commision * withdraw;
            System.out.println("Ok "+ commision+" "+balance);
        }else {
            System.out.println("NO");

        }
        return 0;
    }
   public static void main(String[] args) {
       double balance = 100;
       double withdraw=10;
       double commision=0.05;
       double res=commision*withdraw+withdraw;

       double bank=bank(balance,withdraw,commision);



   }
}
