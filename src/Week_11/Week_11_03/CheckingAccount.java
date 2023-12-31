package Week_11.Week_11_03;


import Week_09.Week_09_07.Account;
public class CheckingAccount extends Account {
    private double overDraftLimit;
    public CheckingAccount(){
        this.overDraftLimit = -500;
    }
    public CheckingAccount(int id, double balance, double overDraftLimit){
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }
    public void withdraw(double amount){
        if (getBalance() - amount >= overDraftLimit){
            setBalance(getBalance() - amount);
        }
    }
    public double getOverDraftLimit(){
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
    public String toString(){
        return  "ID: " + getId() +
                "\nBalance: $" + getBalance() +
                "\nLimit: $" + overDraftLimit;
    }
}
