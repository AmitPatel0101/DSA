import java.util.Scanner;

class zShapeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        System.out.println("Z-shape:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                // Top row
                if(i == 0) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                // Diagonal
                else if(i + j == arr.length - 1) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                // Bottom row
                else if(i == arr.length - 1) {
                    sum += arr[i][j];
                    System.out.print(arr[i][j] + " ");
                }
                else {
                    // Print space for alignment
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Sum of Z-shape elements: " + sum);
    }
}
