package InterfacesJava;

interface Vehicle{
    void gear(int a);
    void speedUp(int b);
    void applyBrakes(int c);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;


    @Override
    public void gear(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int b) {
        speed = speed + b;
    }

    @Override
    public void applyBrakes(int c) {
        speed = speed -c;
    }

    public void printStates(){
        System.out.println("Bike 's Speed:  " + speed + " , Gear  : " + gear);
    }
}

class Bike implements Vehicle{
    int gear;
    int speed;

    @Override
    public void gear(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int b) {
        speed = speed + b;
    }

    @Override
    public void applyBrakes(int c) {
        speed = speed - c;
    }

    public void printStates(){
        System.out.println("Bike's Speed : " + speed + " ,  Gear : " + gear);
    }
}

public class MultipleInheritance {
    public static void main(String [] args){
        Bicycle bicycle = new Bicycle();
        bicycle.gear(1);
        bicycle.speedUp(2);
        bicycle.applyBrakes(1);

        System.out.println(" Bicycle presnet State :  ");
        bicycle.printStates();


        Bike bike = new Bike();
        bike.gear(2);
        bike.speedUp(4);
        bike.applyBrakes(2);

        System.out.println("Bike Present State : ");
        bike.printStates();
    }
}
