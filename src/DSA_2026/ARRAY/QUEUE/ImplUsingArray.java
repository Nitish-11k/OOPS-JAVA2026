package DSA_2026.ARRAY.QUEUE;

public class ImplUsingArray {

    private int [] arr;
    private int capacity;
    private int size;

    public ImplUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
    public boolean isEmpty(){
        return  size == 0;
    }

    public void enque(int x){
        if(size == capacity){
            System.out.println("Queue is Full");
            return;
        }
        arr[size] = x;
        size++;
    }
    public void deque(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return ;
        }
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }
    public int getFront(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public int getRear(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[size-1];
    }

    public static void main(String[] args) {
        ImplUsingArray queue = new ImplUsingArray(5);
        queue.enque(1);
        queue.enque(3);
        queue.enque(5);
        queue.enque(9);

        System.out.println("First Element of the queue is : " + queue.getFront());
        System.out.println("Last Element of the queue is : " + queue.getRear());

//        After using deque method then the first element is

        queue.deque();
        System.out.println("First Element of the queue is : " + queue.getFront());
    }
}
