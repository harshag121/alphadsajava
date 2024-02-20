public class ReverseArray {
    public static void reverseArray(int[] a, int start, int end) {
        if (start < end) {
            int temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
            reverseArray(a, start, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;

        System.out.println("ARRAY BEFORE REVERSING");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverseArray(arr, start, end);

        System.out.println("\nARRAY AFTER REVERSING");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
