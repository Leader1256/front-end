class Node{
    Node next=null;
    Node head=null;
    int val;
    Node(int val){
     this.val=val;
    }

    void InsertElement(int n){
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


    public void printList(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }else{
            Node curNode=head;
            System.out.println("Elements are :");
            while(curNode!=null){
                System.out.print(curNode.val+" ");
                curNode=curNode.next;
            }
            System.out.println("");
        }
    } 
    Node slow;
   public int middleElment(){
     slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow.val;
   }
     public Node ReverseList(Node slow){
        Node prev=null;
        Node curr=slow;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr.next;
            curr=temp;
        }
        return prev;
     } 
}
public class linkedLIstclass {
    public static void main(String[] args){
        Node list=new Node(5);


        list.InsertElement(34);
        list.InsertElement(5);;
        list.InsertElement(43);
        list.InsertElement(12);
        list.InsertElement(89);


        // list.printList();
        
        
        list.printList();
        int middle=list.middleElment();
        System.out.println(middle);
        list.ReverseList(list.slow);
        list.printList();


    }
}
