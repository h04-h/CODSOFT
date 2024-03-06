import java.util.*;
public class bank {

    public static void main(String[] args){

        account account1 = new account(1000);
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to bank X!");
        int choice;
        do {
            System.out.println("\n What would you like to do(choose from the numbers below):");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("0.Exit");
            choice = scan.nextInt();
            if(choice ==0)
                break;
            else if(choice ==1){
                System.out.println("Enter the amount to withdraw:");
                double amount = scan.nextDouble();
                account1.withdraw(amount);
                System.out.println("Your new balance is: "+ account1.getBalance());
            }
            else if(choice ==2){
                System.out.println("Enter the amount to deposit:");
                double amount = scan.nextDouble();
                account1.deposit(amount);
                System.out.println("Your new balance is: "+ account1.getBalance());
            }
            else if(choice ==3){
                account1.checkBalance();
            }
        }while(choice !=0);
    }
}
