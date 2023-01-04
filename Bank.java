import java.util.Scanner;

public class Bank
{
    public static void main(String[]  args)
    {
        int num;
        System.out.println("Enter your PIN ....");
        Scanner obj = new Scanner(System.in);
        num=obj.nextInt();

      if(num==7518)
      {
          System.out.println("Welcome to Kotak Bank");
                long nebal = 0;
                System.out.println("A) Check the balance");
                System.out.println("B) Deposit");
                System.out.println("C) Withdraw");
                System.out.println("D) Exit");

                Scanner scan = new Scanner(System.in);

                while (true) {
                    System.out.println("Enter the Option....:");
                    String choice = scan.next();
                    if (choice.equalsIgnoreCase("A")) {
                        System.out.println();
                        System.out.println("balance =" + nebal + "$");
                        System.out.println();
                    } else if (choice.equalsIgnoreCase("B")) {
                        System.out.println("Enter the amount");
                        int n = scan.nextInt();
                        if (n <= 0) {
                            System.out.println("Alert: Enter the valid amount ");
                        } else {
                            nebal = nebal + n;
                            System.out.println("Congratulation : Your amount successfully deposited");
                        }
                    } else if (choice.equalsIgnoreCase("C")) {
                        System.out.println("Enter the amount");
                        int w = scan.nextInt();
                        if (nebal <= w) {
                            System.out.println("Alert: Enter the valid amount");
                        } else {
                            nebal = nebal - w;
                            System.out.println("Congratulation: Your amount Successfully withdraw ");
                        }
                    } else if (choice.equalsIgnoreCase("D")) {
                        System.out.println("..................Thank You Using Our Service....................");
                        System.out.println();
                        break;
                    }


                }
      }
      else
      {
          System.out.println(" Alert: Please enter the valid PIN.....");
      }

    }
}

