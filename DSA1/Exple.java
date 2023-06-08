import java.util.Scanner;

public class Exple {
     public static void checkPalind(String str){
        String s="";
           for(int i=str.length()-1;i>=0;i--){
               char ch=str.charAt(i);
               s=s+ch;
           }
           if(str.equals(s)){
            System.out.println("String is Palindrome");
           }else{
            System.out.println("String is not  Palindrome");
           }
    
     }
    public static void main(String[] args){
        // 1.reverse String
        // System.out.println("Hello, World!");
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // String str="";
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch=s.charAt(i);
        //     str=str+ch;
        // }
        // System.out.print(str+"");


        // 2. missing number

        // int arr[]={12,13,21,25,26};
        // int a1[]={12,13,21,26};
        // int missingNumber=0;
        // int total=0;
        // int total1=0;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        //    total+=arr[i];
        // }
        // for(int i=0;i<a1.length;i++){
        //     System.out.print(a1[i]+" ");
        //    total1+=a1[i];
        // }
        // System.out.println();
        // missingNumber=total-total1;
        // System.out.println(missingNumber); 
   
        //3. check palindrome

        //    String str="velev";
        //    checkPalind(str);

           //4. "FizzBuzz"

        //    for(int i=0;i<=100;i++){
        //     if(i%3==0 && i%5==0){
        //         System.out.println("FizzBuzz"); 
        //     }else if(i%3==0){
        //         System.out.println("Fizz");
        //     } else if(i%5==0){
        //         System.out.println("Buzz");
        //     }else{
        //     System.out.println(i);
        //     }
        //    }
      //  5. Maximum number
      int arr[]={12,65,23,99,200};
      int max=arr[0];
      for(int i=0;i<arr.length-1;i++){
           if(max <= arr[i+1]){
            max=arr[i+1];
           }
      }
      System.out.println(max);
           
    }
    
}

