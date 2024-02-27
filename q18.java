import java.util.Scanner;

public class q18 {
     public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt();
    int n = 5;
    int pos = 1;
    int bitmask = 1<<pos;
    if(oper == 1){
      int newnumber = bitmask | n;
      System.out.println(newnumber);
    } else {
      int notbitmask = ~(bitmask);
      int newnumber = notbitmask & n;
      System.out.println(newnumber);
    }
  }
}
