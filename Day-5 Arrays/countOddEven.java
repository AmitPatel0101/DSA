class countOddEven{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        int n= arr.length;
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if (arr[i]%2==0){
                even=even+1;
            }else{
                odd=odd+1;
            }
        }
        System.out.println("Even Count is " +even+" Odd Count is "+odd);
    }
}