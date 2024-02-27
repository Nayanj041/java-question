import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] numbers = new int[size];
    for(int i = 0; i < size; i++){
      numbers[i] = sc.nextInt();
    }
    for(int i = 0; i < size; i++){
      System.out.println(numbers[i]);
    }
  }
}
