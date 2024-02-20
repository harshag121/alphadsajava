public class RMQ {
    public static void naiveRMQ(int[] arr, int i, int j) {
        int min = Integer.MAX_VALUE;
        for (int start = i; start <= j; start++) {
            if (arr[start] < min) {
                min = arr[start];
            }
        }
        System.out.println("The min element in the given range is: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {23, 1, 45, 6, 78, 89, 45, 3, 1, 2, 9,0};
        naiveRMQ(arr, 2, 6);
        naiveRMQ(arr, 6, 10);
        naiveRMQ(arr,0, 11);
    }
}
