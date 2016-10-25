package module41;

/**
 * Created by Жека on 20.10.2016.
 */
public class BankSystemImpl implements BankSystem{
    @Override
    public void withdrawOfUser(User user, int amount) {
        double commision=amount/ 1000 * user.getBank().getCommission(amount);
        if(user.getBank().getLimitOfWithdrawal()>=amount && (user.getBalance()+user.getBank().getCommission(amount))>=amount){
            user.setBalance(user.getBalance()-(commision+amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        double commision=amount/ 1000 * user.getBank().getCommission(amount);
        if(user.getBank().getLimitOfFunding()>=amount){
            user.setBalance(user.getBalance()+amount-commision);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double commision=amount/ 1000 * fromUser.getBank().getCommission(amount);
        if(fromUser.getBalance()+commision>=amount) {
            fromUser.setBalance(fromUser.getBalance() - amount-commision);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        int getFromMonth=user.getMonthsOfEmployment()-user.getMonthsOfEmployment();
        double money=getFromMonth*user.getSalary();
        user.setMonthsOfEmployment(user.getMonthsOfEmployment()+getFromMonth);
        double commision=money/ 1000 * user.getBank().getCommission((int) money);
        user.setBalance(user.getBalance()+money-commision);
    }
}
