public class Laptop {
    // non parameterized constructor
    public Laptop() {
        System.out.println("This is a non-parameterized constructor");
    }
    // parameterized constructor
    public Laptop(String brand, String model) {
        System.out.println("This is a parameterized constructor");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public Laptop(double price) {
        System.out.println("This is a constructor with a double parameter");
        System.out.println("Price: " + price);
    }
    public void setModel(String model) {
        System.out.println("Model set to: " + model);
    }
    
    public static void main(String[] args) {
        // Creating an object using the non-parameterized constructor
        Laptop laptop1 = new Laptop();
        
        // Creating an object using the parameterized constructor
        Laptop laptop2 = new Laptop("Dell", "XPS 13");
        
        // Creating an object using the constructor with a double parameter
        Laptop laptop3 = new Laptop(999.99);
        
        // Setting the model of the laptop
        laptop2.setModel("Inspiron 15");

        // using two parameters
        Laptop laptop4 = new Laptop("HP", "Pavilion 15");

        // Setting the model of the laptop
        laptop4.setModel("Envy 13");
        

    }
}
