public class SimpleInterest{
    private double principle;
    private double time;
    private double rate;

    public void setPrinciple(double p){
        principle=p;
    }
    public void setTime(double t){
        time = t;
    }
    public void setRate(double r){
        rate = r;
    }
    public double getPrinciple(){
        return principle;
    }
    public double getTime(){
        return time;
    }
    public double getRate(){
        return rate;
    }
    public double CalculateSI(){
        return principle*rate*time;
    }

    public static void main (String [] args){
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(1000);
        si.setRate(5);
        si.setTime(2);
        System.out.println("simpleInterest is" + si.CalculateSI());

        
        
    }
}
    