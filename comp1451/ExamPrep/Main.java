import java.util.ArrayList;

class Main {
  public static void main(String[] args) {  

    QuizQuestions Q1 = new QuizQuestions("What will happen when you attempt to compile and run this code?"+ "\n" +"public class MyMain {"+ "\n" +"public static void main(String args)  {"+"\n"+"System.out.println(\"Hello World !\");"+ "\n" +"}"+ "\n" +"}",
                                         "The compiler will complain that main is a reserved word and cannot be used for a class",
                                         "The code will compile and when run will print out \"Hello World !\"",
                                         "The code will compile but will complain at run time that no constructor is defined",
                                         "The compiler will complain that main is not correctly defined",
                                         4);
    QuizQuestions Q2 = new QuizQuestions("Which of the following stands true about default modifier of class member?",
                                         "By default, variable, methods and constructors can be accessed by subclass only",
                                         "By default, methods and constructors can be accessed by any class lying in the same package",
                                         "By default, variables, methods and constructors can be accessed by any class lying in any package",
                                         "None of the above",
                                         2);    
    QuizQuestions Q3 = new QuizQuestions("What is a package in Java?",
                                         "A directory structure to save projects in.",
                                         "-",
                                         "-",
                                         "-",
                                         1);    
    QuizQuestions Q4 = new QuizQuestions("Which access modifier can be used for a class so that its members can be accessed by a different class in a different package?",
                                         "private",
                                         "public",
                                         "protected",
                                         "default",
                                         2);    
    QuizQuestions Q5 = new QuizQuestions("Mention 2 advantages of using packages in Java",
                                         "Provides a structure for multiple people working on the same project to collaborate together.",
                                         "Provides security to only allow certain people to access a project.",
                                         "both 1 & 2",
                                         "-",
                                         3);    
    QuizQuestions Q6 = new QuizQuestions("What is the correct syntax of a main method in a Java class",
                                         "public static int main(String[] args)",
                                         "public static void main(String[] args)",
                                         "static void main(String[] args)",
                                         "None of the above",
                                         2);    
    QuizQuestions Q7 = new QuizQuestions("Select the true statements about packages and importing from the following statements",
                                         "If an import statement is used, it must be the first non-blank line of the source file",
                                         "A package is used to define a separate naming context",
                                         "the java.lang package is automatically imported and does not need to be imported using an import statement",
                                         "both 2 & 3",
                                         4);
    QuizQuestions Q8 = new QuizQuestions("Which of the following statements is/are true about the method main?",
                                         "It is a class method",
                                         "It is an object method",
                                         "All of the above",
                                         "None of the above",
                                         1);
    QuizQuestions Q9 = new QuizQuestions("A novice programmer was asked to write a method to count and  display the number of tokens of user’s input, below is the method the programmer wrote:"+"\n"+"import java.util.Scanner;"+"\n"+"public class Quiz2 {"+"\n"+"public static void getCount(){"+"\n"+"Scanner input = new Scanner(System.in);"+"\n"+"int count = 0;"+"\n"+"System.out.println(\"enter some text: \");"+"\n"+"while(input.hasNext()){"+"\n"+"count++;"+"\n"+"System.out.println(count);"+"\n"+"} }"+"\n"+"public static void main(String[] args){"+"\n"+"Quiz2.getCount();"+"\n"+"} }"+"\n"+"1) Will the above code compile?"+"\n"+"2) If the code compiled, what will the output be for the input (java is an object oriented language) ?" ,
                                         "no",
                                         "yes, and the output would be numbers (count) increasing depending on the number of words (Strings) inserted into the Scanner",
                                         "yes, and the output will be an infinite loop because the tokens are not being retrieved from the buffer using a method like next() or nextLine())",
                                         "yes, depends on what is entered into the Scanner input",
                                         3);
    QuizQuestions Q10 = new QuizQuestions("A software developer must design the classes with the goal of___",
                                         "low cohesion and high coupling",
                                         "high cohesion and low coupling",
                                         "no cohesion and low coupling",
                                         "low cohesion and low coupling",
                                         2);
    QuizQuestions Q11 = new QuizQuestions("Which method does not store the String value after the space?",
                                         "next()",
                                         "nextString()",
                                         "nextLine()",
                                         "Both 1 and 3",
                                         1);
    QuizQuestions Q12 = new QuizQuestions("_________ is a measure of the degree of independence between classes",
                                         "Cohesion",
                                         "Coupling",
                                         "All of the above",
                                         "None of the above",
                                         2);
    QuizQuestions Q13 = new QuizQuestions("Consider the following code segment"+"\n"+"public static void missingChar(){"+"\n"+"String[] alphabet = {\"a\",\"b\",\"c\",\"d\",\"e\",\"f\",\"g\",\"h\",\"i\",\"g\",\"k\",\"l\",\"m\",\"n\",\"o\",\"p\",\"q\",\"r\",\"s\",\"t\",\"u\",\"v\",\"w\",\"x\",\"y\",\"z\"};"+"\n"+"Random rand = new Random();"+"\n"+"// missing statement"+"\n"+"System.out.println(alphabet[k]); }"+"\n"+"It is supposed to print a randomly chosen letter of the alphabet. Any of the 26 letters can be chosen with equal probability.Assuming that Random class was properly imported, which of the following can replace  the // missing statement" ,
                                         "int k = rand.nextInt(26);",
                                         "int k = rand.nextInt(25);",
                                         "int k = rand.nextInt(26) + 1;",
                                         "int k = rand.nextInt(25) + 1;",
                                         1);
    QuizQuestions Q14 = new QuizQuestions("What is Test Driven Development(TDD)?",
                                         "TDD is a software development process that relies on a short development cycle which is write test , write code, refactor the code to pass the test",
                                         "-",
                                         "-",
                                         "-",
                                         1);
    QuizQuestions Q15 = new QuizQuestions("Which of the following describes Unit Testing correctly?",
                                         "Unit Testing is the testing of single entity (a method) ",
                                         "Unit Testing is the process of checking the functionality of the application whether it is working as per requirements",
                                         "Both of the above",
                                         "None of the above",
                                         1);
    QuizQuestions Q16 = new QuizQuestions("In TDD Test cases are written before writing code for some new functionality",
                                         "True",
                                         "False",
                                         "Depends",
                                         "",
                                         1);
    QuizQuestions Q17 = new QuizQuestions("n TDD Test cases are written instead of functional code",
                                         "True",
                                         "False",
                                         "none of these choices",
                                         "an array reference",
                                         2);
    QuizQuestions Q18 = new QuizQuestions("When should the unit test be written?",
                                         "Before writing the code",
                                         "Only when needed",
                                         "At the end when the application is ready",
                                         "None of the above",
                                         1);
    QuizQuestions Q19 = new QuizQuestions("In TDD code is written then tested thoroughly in very small unit",
                                         "True",
                                         "False",
                                         "1",
                                         "2.5",
                                         2);
    QuizQuestions Q20 = new QuizQuestions("What is the smallest unit you test/target in your Unit Testing",
                                         "Variables",
                                         "Class",
                                         "Method",
                                         "Package",
                                         3);
 
    QuizQuestions Q21 = new QuizQuestions("Test Driven Development have many advantages, mention two",
                                         "1) Each method is tested thoroughly which allows for less time debugging code later on 2) Ensures better planning of coding because each part of the code must be thought of before hand and a test written.",
                                         "Writing clear requirements, Development is done in small steps which means less debug time, Code is guaranteed to meet requirements as it is tested at least once",
                                         "any of these",
                                         "none",
                                         2);
    QuizQuestions Q22 = new QuizQuestions("Fixture includes tearDown() method which runs after all test methods get executed",
                                         "True",
                                         "False",
                                         "any of these",
                                         "public",
                                         2);    
    QuizQuestions Q23 = new QuizQuestions("What annotations from the following do you used before each test method?",
                                         "@Before",
                                         "@After",
                                         "@Test",
                                         "@TestMethod",
                                         3);    
    QuizQuestions Q24 = new QuizQuestions("Inheritance is also known as the",
                                         "Knows-a relationship",
                                         "Has-a relationship",
                                         "Uses-a relationship",
                                         "Is-a relationship",
                                         4);    
    QuizQuestions Q25 = new QuizQuestions("Which of the following is not a superclass/ subclass relationship",
                                         "Vehicle/Car",
                                         "Sailboat/Tugboat",
                                         "Employee/ HourlyEmployee",
                                         "None of the above",
                                         2);    
    QuizQuestions Q26 = new QuizQuestions("Does a subclass inherit both instance variables and methods?",
                                         "No, only instance variables are inherited",
                                         "No, only methods are inherited",
                                         "Yes, both are inherited",
                                         "Yes, but only one or the other are inherited",
                                         3);    
    QuizQuestions Q27 = new QuizQuestions("Static method can be overridden",
                                         "True",
                                         "False",
                                         "public void speak(String input)",
                                         "public speak(String input)",
                                         2);
    QuizQuestions Q28 = new QuizQuestions("private methods can be overridden",
                                         "True",
                                         "False",
                                         "To create an Object in memory",
                                         "All of these",
                                         2);
    QuizQuestions Q29 = new QuizQuestions("What is an advantage of polymorphism?",
                                         "The same program logic can be used with objects of several types",
                                         "Variables can be reused to save memory",
                                         "Constructing new object from old objects of a similar type saves time",
                                         "Polymorphism is a dangerous aspect of inheritance and should be avoided",
                                         1);
    QuizQuestions Q30 = new QuizQuestions("Overriding methods invoked by objects can be prevented using the modifier ______ in the method signature" ,
                                         "@Override",
                                         "static",
                                         "final",
                                         "public",
                                         3);
    QuizQuestions Q31 = new QuizQuestions("Can an object of child type be assigned to a variable of the parent type?, for example"+"\n"+"Card crd;"+"\n"+"BirthdayCard bd = new BirthdayCard(\"Lucinda\",42);"+"\n"+"crd = bd;",
                                         "No, there must be always an exact match between the variable and the object type",
                                         "No, but an object of a parent type can be assigned to a variable of child type",
                                         "Yes, any object can be assigned to any reference variable",
                                         "Yes, an object can be assigned to a reference variable of parent class",
                                         4);
    QuizQuestions Q32 = new QuizQuestions("What is polymorphism in Java?",
                                         "It is when a single variable is used with several different types of related objects at different places in a program",
                                         "It is when a program uses several different types of objects, each with its own variable",
                                         "It is when a single parent class has several methods with the same name but different parameter types",
                                         "It is when a class has several methods with the same name but different parameter types",
                                         1);
    QuizQuestions Q33 = new QuizQuestions("Static method can be overloaded",
                                         "True",
                                         "False",
                                         "Null",
                                         "Void",
                                         1);
    QuizQuestions Q34 = new QuizQuestions("Given that this code is valid"+"\n"+"new X();"+"\n"+"You can infer that X can be",
                                         "Concrete class",
                                         "Abstract class",
                                         "Both",
                                         "Neither",
                                         1);
    QuizQuestions Q35 = new QuizQuestions("Given that this code is valid"+"\n"+"X thing;   // a variable declaration statement"+"\n"+"You can infer that X can be",
                                         "Concrete class",
                                         "Abstract class",
                                         "Both",
                                         "Neither",
                                         3);
    QuizQuestions Q36 = new QuizQuestions("Given that this code is valid"+"\n"+"public void dosomething(X thing) {  ... }"+"\n"+"You can infer that X could be",
                                         "Concrete class",
                                         "Abstract class",
                                         "Both",
                                         "Neither",
                                         3);
    QuizQuestions Q37 = new QuizQuestions("Given that this code is valid"+"\n"+"public void doSomething(X thing){ ... }"+"\n"+"Things that my be passed as an argument to doSomething() method may be of what type?",
                                         "Type X only",
                                         "Type X or subtype of X",
                                         "Type X or supertype of X",
                                         "Type X, subtype or supertype of X",
                                         2);
    QuizQuestions Q38 = new QuizQuestions("Given that this code is valid"+"\n"+"X thing = new Y();"+"\n"+"What can you infer about the relationship between X and Y?",
                                         "Y is a subtype of X",
                                         "X is a subtype of Y",
                                         "Y is an object in X",
                                         "X is an object in X",
                                         1);
    QuizQuestions Q39 = new QuizQuestions("An interface may contain",
                                         "private static data and public abstract methods",
                                         "only public abstract methods",
                                         "public static final data and public abstract methods",
                                         "private static data and public final methods",
                                         3);
    QuizQuestions Q40 = new QuizQuestions("A class that implements an interface but does not declare all of the interface's methods must be declared",
                                         "public",
                                         "final",
                                         "private",
                                         "abstract",
                                         4); 
	QuizQuestions Q41 = new QuizQuestions("An interface that is used by classes whose objects can be sorted depending on a certain field of its objects is called",
                                         "comparable",
                                         "capacity",
                                         "operator",
                                         "quantity",
                                         1);
    QuizQuestions Q42 = new QuizQuestions("When a class implements an interface, the class receives the interface's default concrete implementation if  it does not override them",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         1);    
    QuizQuestions Q43 = new QuizQuestions("When you enhance an existing interface with default methods, any class that implemented the original interface will break",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         2);    
    QuizQuestions Q44 = new QuizQuestions("A class can extend one parent class or implement an interface, but not both",
                                         "True",
                                         "False",
                                         "-",
                                         "-",
                                         2);    
    QuizQuestions Q45 = new QuizQuestions("An interface can have a private modifier",
                                         "True",
                                         "False",
                                         "-",
                                         "-",
                                         2);    
    QuizQuestions Q46 = new QuizQuestions("Which principle of SOLID does the following code break?" + "\n" + "public class Person {" + "\n" + "private Long personId;" + "\n" + "private String firstName;" + "\n" + "private String lastName;" + "\n" + "private String age;" + "\n" + "private String accountNumber;" + "\n" + "private String accountName; }" + "\n" + "public class Account {" + "\n" + "private Long guid;" + "\n" + "private String status;" + "\n" + "private String type; }" ,
                                         "Single Responsibility Principle",
                                         "Open Closed Principle",
                                         "Liskov's Substitution Principle",
                                         "Dependency Inversion Principle",
                                         1);    
    QuizQuestions Q47 = new QuizQuestions("Application specific interfaces are better than general purpose interface is",
                                         "Single Responsibility Principle",
                                         "Open/ Close Principle",
                                         "Liskov's Substitution Principle",
                                         "Interface Segregation Principle",
                                         4);
    QuizQuestions Q48 = new QuizQuestions("What is the singleton design pattern in Java?",
                                         "Singleton pattern in Java is a pattern which allows only one instance of Singleton class available in the whole application",
                                         "-",
                                         "-",
                                         "-",
                                         1);
    QuizQuestions Q49 = new QuizQuestions("A class having high maintainability will tend to have which of the following characteristics",
                                         "High testability, low cohesiveness",
                                         "High testability, High cohesiveness",
                                         "Low testability, high cohesiveness",
                                         "Low testability, low cohesiveness",
                                         2);
    QuizQuestions Q50 = new QuizQuestions("Mention two possible results of a duplicated code?",
                                         "Poor maintainability, hard to fix bugs and hard to keep up with changes.",
                                         "-",
                                         "-",
                                         "-",
                                         1);
    QuizQuestions Q51 = new QuizQuestions("Using existing exceptions makes the program less robust",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         2);
    QuizQuestions Q52 = new QuizQuestions("The new exception class should extend RuntimeException if the program should be required to handle the exception.",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         2);
    QuizQuestions Q53 = new QuizQuestions("The try block must be followed by a finally block",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         2);
    QuizQuestions Q54 = new QuizQuestions("A finally block typically releases resources acquired in the corresponding try block",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         1);
    QuizQuestions Q55 = new QuizQuestions("Like any other class, an exception class can contain fields and methods.",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         1);
    QuizQuestions Q56 = new QuizQuestions("The throw point of an exception specifies the point at which the exception must be handled",
                                         "true",
                                         "false",
                                         "-",
                                         "-",
                                         2);

    Quiz quiz = new Quiz();
   
    quiz.addQuizQuestions(Q1);
    quiz.addQuizQuestions(Q2);
    quiz.addQuizQuestions(Q3);
    quiz.addQuizQuestions(Q4);
    quiz.addQuizQuestions(Q5);
    quiz.addQuizQuestions(Q6);
    quiz.addQuizQuestions(Q7);
    quiz.addQuizQuestions(Q8);
    quiz.addQuizQuestions(Q9);
    quiz.addQuizQuestions(Q10);
    quiz.addQuizQuestions(Q11);
    quiz.addQuizQuestions(Q12);
    quiz.addQuizQuestions(Q13);
    quiz.addQuizQuestions(Q14);
    quiz.addQuizQuestions(Q15);
    quiz.addQuizQuestions(Q16);
    quiz.addQuizQuestions(Q17);
    quiz.addQuizQuestions(Q18);
    quiz.addQuizQuestions(Q19);
    quiz.addQuizQuestions(Q20);
    quiz.addQuizQuestions(Q31);
    quiz.addQuizQuestions(Q32);
    quiz.addQuizQuestions(Q33);
    quiz.addQuizQuestions(Q34);
    quiz.addQuizQuestions(Q35);
    quiz.addQuizQuestions(Q36);
    quiz.addQuizQuestions(Q37);
    quiz.addQuizQuestions(Q38);
    quiz.addQuizQuestions(Q39);
    quiz.addQuizQuestions(Q40);
    quiz.addQuizQuestions(Q41);
    quiz.addQuizQuestions(Q42);
    quiz.addQuizQuestions(Q43);
    quiz.addQuizQuestions(Q44);
    quiz.addQuizQuestions(Q45);
    quiz.addQuizQuestions(Q46);
    quiz.addQuizQuestions(Q47);
    quiz.addQuizQuestions(Q48);
    quiz.addQuizQuestions(Q49);
    quiz.addQuizQuestions(Q50);
    quiz.addQuizQuestions(Q51);
    quiz.addQuizQuestions(Q52);
    quiz.addQuizQuestions(Q53);
    quiz.addQuizQuestions(Q54);
    quiz.addQuizQuestions(Q55);
    quiz.addQuizQuestions(Q56);
    
    quiz.drawQuestion();

  }
}
