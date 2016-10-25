package module41;

/**
 * Created by Жека on 20.10.2016.
 */
public interface BankSystem  {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
