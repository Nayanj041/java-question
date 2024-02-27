import java.util.Scanner;

public class q5 {
     public static void printtable(int n){
    for(int i = 0; i <= 10; i++){
      int k = n*i;
      System.out.println(k);
    }
    //System.out.println();
    return;
  }
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printtable(n);
  }
}
