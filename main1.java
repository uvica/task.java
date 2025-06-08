class Employee {
    void work(){
        System.out.println("Employee is working");
    }
    void getSalary(){
        System.out.println("Employee salary is getting processed");
    }   
}
class HRManager extends Employee{
    @Override
    void work(){
        System.out.println("HR manager is managing recruitment and employee relations.");
    }

}
public class main1{
    public static void main(String[] args){
        HRManager hr= new HRManager();
        hr.work();
        hr.getSalary();
    }
    
}

