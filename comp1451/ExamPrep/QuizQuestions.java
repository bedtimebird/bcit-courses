import java.util.ArrayList;
public class QuizQuestions
{
 
    private String Q1;
    private String A1;
    private String A2;
    private String A3;
    private String A4;
    private int Answer;
    
    public QuizQuestions() {
    }
    
    public QuizQuestions(String Q1, String A1, String A2, String A3, String A4, int Answer) {
        setQ1(Q1);
        setA1(A1);
        setA2(A2);
        setA3(A3);
        setA4(A4);
        setAnswer(Answer);
    }
    public String getQ1() {
        return Q1;
    }
    public void setQ1(String Q1) {
        this.Q1 = Q1;
    }
    public String getA1() {
        return A1;
    }
    public void setA1(String A1) {
        this.A1 = A1;
    }
    public String getA2() {
        return A2;
    }
    public void setA2(String A2) {
        this.A2 = A2;
    }
    public String getA3() {
        return A3;
    }
    public void setA3(String A3) {
        this.A3 = A3;
    }
    public String getA4() {
        return A4;
    }
    public void setA4(String A4) {
        this.A4 = A4;
    }
    public int getAnswer() {
        return Answer;
    }
    public void setAnswer(int Answer) {
        this.Answer = Answer;
    }
}
