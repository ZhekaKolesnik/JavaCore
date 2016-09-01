package Module2.Homework;

/**
 * Created by Жека on 31.08.2016.
 */
public class Homework24 {
    private static String nameOwn = "Oww";
    private static double withdrawal = 100;
    private static int[] balances ={1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double withdrawBalance(int[] balances, String[] ownerNames) {
        double balance = 0;
        for (int i  = 0; i < balances.length; i++){
            if (ownerNames[i].equals(nameOwn)) {
                balance = balances[i] + withdrawal;
                System.out.println(ownerNames[i] + " " + balance);
            }
        }

        return balance;

    }


    public static void main(String[] args) {

        withdrawBalance(balances,ownerNames);
    }

}

