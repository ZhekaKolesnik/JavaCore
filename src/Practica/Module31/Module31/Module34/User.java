package Practica.Module31.Module31.Module34;

import Coolledge.Pass;

/**
 * Created by Жека on 18.10.2016.
 */
public class User {
    protected String name;
    protected int balance;
    protected int monthsOfEnployment;
    protected String companyNmae;
    protected int salary;
    protected String currencu;

    public User(String name, int balance, int monthsOfEnployment, String companyNmae, int salary, String currencu) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEnployment = monthsOfEnployment;
        this.companyNmae = companyNmae;
        this.salary = salary;
        this.currencu = currencu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEnployment() {
        return monthsOfEnployment;
    }

    public void setMonthsOfEnployment(int monthsOfEnployment) {
        this.monthsOfEnployment = monthsOfEnployment;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public void setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrencu() {
        return currencu;
    }

    public void setCurrencu(String currencu) {
        this.currencu = currencu;
    }


    public void  paySalary(){
        balance+=salary;
    }
    public double withdrawal(int summ){
      if (summ<1000){
          int k= (int) (summ*0.05);
          summ=balance-summ-k;
      }else {
          int w= (int) (summ*0.1);
          summ=balance-summ-w;
      }
        return summ;
    }
    public void monthIncreaser(int addMonth){
        this.monthsOfEnployment+=addMonth;
    }
}

