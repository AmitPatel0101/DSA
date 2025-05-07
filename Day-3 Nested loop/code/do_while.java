
import java.util.Scanner;

public class do_while{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int correctPin =1234;
        int userPin;
        do { 
            System.out.println("Enter our pin:");
            userPin = sc.nextInt();
            if(userPin != correctPin){
                System.out.println("Incorrect Pin, Try Again");
            }
        } while (userPin != correctPin);
        System.out.println("PIN Varifies. Access granted");
    }
}