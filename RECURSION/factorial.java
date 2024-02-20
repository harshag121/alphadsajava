public class factorial{
    public static long  recursiveFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }return (long)n*recursiveFactorial(n-1);
    }
    public static void main(String[] args) {
        long ans = recursiveFactorial(5);
        long ans2 = recursiveFactorial(1);
        System.out.println("Factorial for n is"+ans);
        System.out.println("Factorial for n is"+ans2);
    }
}