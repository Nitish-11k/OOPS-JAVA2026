package ListInterface.vectos;

import java.util.Vector;

public class UpdateElement {
    // We can update element by using set() method
//    in set() method we replace the existing element from the new element
    public  static  void main(String[] args){
        Vector<Integer> v  = new Vector<>();
        v.add(10);
        v.add(12);
        v.add(23);
        v.add(50);

        System.out.println("Printing Before updating the Vector's Element : " );
        System.out.println(v);
        System.out.println();

        System.out.println("Now we are updating the 0th index element with the element value 30 ");
        v.set(0, 30);
        System.out.println("After updating element : ");
        System.out.print(v);

    }
}
