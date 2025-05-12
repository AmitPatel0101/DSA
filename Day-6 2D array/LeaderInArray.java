import java.util.*;

class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2}; 
        List<Integer> result = findLeaders(arr);
        System.out.println("Leaders: " + result);
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(leaders); 
        return leaders;
    }
}
