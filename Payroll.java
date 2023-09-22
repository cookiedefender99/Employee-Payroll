

public class Payroll {
    //fields
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;

    //constructors
    public Payroll(String n, int i) {
        name = n;
        idNumber = i;

    }
    public Payroll() {
        name = "";
        idNumber = 0;
        payRate = 0;
        hoursWorked =0;
    }

    //setting employee name
    public void setName(String n) throws InvalidNameException{
         if (n.isEmpty()) { //checking for empty string
            throw new InvalidNameException(); 
        } else {
            name = n;   
        } 
       
    }
    //setting idnumber
    public void setIdNumber(int i) throws InvalidIDException{
        if (i <= 0) { //checking for id number set as 0 or negative num
            throw new InvalidIDException();
        } else {
            idNumber = i;
        }

        
    }
    //setting payrate
    public void setPayRate(double p) throws InvalidHourlyRateException {
       if (p > 25 || p < 0) { //checking for hourly pay rate over 25$ or under $0/negative
            throw new InvalidHourlyRateException();
        } else {
            payRate = p;
        }

        
    }
    //setting hours worked
    public void setHoursWorked(double h) throws InvalidHoursException{
        if (h > 84 || h < 0) { //checking for hours worked over 84 hours or negative
            throw new InvalidHoursException();
        } else {
            hoursWorked = h;
        }

    }
    //setters
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    //gross pay calculation
    public double getGrossPay(){
        return hoursWorked * payRate;
    }



}
