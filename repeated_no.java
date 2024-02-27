public class repeated_no {
    public static void main(String[] args){
        for(int i=100; i<=1000; i++){
            if(hasrepeatedDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean hasrepeatedDigit (int numb){
        int[] digitcount= new int[10];
        while(numb>0){
            int digit = numb % 10;
            digitcount[digit]++;
            if(digitcount[digit]>1){
                return true;
            }
            numb /= 10;

        }
        return false;
    }
    
}
