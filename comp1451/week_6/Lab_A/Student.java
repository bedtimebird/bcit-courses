public class Student extends Person {

  private boolean isFullTimeStudent;
  private double gpa;
 
  private final double MIN_DOUBLE = 0;
  private final double MAX_DOUBLE = 100;

  public Student(String name, int ageInYears, boolean isFullTimeStudent, double gpa){
    super(name, ageInYears);
    setIsFullTimeStudent(isFullTimeStudent);
    setGpa(gpa);
  }
  public void setIsFullTimeStudent(boolean isFullTimeStudent){
    this.isFullTimeStudent = isFullTimeStudent;
  }
  public boolean getIsFullTimeStudent(){
    return isFullTimeStudent;
  }
  public void setGpa(double gpa){
    this.gpa = Checks.lengthDouble(gpa, MIN_DOUBLE, MAX_DOUBLE);
  }
  public double getGpa(){
    return gpa;
  }
  @Override
  public String toString(){
    String line = "";
    if (isFullTimeStudent) {
      line = "The Student's name is " + getName() + " and age is " + getAgeInYears() + " years old. The student is a full time student with gpa of " + getGpa() + ".";
    } else if (!isFullTimeStudent){
      line = "The Student's name is " + getName() + " and age is " + getAgeInYears() + " years old. The student is a part time student with gpa of " + getGpa() + ".";
    }
    return line;
  }

}
