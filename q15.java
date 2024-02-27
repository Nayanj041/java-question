public class q15 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n)==0){
          System.out.println("bit was 0");
        } else {
          System.out.println("bit was 1");
        }
      }
}
