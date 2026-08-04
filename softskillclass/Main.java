class Main{
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,12,25,30};
        int target = 9;
        int l = 0;
        int r = arr.length;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                System.out.println("Element is found at index  " + mid);
                return;
            }if (arr[mid]>target){
                l = mid;
            }if(arr[mid]< target){
                r = mid;
            }
        }
    }
}