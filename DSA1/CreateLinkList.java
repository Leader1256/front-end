class Node{
    int val;
    Node next=null;
    public Node head=null;
    Node(int val){
        this.val=val;
    } 
    void printAllElement(){
   
    Node curNode=head;
    while(curNode!=null){
        System.out.print(curNode.val+" ");
        curNode=curNode.next;
    }
    System.out.println("");
    }
    void insertElement(int n){
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


    public int middleOfLinkedList(){
       Node slow=head;
       Node fast=head;
       while(head!=null && fast.next!=null){
        slow =slow.next;
        fast =fast.next.next;
       }
       return slow.val;
    }
}

public class CreateLinkList {
    public static void main(String[] args){
        System.out.println("Linkedlist element is given below :");
       Node l=new Node(5);

       l.insertElement(12);

       l.insertElement(14);

       l.insertElement(43);

       l.insertElement(75);

       l.insertElement(321);

       l.insertElement(23);

       l.printAllElement();

       int a=l.middleOfLinkedList();
       System.out.println(a);
    
    }
}
