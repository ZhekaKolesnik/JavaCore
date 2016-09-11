package module4.task1.Task5;

import module4.task1.Task4.User;

/**
 * Created by Жека on 12.09.2016.
 */

    public interface BankSystem {
        void withdrawOfUser(User user, int amount);
        void fundUser(User user, int amount);
        void transferMoney(User fromUser, User toUser, int amount);
        void paySalary(User user);
    }
}
