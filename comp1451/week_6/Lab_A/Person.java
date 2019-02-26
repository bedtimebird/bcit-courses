public class Person{
  
  private String name;
  private int ageInYears;

  private final int MIN_INT = 0;
  private final int MAX_INT = 130;

  public Person(String name, int ageInYears) {
    setName(name);
    setAgeInYears(ageInYears);
  }
  public void setName(String name){
    this.name = Checks.formatString(Checks.lengthString(name));
  }
  public String getName(){
    return name;
  }
  public void setAgeInYears(int ageInYears){
    this.ageInYears = Checks.lengthInt(ageInYears, MIN_INT, MAX_INT);
  }
  public int getAgeInYears(){
    return ageInYears;
  }
  @Override
  public String toString(){
    String line = "Name is " + getName() + " and age is " + getAgeInYears() + " years.";
    return line;
  }
}
