import  java.util.*;
class numberSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=0;
        // int digit;
        // while(n!=0){
        //     digit=n%10;
        //     sum = sum + digit;
        //     n=n/10;
        // }
        // System.out.println(sum);
        while(n>9){
            int sum=0;
            int digit;
            while(n!=0){
                digit=n%10;
                sum = sum + digit;
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}