class StackImp{
    int top=-1;
    int[] arr;
    int size;
    StackImp(int s){
        this.size=s;
        arr=new int[size];
    }

    void push(int n){
      if(top==size){
        System.out.println("Stack is fulled");
      }else{
        top++;
        arr[top]=n;
      }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{
            top--;
        }
    }
    int peek(){
        int num=-1;
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            num=arr[top];
        }
        return num;
    }
}
public class StackImplement {
    public static void main(String[] args){
        StackImp st=new StackImp(3);
        st.push(65);
        st.push(12);
        st.push(16);
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
