import java.util.Scanner;

public class atminterface
{

    private static double balance=1000;
    private static void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount:");
        double amount= sc.nextDouble();
        if(amount>0)
        {
            balance+=amount;
            System.out.println("doposited successfully your balance is:"+balance);
        }
        else {
            System.out.println("invalid amount please enter a valid amount");
        }

    }
    private static void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount:");
        double amount= sc.nextDouble();
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("doposited successfully your balance is:"+balance);
        }
        else {
            System.out.println("invalid amount please enter a valid amount");
        }

    }
    private static void checkbalance()
    {
        System.out.println("your available balance is :"+balance);

    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.doposit");
            System.out.println("2.withdraw");
            System.out.println("3.checking");
            System.out.println("4.exit");
            System.out.println("enter  your choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkbalance();
                    break;
                case 4:
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("invalid entry");
            }
        }while (choice!=4);


    }
}