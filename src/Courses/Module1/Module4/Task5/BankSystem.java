package Courses.Module1.Module4.Task5;

import Courses.Module1.Module4.Task4.User;

/**
 * Created by Жека on 12.09.2016.
 */

    public interface BankSystem {
        void withdrawOfUser(User user, int amount);
        void fundUser(User user, int amount);
        void transferMoney(User fromUser, User toUser, int amount);
        void paySalary(User user);
    }

