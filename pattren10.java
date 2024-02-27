public class pattren10 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 5;
        
        for(int i = 1; i <= n; i++){
          for(int j = 1; j <= i; j++){
            System.out.print("*");
          }
          int sun = 2*(n-i);
          
          for(int j = 1; j <= sun; j++){
            System.out.print(" ");
          }
          for(int j = 1; j <= i; j++){
            System.out.print("*");
          }
          System.out.println();
        }
         for(int i = n; i >= 1; i--){
          for(int j = 1; j <= i; j++){
            System.out.print("*");
          }
          int sun = 2*(n-i);
          
          for(int j = 1; j <= sun; j++){
            System.out.print(" ");
          }
          for(int j = 1; j <= i; j++){
            System.out.print("*");
          }
          System.out.println();
        }
      }
}
