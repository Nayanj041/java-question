import java.util.Scanner;

public class q10 {
     public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int numbers[][] = new int[rows][cols];
    for(int i = 0; i<rows; i++){
      for(int j = 0; j<cols; j++){
        numbers[i][j] = sc.nextInt();
      }
    }
    int x = sc.nextInt();
    for(int i = 0; i<rows; i++){
      for(int j = 0; j<cols; j++){
        if(numbers[i][j] == x){
          System.out.print("x is found at:("+i+","+j+")");
        }
      }
      System.out.println();
    }
  }
}
