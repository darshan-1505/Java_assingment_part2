// 21CE019 Darshan Chavda
// (2) Design a class named Account that contains:
// • A private int data field named id for the account (default 0).
// • A private double data field named balance for the account (default 500₹).
// • A private double data field named annualInterestRate that stores the current
// interest rate (default 7%). Assume all accounts have the same interest rate.
// • A private Date data field named dateCreated that stores the date when the
// account was created.
// • A no-arg constructor that creates a default account.
// • A constructor that creates an account with the specified id and initial balance.
// • The accessor and mutator methods for id, balance, and annualInterestRate.
// • The accessor method for dateCreated.
// • A method named getMonthlyInterestRate() that returns the monthly interest rate.
// • A method named getMonthlyInterest() that returns the monthly interest.
// • A method named withdraw that withdraws a specified amount from the account.
// • A method named deposit that deposits a specified amount to the account.
import java.util.*;
public class pro2 
{
    Scanner sc = new Scanner(System.in);
    int id = 0;
    double balance;double air = 7;double MI;
    float MIR;
    String date;
    pro2()
    {}
    pro2(int id, double balance) 
    {
        this.id = id;
        this.balance = balance;}

    void accessor()
    {
        System.out.println("Enter date:");
        String date = sc.nextLine();
        System.out.println("The date when account was created :" + date);
    }
   
    float getMIR() 
    {
        System.out.println("Enter monthly interest rate:");
        float MIR = sc.nextFloat();
        System.out.println("Intrest rate:"+MIR);
       return MIR;
    }

    double getMI() 
    {
        float MIR =getMIR();
        double MI = (balance * MIR) / 100;
        System.out.println("Intrest per month:" + MI);
     return MI;
    }

    void withdraw() 
    {
        double MI = getMI();
        double amount = balance + MI;
        System.out.println("The final amount is :"+amount);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter id and balance:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        double balance = sc.nextDouble();
        System.out.println("ID and Balance :" + id  + " " + balance);
        pro2 b = new pro2(id, balance);
        b.accessor();
        b.withdraw();
    }

}