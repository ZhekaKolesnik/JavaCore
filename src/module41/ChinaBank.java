package module41;

/**
 * Created by Жека on 20.10.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int  w=0;
        if(this.getCurrency()==Currency.USD){
            w=100;

        }
        if(this.getCurrency()==Currency.EUR){
            w=150;
        }
        return w;
    }

    @Override
    int getLimitOfFunding() {
        int f = 0;
        if (getCurrency()==Currency.USD)f=10000;
        if(getCurrency()==Currency.EUR)f=5000;
        return f;
    }

    @Override
    int getMonthlyRate() {
        int r=0;
        if (getCurrency()==Currency.USD)r=10;
        if (getCurrency()==Currency.EUR)r=0;

        return r;

    }

    @Override
    int getCommission(int summ) {
        int commision=0;
        if(this.getCurrency()==Currency.USD){
            if(summ<=1000)commision=30;
            else commision=50;
        }
        if(this.getCurrency()==Currency.EUR){
            if(summ<=1000)commision=100;
            else commision=110;
        }
        return commision;
    }


    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
