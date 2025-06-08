// Base class
class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a shape...");
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }
}

// Main class
public class Main4 {
    public static void main(String[] args) {
        // Rectangle Object
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle:");
        rect.calculateArea();
        rect.calculatePerimeter();

        System.out.println(); // Separator line

        // Circle Object
        Circle cir = new Circle(4.5);
        System.out.println("Circle:");
        cir.calculateArea();
        cir.calculateCircumference();
    }
}
