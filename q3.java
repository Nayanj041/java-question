import java.util.Scanner;

public class q3 {
    public static void primenumber(int a){
    if(a == 2){
      System.out.print("prime");
    } else if(a%2 == 0){
      System.out.print(" not prime");
    } else if(a==3) {
      System.out.print(" prime");
    } else if(a%3==0){
      System.out.print("not prime");
    } else {
      System.out.print("prime");
    }
    System.out.println();
    return;
  }
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    primenumber(a);
  }
}
