public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(check("tactcoa"));
    }
    //any string which is not a palindromic permutation will contain more than 1 character
    //with odd number count
    public static boolean check(String s){
        s.toLowerCase();
        int[] nums=new int[27];
        for (int i = 0; i <s.length() ; i++) {
            int c=s.charAt(i)-'a';
            nums[c]++;
        }
        int count=0;
        for (int i = 0; i <27 ; i++) {

            if((nums[i]%2)!=0)
                count++;

        }
        if(count>1){
            return false;
        }
        return true;
    }
}
