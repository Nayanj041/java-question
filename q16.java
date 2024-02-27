public class q16 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 5; 
        int pos = 1;
        int bitmask = 1<<pos;
        int newnumber = bitmask|n;
        System.out.println(newnumber);
      }
}
