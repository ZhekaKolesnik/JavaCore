package module41;

/**
 * Created by Жека on 20.10.2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
      int  w=0;
        if(this.getCurrency()==Currency.USD){
            w=1000;

        }
        if(this.getCurrency()==Currency.EUR){
            w=1200;
        }
        return w;
    }

    @Override
    int getLimitOfFunding() {
        int f = 0;
        if (getCurrency()==Currency.USD)f=1000000;
        if(getCurrency()==Currency.EUR)f=10000;
        return f;
    }

    @Override
    int getMonthlyRate() {
int r=0;
        if (getCurrency()==Currency.USD)r=10;
        if (getCurrency()==Currency.EUR)r=15;

        return r;

    }

    @Override
    int getCommission(int summ) {
        int commision=0;
        if(this.getCurrency()==Currency.USD){
            if(summ<=1000)commision=50;
            else commision=70;
        }
        if(this.getCurrency()==Currency.EUR){
            if(summ<=1000)commision=60;
            else commision=80;
        }
        return commision;
    }


    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
