class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 1;
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag = 1;
            }   
        }
        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}