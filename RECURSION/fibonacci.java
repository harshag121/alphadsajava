public class fibonacci{
    public static long recursiveFibonacci(int n){
        if(n<2) return 1;
        if(n==0 || n==1){
            return 1;
        }return (long)recursiveFibonacci(n-1) + (long)recursiveFibonacci(n-2);
    }
    public static void main(String[] args) {
        long ans = recursiveFibonacci(30);
        long ans2 = recursiveFibonacci(45);
        System.out.println("FOR 30"+ans);
        System.out.println("FOR 45"+ans2);
    }
}