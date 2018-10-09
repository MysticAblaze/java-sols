public class IsUnique {
    //Implement an algorithm to determine if a string has all unique characters
    public static void main(String[] args) {
        chrtonum(' ');
    }
    //brute force
    public static boolean checkUnique(String str){
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            for (int j = i+1; j <str.length() ; j++) {
                if(c==str.charAt(j))
                    return false;
            }
        }
        return true;
    }
    //using an array
    public static boolean checkuniquear(String str){
        int[] characters=new int [128];
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            int asc=c-'a'+1;
            if(characters[asc]==0){
                characters[asc]++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void chrtonum(char c){
        //char a=(char)(c-'a'+'A');
        int a=c-'a';
        System.out.println(a);
    }
}
