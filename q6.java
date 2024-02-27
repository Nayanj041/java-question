import java.util.Scanner;

public class q6 {
     public static void thrithaverage(int a, int b, int c){
     int sum = a+b+c;
    int average = sum/3;
    System.out.println(average);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

   thrithaverage(a,b,c);
  }
}
