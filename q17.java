public class q17 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
        int newnumber = notbitmask & n;
        System.out.println(newnumber);
      }
}
