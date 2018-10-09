public class URLify {
    //Add %20 at all spaces, string has enough space to accomodate new character
    public static void main(String[] args) {
        char[] c={'m','r',' ','j','o','h','n',' ',' '};
        url(c,7);
    }
    public static void url(char[] s,int n ){
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(s[i]==' ') count++;
        }
        int newlength=n+(count*2);
        int j=newlength-1;
        for (int i = n-1; i >=0 ; i--) {
            if(s[i]==' '){
                s[j--]='0';
                s[j--]='2';
                s[j]='%';
            }
            else{
                s[j]=s[i];
            }
            j--;
        }
        for(char c:s) System.out.print(c);
    }
}
