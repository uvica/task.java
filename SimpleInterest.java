public class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    public void setPrinciple(double p) {
        principle = p;
    }
    public void setTime( double t){
        time = t;
    }
    public void setRate( double r){
        rate = r;
    }

    public double getPrinciple(){
        return principle;
    }
    public double getRate(){
        return rate;
    }
    public double getTime(){
        return time;
    }
    public double CalculateInterest(){
        return (principle*rate* time)/100;
    }
public void main (String[]args){
    SimpleInterest si = new SimpleInterest();

        si.setPrinciple(10000);  
        si.setTime(2);           
        si.setRate(5);           

        
        System.out.println("Principal: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());

        
        System.out.println("Simple Interest: " + si.CalculateInterest());
    }
}



