package Week_11.Week_11_08;

import java.util.Date;

public class Transaction {
    private Date date = new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString(){
        return "\n\nDate: " + date.toString() +
                "\nTransactions type: " + (getType() == 'W' ? "Withdraw" : "Deposit") +
                "\nAmount: " + amount +
                "\nBalance: " + balance +
                "\nDescription: " + (getType() == 'W' ? "Withdraw from ATM" : "Deposit to Bank");
    }


}