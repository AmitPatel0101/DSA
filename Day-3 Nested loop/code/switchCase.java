
import java.util.Scanner;

public class switchCase{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        int userPin;
        do { 
            System.out.println("\n1 check balance");
            System.out.println("2. Withdraw Money");
            System.out.println("Deposit Money");
            System.out.println("Exit");
            System.out.println("Choose an option: ");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> System.out.println("Balance : $5000");
                case 2 -> System.out.println("withdrowal succesfully");
                case 3 -> System.out.println("Deposit successfully");
                case 4 -> System.out.println("Exiting..");
                case 5 -> System.out.println("Invalid option. try again.");
            }
        } while (choice !=4);
    }
}