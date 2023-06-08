import javax.swing.text.DefaultEditorKit.InsertBreakAction;

class Node{
  
    Node next;
    int val;
    Node(int val){
     this.val=val;
     this.next=null;
    }

}

public class LinkedListMake {
    static Node head=null;
    public static void insertElement(int n){
        Node temp=new Node(n);
        if(head==null){
            head=temp;
        }else{
            Node curNode=head;
            while(curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.next=temp;
        }
    }
    public  static void println(){
     if(head==null){
        System.out.println("LinkedList is empty");
     }
     Node curNode=head;
      while(curNode!=null){
        System.out.print(curNode.val+"->");
        curNode=curNode.next;
      }
      System.out.println("");

    }
    public static void main(String[] args){
        Node n=new Node(3);
        insertElement(12);
        insertElement(21);
        insertElement(32);
        println();
    }
}
