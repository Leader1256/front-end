import java.util.concurrent.ConcurrentMap;

class Node {
    Node next;
    char val;
    Node(char val){
      this.val=val;
      this.next=null;
    }
}
public class PrintList {
    public static Node head=null;
    public static void insertElement(char n){
        Node temp=new Node(n);
        if(head==null){
            head=temp;
        }else{
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=temp;
        }
    }
    public static void printLinkedList(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }else{
            Node curNode=head;
            while(curNode!=null){
                System.out.print(curNode.val+"->");
                curNode=curNode.next;
            }
            System.out.println("null"+"\n");

        }
    }
    public static int printReverse(){
        Node prev=head;
        
       Node curNode=head;
        while(curNode.next!=null){
            curNode=curNode.next;
            Node temp=curNode.next;
        curNode.next=prev;
        prev.next=temp;
        }
        
        return prev.val;
    }
    public static void main(String[] args){
      //  input - "2 3 4 5 6 7 "

      String s="2 3 4 5 6 7";
     
    int n=s.length();
    for(int i=0;i<n;i++){
        
        char ch=s.charAt(i);
          if(ch != ' '){
            insertElement(ch); 
          }
        }
    printLinkedList();
    System.out.println(printReverse());

    }
}
