public class ChaeckPermutation {
    //to check if two strings are permutation of each other
    public static void main(String[] args) {
        System.out.println(check("asddgfer","asdgfrde"));
    }
    public static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] asc=new int[27];
        for (int i = 0; i <s1.length() ; i++) {
            int c=s1.charAt(i)-'a';
            asc[c]++;
        }
        for (int i = 0; i <s2.length() ; i++) {
            int c=s2.charAt(i)-'a';
            if(asc[c]==0){
                return false;
            }
            else{
                asc[c]--;
                if(asc[c]<0){
                    return false;
                }
            }
        }
        return true;
    }
}
