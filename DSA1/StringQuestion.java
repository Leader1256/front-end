public class StringQuestion {
    public static void main(String[] args){
        String str="hii this is good ";
        String reverseStr="";
        int n=str.length();
        for(int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            reverseStr+=ch;
        }
        System.out.println(reverseStr);
    }
}

