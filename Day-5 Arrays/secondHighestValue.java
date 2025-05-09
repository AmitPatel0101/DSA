class secondHighestValue{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int heightValue = arr[0];
        int secondHeightValue = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > heightValue){
                heightValue = arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] > secondHeightValue && arr[i] != heightValue){
                secondHeightValue = arr[i];
            }
        }
        System.out.println(secondHeightValue);
    }
}