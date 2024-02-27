import java.util.Scanner;

public class c15 {
     public static void main(String[] args) {
    //System.out.println("Hello world!");
//     Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int operation = sc.nextInt();

    switch(operation){
      case 1 : System.out.println(a+b);
      break;
      case 2 : System.out.println(a-b);
      break;
      case 3 : System.out.println(a*b);
      break;
      case 4 : if(b == 0){
        System.out.println("invilate derivion");
      } else {
        System.out.println(a/b);
      }
      case 5 : if(b == 0){
        System.out.println("invilate derivion");
      }  else {
        System.out.println(a%b);
      }
    }
  }
}
