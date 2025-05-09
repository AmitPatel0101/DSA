class CamelCase {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        printArray(numbers);
        addTwoValues(10, 20);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void addTwoValues(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
