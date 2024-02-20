public class towerOfhanoi {
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // You can change the number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
