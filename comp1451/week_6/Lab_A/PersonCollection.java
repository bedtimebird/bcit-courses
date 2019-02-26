import java.util.ArrayList;

public class PersonCollection {

  public ArrayList<Person>people;

  public PersonCollection(){
    people = new ArrayList<Person>();
  }

  public void loadCollection(){
    Employee ep1 = new Employee("Amanda Beckett", 40, 20.5, 25);
    Employee ep2 = new Employee("Preston Meyers", 41, 40.0, 45);
    Employee ep3 = new Employee("William Lichter", 25, 45.8, 40);
    Student st1 = new Student("Denise Fleming", 55, false, 86.2);
    Student st2 = new Student("Mike Dexter", 23, false, 75.8);
    Student st3 = new Student("	Kenny Fisher", 19, true, 45.7);
    people.add(ep1);
    people.add(ep2);
    people.add(ep3);
    people.add(st1);
    people.add(st2);
    people.add(st3);
  }

  public void displayAllDetails(){
    System.out.println(" ");
    System.out.println("List of people: ");
   for (Person role:people) {
     if (role instanceof Employee) {
       System.out.println(" ");
       System.out.println(((Employee) role).toString());
     }
     if (role instanceof Student){
       System.out.println(" ");
       System.out.println(((Student) role).toString());
     }
    }
  }

}
