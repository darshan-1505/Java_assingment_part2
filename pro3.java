// 21CE019 Darshan Chavda
// (3) Use the Account class created as above to simulate an ATM machine. 
// Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The 
// system prompts the users to enter an id. If the id is entered incorrectly, ask 
// the user to enter a correct id. Once an id is accepted, display menu with 
// multiple choices. 
// 1. Balance inquiry
// 2. Withdraw money [Maintain minimum balance 300₹]
// 3. Deposit money
// 4. Money Transfer
// 5. Create Account
// 6. Deactivate Account
// 7. Exit 
// Hint: Use ArrayList, which is can shrink and expand with compared to Array.
import java.util.*;

public class pro3 
{
    private int id = 0;
    private int balance[] = { 300, 300, 300, 300, 300, 300, 300, 300, 300, 300 };
    private int withdraw;
    private int deposit;
    private int Transfer;
    private int Transfer_money;

    public pro3() 
    {
        Date d = new Date();
        System.out.println("Date : " + d);
    }
    public pro3(int ID, int BAL) 
    {
        id = ID;
    }
    public int withdrawn(int with) 
    {
        balance[id] -= with;
        return balance[id];
    }
    public int deposit(int dep) 
    {
        balance[id] += dep;
        return balance[id];
    }
    public int Balance(int Id) 
    {
        return balance[id];
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i, p, q, x;
        boolean flag = true;
        ArrayList<pro3> acc = new ArrayList<pro3>();
        for (i = 0; i < 11; i++) 
        {
            acc.add(new pro3(i + 1, 300));
        }
        System.out.print("Enter Account Number : ");
        int id = sc.nextInt();
        acc.add(new pro3(id, 300));
        while (flag) 
        {
            menu();
            int key = sc.nextInt();
            switch (key) 
            {
                case 1:
                    System.out.println("Balance : " + acc.get(id).Balance(id));
                    break;
                case 2:
                    System.out.print("\nEnter Amount : ");
                    p = sc.nextInt();
                    System.out.println("Remaining Balance : " + acc.get(id).withdrawn(p));
                    break;
                case 3:
                    System.out.print("\nEnter Amount : ");
                    p = sc.nextInt();
                    System.out.println("Avilable Balance : " + acc.get(id).deposit(p));
                    break;
                case 4:
                    System.out.print("\nEnter Account number in which account you want to transfer money : ");
                    q = sc.nextInt();
                    System.out.print("Enter Amount : ");
                    p = sc.nextInt();
                    if ((acc.get(id).Balance(id)) >= p) 
                    {
                        System.out.println("Avilable Balance in : " + q + " is " + acc.get(q).deposit(p));
                        System.out.println("Avilable Balance in : " + id + " is " + acc.get(id).withdrawn(p));
                    } 
                    else 
                    {
                        System.out.println( "Not sufficient Balance...\nYou can Deposit Money to complete Your Transfer...(Enter 1 to deposite and 0 for exit");
                        x = sc.nextInt();
                        if (x == 1) 
                        {
                            System.out.print("\nEnter Amount : ");
                            p = sc.nextInt();
                            System.out.println("Avilable Balance : " + acc.get(id).deposit(p));
                        }
                        else 
                        {
                            break;
                        }
                    }
                    break;
                case 5:
                    acc.add(new pro3(i++, 300));
                    System.out.println("\nAccount is created successfully...\nId is " + i + "\nBalance is " + 300);
                    break;
                case 6:
                    acc.remove(id);
                    System.out.println("\nAccount Deleted Successfully.");
                    flag = false;
                    break;
                case 7:
                    System.out.println("Thank you for the visiting our bank");
                    flag = false;
                    break;
                default:
                    break;
            }
            if (key < 7) 
            {
                System.out.print("Enter Account Number : ");
                id = sc.nextInt();
                System.out.println("\nBalance : " + acc.get(id).Balance(id));
            }
        }
    }

    public static void menu() 
    {
        System.out.println();
        System.out.println("1: Balance Inqury");
        System.out.println("2: Withdraw Money");
        System.out.println("3: Deposit Money");
        System.out.println("4: Transfer");
        System.out.println("5: Create Account");
        System.out.println("6: Deactivate Account");
        System.out.println("7: Exit");
        System.out.println("Which process would you like to do Enter the number for following instruction------->");
    }
}
