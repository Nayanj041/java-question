import java.util.Scanner;

public class q4 {
     public static void checkeven(int n){
    if(n%2==0){
      System.out.print("even");
    } else {
      System.out.print("not even");
    }
    System.out.println();
    return;
  }
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    checkeven(n);
  }
}
