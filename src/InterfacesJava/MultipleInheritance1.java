package InterfacesJava;

interface Add{
    int add(int a, int b);
}
interface Sub{
    int sub(int a, int b);
}
class Calculate implements  Add, Sub{

    @Override
    public int add(int a, int b) {
        return a +b ;
    }

    @Override
    public int sub(int a, int b) {
        return b-a;
    }
}
public class MultipleInheritance1 {

    public static void main(String [] args){
        Calculate c = new Calculate();
        System.out.println("Addition : " + c.add(2, 4));
        System.out.println("Subtraction : " + c.sub(4, 9));
    }

}
