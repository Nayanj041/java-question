import java.util.Scanner;

public class c16 {
    public static void main(String[] args) {
    //System.out.println("Hello world!");
    //Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();

    switch(month){
      case 1 : System.out.println("january");
      break;
      case 2 : System.out.println("february");
      break;
      case 3 : System.out.println("mar");
      break;
      case 4 : System.out.println("apil");
      break;
      case 5 : System.out.println("may");
        break;
    }
  }
}
