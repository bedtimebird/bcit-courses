public class TextBook extends ReadingMaterial{
  private int editionNumber;
  private String authorName;
  private String subject;

  public TextBook(String title, int numberOfPages, int editionNumber, String authorName, String subject){
    super(title, numberOfPages);
    setEditionNumber(editionNumber);
    setAuthorName(authorName);
    setSubject(subject);
  }
  public void setEditionNumber(int editionNumber){
    this.editionNumber = Checks.numberLength(editionNumber);
  }
  public int getEditionNumber(){
    return editionNumber;
  }
  public void setAuthorName(String authorName){
    this.authorName = Checks.formatString(Checks.stringLength(authorName));
  }
  public String getAuthorName(){
    return authorName;
  }
  public void setSubject(String subject){
    this.subject = Checks.formatString(Checks.stringLength(subject));
  }
  public String getSubject(){
    return subject;
  }
  public void displayDetails(){
    System.out.println("- Textbook Details -");
    System.out.println("Title: " + getTitle());
    System.out.println("Edition Number: " + getEditionNumber());
    System.out.println("Author Name: " + getAuthorName());
    System.out.println("Subject: " + getSubject());
  }

}
