import java.util.Scanner;

public class ArmstrongCheck {

    // Method to calculate digit^power manually
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    // Method to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();  // ✅ Fixed here

        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
