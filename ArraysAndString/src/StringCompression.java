public class StringCompression {
    public static void main(String[] args) {
        String s=compressed("aaaa");
        System.out.println(s);
    }
    public static String compressed(String str){
        StringBuilder builder=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int count=1;
            char c=str.charAt(i);
            int j=i+1;
            while(j<str.length()&&str.charAt(j)==c){
                count++;
                j++;
            }
            builder.append(c);
            builder.append(count);
            i=j;
        }
        return builder.toString();
    }
}
