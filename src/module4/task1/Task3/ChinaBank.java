package module4.task1.Task3;

import module4.task1.Task1.Bank;
import module4.task1.Task2.Currency;

/**
 * Created by Жека on 12.09.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, Currency currency, int numberOfEmployee, double avrSalaryOfEmploee, long rating, long totalCapital) {
        super(id, currency, numberOfEmployee, avrSalaryOfEmploee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        short limitW=0;
        if(this.getCurrency()==Currency.USD)limitW = 100;
        if(this.getCurrency()==Currency.EUR)limitW = 150;
        return limitW;
    }

    @Override
    int getLimitOfFunding() {
        int limitF=0;
        if(this.getCurrency()==Currency.USD)limitF = 10000;
        if(this.getCurrency()==Currency.EUR)limitF = 5000;
        return limitF;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate=0;
        if(this.getCurrency()==Currency.USD)monthlyRate=10;
        if(this.getCurrency()==Currency.EUR)monthlyRate=0;
        return monthlyRate;
    }

    @Override
    int getCommision(double withdraw) {
        int commision=0;
        if(this.getCurrency()==Currency.USD){
            if(withdraw<=1000)commision=30;
            else commision=50;
        }
        if(this.getCurrency()==Currency.EUR){
            if(withdraw<=1000)commision=100;
            else commision=110;
        }
        return commision;
    }
}