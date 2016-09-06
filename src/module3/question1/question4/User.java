package module3.question1.question4;

/**
 * Created by Жека on 06.09.2016.
 */
public class User {

        private String name;
        private int balance;
        private int monthsOfEmployment;
        private String companyName;
        private int salary;
        private String currency;


        public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
            this.name = name;
            this.balance = balance;
            this.monthsOfEmployment = monthsOfEmployment;
            this.companyName = companyName;
            this.salary = salary;
            this.currency = currency;
        }

        public void paySalary() {
            this.balance += salary;
        }

        public int withdraw(int summ) {
            int withdraw;
            if (summ < 1000) withdraw = summ * 5 / 100;
            else withdraw = summ * 10 / 100;
            return balance - (withdraw + summ);
        }

        public int companyNameLength() {
            return companyName.length();
        }

        public int monthIncreaser(int addMonth) {
            return addMonth + monthsOfEmployment;
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

        public int getMonthsOfEmployment() {
            return monthsOfEmployment;
        }

        public void setMonthsOfEmployment(int monthsOfEmployment) {
            this.monthsOfEmployment = monthsOfEmployment;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }



        public static void main(String[] args) {
            User employee = new User("Zheka", 2000, 7, "Samsung", 1100, "UAN");

            System.out.println(employee.withdraw(367));
            System.out.println(employee.companyNameLength());
            System.out.println(employee.monthIncreaser(6));
        }
    }
