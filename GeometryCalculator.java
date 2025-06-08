class shape{
    void area(){
        System.out.println("Calculating area of different shapes");
    
    }   
}
// subclass 1
class rectangle extends shape{
    double length,breadth;

    rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void area(){
        double result = length * breadth;
        System.out.println("Area of rectangle: "+result);
    }
}

// subclass 2

class Square extends rectangle {

    Square(double side) {
        super(side, side); // A square is a rectangle with equal sides
    }

    @Override
    void area() {
        double result = length * length;
        System.out.println("Area of Square: " + result);
    }
}

// Separate subclass for Circle (optional)
class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Main class
public class GeometryCalculator {
    public static void main(String[] args) {
        rectangle rect = new rectangle(5, 3);
        rect.area();

        Square sq = new Square(4);
        sq.area();

        Circle cir = new Circle(2.5);
        cir.area();
    }
}