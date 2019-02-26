public class Employee extends Person {

  private double hourlyRate;
  private int hoursWorkedPerWeek;

  private final int MIN_INT = 0;
  private final int MAX_INT = 80;
  private final double MIN_DOUBLE = 0;
  private final double MAX_DOUBLE = 50000;

  public Employee(String name, int ageInYears, double hourlyRate,int hoursWorkedPerWeek){
    super(name, ageInYears);
    setHourlyRate(hourlyRate);
    setHoursWorkedPerWeek(hoursWorkedPerWeek);
  }
  public void setHourlyRate(double hourlyRate){
    this.hourlyRate = Checks.lengthDouble(hourlyRate, MIN_DOUBLE, MAX_DOUBLE);
  }
  public double getHourlyRate(){
    return hourlyRate;
  }
  public void setHoursWorkedPerWeek(int hoursWorkedPerWeek){
    this.hoursWorkedPerWeek = Checks.lengthInt(hoursWorkedPerWeek, MIN_INT, MAX_INT);
  }
  public int getHoursWorkedPerWeek(){
    return hoursWorkedPerWeek;
  }
  @Override
  public String toString(){
    String line = "";
    if (getHoursWorkedPerWeek()<40) {
      line = "The Employee name is " + getName() + " and age is " + getAgeInYears() + " years old. The employee is a part time employee.";
    } else if (getHoursWorkedPerWeek()>=40){
      line = "The Employee name is " + getName() + " and age is " + getAgeInYears() + " years old. The employee is a full time employee.";
    }
    return line;
  }
}
