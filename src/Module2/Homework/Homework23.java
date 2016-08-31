package Module2.Homework;

/**
 * Created by Жека on 31.08.2016.
 */
  public class Homework23 {
    static double withdrowAcount (double balances, double withdrawal, double commisions, String ownerName) {

        double res = commisions * withdrawal + withdrawal;
        if (res < balances) {

            double arr = balances - res;
            System.out.println(ownerName +" " +withdrawal + " " + arr);
        } else {
            System.out.println("NO");

        }
       return 0;
    }

    public static void main(String[] args) {
        double commisions=0.05;
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double r=1200;
        String ownerName = "Jane";
        double withdrawal = 100;
        double result=withdrowAcount(r, withdrawal,commisions,ownerName);

    }
}