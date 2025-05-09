import java.util.*;
class question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=sc.nextInt();

        if(val<=n || val%n == 1 || val%n == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No  ");
        }
    }
}