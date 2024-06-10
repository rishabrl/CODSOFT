import java.util.Scanner;

public class ATM_Interface {
    
    public static void main(String args[]) 
    { 
        int balance = 10000; 
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        int withdrawAmount = sc3.nextInt();
        Scanner sc4=new Scanner(System.in); 
        System.out.println("Enter amount to deposit:");
        int depositAmount = sc4.nextInt(); 
  
        checkBalance(balance);  
        balance = Withdraw(balance, withdrawAmount);  
        balance = Deposit(balance, depositAmount); 
    } 
    
    public static void checkBalance(int balance) 
    { 
        System.out.println("Current Balance : " + balance); 
        System.out.println(); 
    } 

    public static int Withdraw(int balance,int withdrawAmount) 
    { 
        System.out.println("Withdrawal"); 
        System.out.println("Withdrawing Amount : "+ withdrawAmount); 
        if (balance >= withdrawAmount && withdrawAmount>0) { 
            balance = balance - withdrawAmount; 
            System.out.println( "collect your money and get the card"); 
            checkBalance(balance); 
        } 
        else { 
            System.out.println("Insufficient Funds"); 
            System.out.println(); 
        } 
        return balance; 
    } 

     public static int Deposit(int balance,int depositAmount) 
    { 
        System.out.println("Deposit"); 
        System.out.println("Depositing Amount : "+ depositAmount); 
        balance = balance + depositAmount; 
        System.out.println( "Money has been successfully deposited"); 
        checkBalance(balance); 
        return balance; 
    } 

}
