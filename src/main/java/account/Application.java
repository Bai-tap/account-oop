package account;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        System.out.println(account.withdraw(2500));
        account.deposit(3000);
        System.out.println(account.deposit(3000));
        Date now = new Date();
        account.setDateCreated(now);
        System.out.println(account.getMonthlyInterest());
        System.out.println(account.getDateCreated());
    }
}
