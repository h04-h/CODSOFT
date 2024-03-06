public class account {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public account(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(amount<balance) {
            balance -= amount;
        }
        else{
            System.out.println("Sorry can't withdraw this amount");
        }
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void checkBalance(){
        System.out.println("Your balance is: "+getBalance());
    }
}

