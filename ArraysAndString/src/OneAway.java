import java.util.LinkedList;

public class OneAway {
    public static void main(String[] args) {
        System.out.print(check("pale","bake"));
    }
    public static boolean check(String s1,String s2){
        int n=s1.length()-s2.length();
        if(n>1){
            return false;
        }
        if(n==1){
            if(checkEdit(s1,s2))
                return true;
        }
        if(n==0){
            if(checkEdit(s1,s2))
                return true;
        }
        return false;
    }
    public static boolean checkEdit(String s1,String s2){
        int[] asc=new int[27];
        for (int i = 0; i <s1.length() ; i++) {
            asc[s1.charAt(i)-'a']++;
        }
        int count=0;
        for (int i = 0; i <s2.length() ; i++) {
            asc[s2.charAt(i)-'a']--;
            if(asc[s2.charAt(i)-'a']<0){
                if(s1.length()-s2.length()==1){
                    return false;
                }
                count++;
                if(count>1)
                return false;
            }
        }
        return true;
    }
}
