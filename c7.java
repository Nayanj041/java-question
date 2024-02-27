import java.util.Scanner;

public class c7 {
     public static void main(String[] args) {
//System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age > 18){
      System.out.println("adult");
    } else {
      System.out.println("not adult");
    }
  }
}
