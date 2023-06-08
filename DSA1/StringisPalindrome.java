public class StringisPalindrome {
    public static void main(String[] args){
        String s="ata";
        String s1="";
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            s1+=ch;
        }
        if((s.toLowerCase()).equals(s1.toLowerCase())){
            System.out.println("string is palindrome");
        }else{
            System.out.println("string is  not palindrome");
        }
    }
}
