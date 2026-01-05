package DSA_2026.ARRAY.Stack;

import java.util.ArrayList;



public class StackImplUsingDynamicArray {
        ArrayList<Integer>  arr = new ArrayList<>();

        void push(int x){
            arr.add(x);
        }
        int pop(){
            if(arr.isEmpty()){
                System.out.println("Stack is Empty");
                return  -1;
            }
            int val  = arr.get(arr.size() -1);
            arr.remove(arr.size() -1);
            return val;
        }

        int peek(){
            if(arr.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr.get(arr.size() -1);
        }
        boolean isEmpty(){
            return arr.isEmpty();
        }

        int capacity(){
            return arr.size() ;
        }
    public static void main(String[] args) {
        StackImplUsingDynamicArray st = new StackImplUsingDynamicArray();
        st.push(3);
        st.push(12);
        st.push(9);
        st.push(23);

        System.out.println(st.peek());
        System.out.println("Current Capacity of the stack : "  + st.capacity());
    }
}
