class StackNode{
    Node next=null;
    Node head;
    int val;
    StackNode(int val){
        this.val=val;
    }
    void insertELment(int n){
      Node temp=new Node(n);
        temp.next=head;
        head=temp;
      }
      void popList(){
        if(head!=null){
           head=head.next;
        }
      }
      void peek(){
        int val=-1;
        if(head!=null){
            System.out.print(head.val+" ");
         
      }
    }
}
public class StackLinkedList {
    public static void main(String[] args){
        StackNode sn=new StackNode(3);
        sn.insertELment(12);
        sn.insertELment(43);
         sn.insertELment(23);
         sn.insertELment(22);
       
        sn.popList();
        sn.peek();
        sn.popList();
        sn.peek();
        sn.popList();
        sn.peek();
        sn.popList();
        sn.peek();
       

      
     

    }
}
