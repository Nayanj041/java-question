public class REcursion11{
    public static boolean isSorted(int arr[] , int idx){
        if (idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        } else {
            return false;
        }
    }
   public static void main(String args[]){
    int arr[] = {1,2,4,6};
    boolean ans = isSorted(arr , 0);
    System.out.println(ans);

   } 
}
