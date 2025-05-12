import java.util.*;
class maxProfit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max_profit = 0;
        int min = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }else{
                int profit = arr[i] - min;
                if(profit > max_profit){
                    max_profit = profit;
                }
            }
        }
        System.out.println(max_profit);
    }
}