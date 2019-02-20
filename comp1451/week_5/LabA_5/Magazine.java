public class Magazine extends ReadingMaterial{
  
  private String scheduledPublications;
  private int numberOfSubscribers;

  public Magazine(String title, int numberOfPages, String scheduledPublications, int numberOfSubscribers){
    super(title, numberOfPages);
    setScheduledPublications(scheduledPublications);
    setNumberOfSubscribers(numberOfSubscribers);
  }
  public void setScheduledPublications(String scheduledPublications){
    this.scheduledPublications = Checks.formatString(Checks.stringLength(scheduledPublications));;
  }
  public String getScheduledPublications(){
    return scheduledPublications;
  }
  public void setNumberOfSubscribers(int numberOfSubscribers){
    this.numberOfSubscribers = Checks.numberLength(numberOfSubscribers);
  }
  public int getNumberOfSubscribers(){
    return numberOfSubscribers;
  }
  public void displayDetails(){
    System.out.println("- Magazine Details -");
    System.out.println("Title: " + getTitle());
    System.out.println("Scheduled publications: " + getScheduledPublications());
    System.out.println("Number of subscribers: " + getNumberOfSubscribers());
  }
}
