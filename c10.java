import java.util.Scanner;

public class c10 {
    public static void main(String[] args) {
   // System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch(button){
      case 1 : System.out.println("hello");
      break;
      case 2 : System.out.println("hi");
      break;
      case 3 : System.out.println("hola");
      default : System.out.println("invilate");
    }
  }
}
