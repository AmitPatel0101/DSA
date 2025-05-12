import java.util.*;

class Main{
    public static void main(String[] args) {
        List<Integer> Leaders = new ArrayList<>();
        int[] arr = {5,6,2,8,2,6};
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] > max){
                Leaders.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(Leaders);
        System.out.println(Leaders);
    }
}