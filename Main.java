class Vehicle {
    void drive(){
        System.out.println("vehicle is being driven");
    }
    
}
// subclass
class Car extends Vehicle{
    void display(){
        System.out.println("car details");
        System.out.println("brand: telsa");
        System.out.println("model: xyz");
        System.out.println("year: 2020");
    }
}
// main
public class Main {
    public static void main (String[]args){
        Car mycar = new Car();
        mycar.drive();
        mycar.display();
    }
}
