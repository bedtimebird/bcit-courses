import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.lang.String;
import java.util.Random;

public class Quiz
{
    //private InputReader scanner; 
    private int position = 0;
    private int score = 0;
  
  private static ArrayList<QuizQuestions> quiz;
  
  public Quiz()
  {
    quiz = new ArrayList<QuizQuestions>();
  }
  public static ArrayList<QuizQuestions> getQuestions()
  {
    return quiz;
  }
  public static void setQuestions(ArrayList<QuizQuestions> quiz)
  {
    quiz = quiz;
  }
  public void addQuizQuestions(QuizQuestions quizs)
  {
    if(quizs != null) 
    {
      quiz.add(quizs);
    } else {
      System.out.println("There are no questions");
    }
  }
  
  public void randomNumber() {
    Random rand = new Random();
    int n = rand.nextInt(quiz.size());
    position = n;
  }
  
  public void drawQuestion()
  {
    if(quiz.get(position) != null)
    {
		System.out.println(" ");
    System.out.println("Question: " + quiz.get(position).getQ1());
        System.out.println("Option 1: " + quiz.get(position).getA1());
        System.out.println("Option 2: " + quiz.get(position).getA2());
        System.out.println("Option 3: " + quiz.get(position).getA3());
        System.out.println("Option 4: " + quiz.get(position).getA4());
        makeSelection();
    }
  }
  
  
  
  public void makeSelection()
  {
    System.out.println("Select the correct option.");
    	Scanner scanner = new Scanner(System.in);
   		String username = scanner.nextLine();
        int response = Integer.parseInt(username); 
    
          if (response == quiz.get(position).getAnswer()) {
          score += 1;
          System.out.println("You selected option: " + response);
          System.out.println("That is the correct answer!");
          System.out.println("Your score is: " + score);    
          //quiz.remove();
          position += 1;
          randomNumber();
          drawQuestion();
          System.out.println(" "); 
        } else {
          System.out.println("You selected option: " + response);
          System.out.println("That is the incorrect answer :<");
          score -= 1;
          System.out.println("Your score is: " + score);   
          randomNumber();
          drawQuestion();
          System.out.println(" "); 
        }
  }
}
