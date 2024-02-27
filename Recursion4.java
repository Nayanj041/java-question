public class Recursion4 {
    public static int calcfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nu = calcfactorial(n-1);
        int fact_n = n * fact_nu;
        return fact_n;
    }
    public static void main (String args []){
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}
