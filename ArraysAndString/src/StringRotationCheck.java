public class StringRotationCheck {
    public static void main(String[] args) {
        boolean a=check("waterinthe","inthewater");
        System.out.println(a);
    }
    public static boolean check(String s1,String s2){
        String newstring=s1+s1;
        for(int i=0;i<newstring.length();i++){
            for (int j = i; j <newstring.length() ; j++) {
                String temp=newstring.substring(i,j);
                if(temp.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
