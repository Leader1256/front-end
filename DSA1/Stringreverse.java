public class stringreverse {
    public static void main(String[] args){
        String str="my name is";
        int n=str.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=ch;

        }
        System.out.println(ans);
    }
}
