//#using recursion
public class Main {
    public static void printFibonacci(int n, int a, int b) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibonacci(n - 1, b, a + b);  
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.print("Fibonacci Series: ");
        printFibonacci(n, 0, 1); 
    }
}



