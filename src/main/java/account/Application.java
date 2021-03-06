package account;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
        int choice = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        do {
            System.out.println("Main Menu: ");
            System.out.println("1: Check balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Exit");
            System.out.println("Enter the choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double balance = accounts[id].getBlance();
                    System.out.println("The balance is " + balance);
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    accounts[id].withdraw(withdraw);
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    accounts[id].deposit(deposit);
                    break;
            }
        } while (choice != 4);

    }
}
