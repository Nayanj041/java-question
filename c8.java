import java.util.Scanner;

public class c8 {
    public static void main(String[] args) {
//System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if(x % 2 == 0){
      System.out.println("even");
    } else {
      System.out.println("odd");
    }
  }
}
