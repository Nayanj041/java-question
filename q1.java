import java.util.Scanner;

public class q1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
      }
      public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); // call kiya function ko
      }
}
