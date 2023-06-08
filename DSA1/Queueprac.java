class Queuepra {
    int front = -1;
    int rear = -1;
    int[] arr;
    int size;

    Queuepra(int size) {
        this.size = size;
        arr = new int[size];
    }

    void enqueue(int n) {
        if (rear == size-1) {
            System.out.println("Queue is fulled");
        } else {
         if(front==rear){
            front++;
        }else{
                rear++;
                arr[rear] = n;
        }
    }
}

    void dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
        }else{
            front++;
        }

    }

    int peek(){
        int val=-1;
        if(front==rear){
           System.out.println("Queue is empty");
        }else{
            val=arr[front];
        }                                 
       return val;
    }

}

class Queueprac {
    public static void main(String[] args) {
        Queuepra qu=new Queuepra(3);
        qu.enqueue(12);
        qu.enqueue(13);
        qu.enqueue(16);
        qu.dequeue();
       System.out.println(qu.peek());
       qu.dequeue();
       System.out.println(qu.peek());
    }
}