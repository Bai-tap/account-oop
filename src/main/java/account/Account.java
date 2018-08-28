package account;

import java.util.Date;

public class Account {
    //    Fields
    private int id = 0;
    private double blance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //    Constructor
    public Account() {
    }

    public Account(int id, double blance) {
        this.id = id;
        this.blance = blance;
    }


    //    Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

//    Methods
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return blance + (blance * getMonthlyInterestRate());
    }

    public double withdraw(double number) {
        return blance - number;
    }

    public double deposit(double number) {
        return blance + number;
    }

    public double displayAccount(Account account) {
        return blance;
    }
}
