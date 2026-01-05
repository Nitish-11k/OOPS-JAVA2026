package DSA_2026.ARRAY.Stack;

class MyStack{
    private int[] arr;
    private  int capacity;
    private int top;

    public  MyStack(int cap){
        this.capacity = cap;
        arr = new int[cap];
        top = -1;
    }

    void push(int x){
        if(top == capacity -1){
            System.out.println("Stack Overflow.");
            return;
        }
        arr[++top] = x;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return  arr[top];
    }

    boolean isEmpty(){
        return  top == -1;
    }
    boolean isFull(){
        return top == capacity - 1;
    }
}

public class StacKImpOnFixedArray {
    public static void main(String [] args){
        MyStack stack = new MyStack(4);
//        System.out.println("Stack is Empty : " + stack.isEmpty());
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(11);
        System.out.println("Top Element : " + stack.peek());
        System.out.println("Is Stack is Full : " + (stack.isFull() ? "Yes" : "No"));

        System.out.println("Stack popped : " + stack.pop());
        System.out.println("Stack popped : " + stack.pop());

        System.out.println("Is Stack is Full : " + (stack.isFull() ? "Yes" : "No"));

        System.out.println("Top Element of Stack : "  + stack.peek());


    }
}
