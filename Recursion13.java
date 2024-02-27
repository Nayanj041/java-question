public class Recursion13 {
    // public static boolean[] map = new boolean[26];
    // public static String removeDuplicates(String str, int idx, String newString){
    
    //     if(idx == str.length()){
    //         System.out.println(newString);
    //         return "";
    //     }
    //      char currchar = str.charAt(idx);
    //     if(map[currchar - 'a'] == true){
    //         return removeDuplicates(str, idx+1, newString);
    //     } else {
    //         newString += currchar;
    //         map[currchar - 'a'] = true;
    //        return  removeDuplicates(str, idx+1, newString);
    //     }
    // }
    // public static void main (String args[]){
    //     String str = "abbccdda";
    //     removeDuplicates(str, 0,"");
    // }
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        if(idx == str.length()) {
        return "";
        }
        char curr = str.charAt(idx);
        if(present[curr-'a']) {
        return removeDuplicates(str, idx+1, present);
        } else {
        present[curr-'a'] = true;
        return curr + removeDuplicates(str, idx+1, present);
        }
        }
        public static void main(String args[]) {
        String str = "abcadbcefghabi";
        boolean present[] = new boolean[str.length()];
        System.out.println(removeDuplicates(str, 0, present));
        }
}
