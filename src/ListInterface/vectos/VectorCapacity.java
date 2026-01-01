package ListInterface.vectos;

import java.util.Vector;

public class VectorCapacity {
    public static void main(String [] args){
        Vector<Integer> vec = new Vector<>(2);  //Here we initialize the capacity of vector : 2, and by default its capacity is 10

        Vector<Integer> vector = new Vector<>();
        System.out.println("The Default Capacity of an Vector is : " + vector.capacity());
        System.out.println();

        vec.add(10);
        vec.add(20);
        System.out.println("Capacity after adding 2 elements " + vec.capacity());

        vec.add(30);
        System.out.println("Capacity after adding 3 elements " + vec.capacity());

        vec.add(40);
        vec.add(50);
        System.out.println("Capacity after adding 5 elements " + vec.capacity());
        System.out.println(vec);
    }
}

