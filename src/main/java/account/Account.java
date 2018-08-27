package account;

public class Account {
    //    Fields
    private int id = 0;
    private double blance = 0;
    private double annualInterestRate = 0;
    private double dateCreated = 0;

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

    public double getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(double dateCreated) {
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
}
