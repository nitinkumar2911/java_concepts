class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 9, 12, 25, 30};
        int target = 2;

        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}