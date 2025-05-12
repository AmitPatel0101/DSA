import java.util.*;
class MissingElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the size of array:- ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]+1 != arr[i+1]){
                int res = arr[i] + 1;
                System.out.print("Missing Element is:- ");
                System.out.println(res);
            }
        }
    }
}