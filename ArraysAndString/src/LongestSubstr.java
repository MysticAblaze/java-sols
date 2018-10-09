import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstr {
    //longest substring without repeating character
    public static void main(String[] args) {
        System.out.println(longsubstr("javaconceptoftheday"));
    }
    public static String longsubstr(String str){
        int longlength=0;
        String longest=null;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(!hmap.containsKey(c)){
                hmap.put(c,i);
            }
            else{
                i=hmap.get(c);
                hmap.clear();
            }
            if(hmap.size()>longlength){
                longlength=hmap.size();
                longest=hmap.keySet().toString();
            }
        }
        System.out.println(longlength);
        return longest;
    }
}
