public class pattren11 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 5;
        
        for(int i = 1; i <= n; i++){
          for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
          }
          int k = 2*(i-1);
          for(int j = 2; j <= k; j++){
            System.out.print("*");
          }
          System.out.println();
        }
        for(int i = n; i >= 1; i--){
          for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
          }
          int k = 2*(i-1);
          for(int j = 1; j <= k; j++){
            System.out.print("*");
          }
          System.out.println();
        }
      }
}
