public class SOD{
    public static int sumOfDigits(int n,int sum){
        if(n==0) return sum;
        return (sumOfDigits(n/10, sum + n%10));

    }
    public static void main(String[] args) {

        int ans = sumOfDigits(143, 0);
        System.out.println("sum is:"+ans);
    }
}
        

    