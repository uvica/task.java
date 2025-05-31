public class Citizen {
    // private attributes
   private String name;
   private String citizenNumber;
   private int age;
//    public methods
    public Citizen(String name, String citizenNumber, int age) {
        this.name = name;
        this.citizenNumber = citizenNumber;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCitizenNumber(String citizenNumber) {
        this.citizenNumber = citizenNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // main
    public static void main(String[] args) {
        // Creating an object of Citizen class
        Citizen citizen1 = new Citizen("John Doe", "CN123456", 30);
        System.out.println(citizen1.getName());
        System.out.println(citizen1.citizenNumber);
        System.out.println(citizen1.age);
    }
}
