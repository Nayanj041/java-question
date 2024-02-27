public class pattern1 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        // to print * in 4x5 pattern
        // for(int i = 0; i < 4; i++){
        //   System.out.println("*****");
        // }
    
        //to print * in 4x100 pattern
        for(int j = 1; j <= 4; j++){
          for(int i = 1; i <= 100; i++){
            System.out.print("*");
          }
          System.out.println("*");
        }
      }
}
