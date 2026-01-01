package ListInterface.vectos;

import java.util.Vector;

public class AddingElementsVector {
//    add() method is used to add an element at the end of the vector
//    add(object) it is used to add an object at the end of the vector
//    add(int index, object) this method is used to add an object at the specific index in the Vector

    public static void main(String [] args){
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        System.out.println(vec);

//        Now we add 15 element at index 1 so the vector is [10, 15, 20, 30]
        vec.add(1,15);
        System.out.println(vec);
    }
}
