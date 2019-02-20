public class ReadingMaterial{
  private String title;
  private int numberOfPages;

  public ReadingMaterial(String title, int numberOfPages) {
    setTitle(title);
    setNumberOfPages(numberOfPages);
  }
  public void setTitle(String title) {
    this.title = Checks.formatString(Checks.stringLength(title));
  }
  public String getTitle(){
    return title;
  }
  public void setNumberOfPages(int numberOfPages){
    this.numberOfPages = Checks.numberLength(numberOfPages);
  }
  public int getNumberOfPages(){
    return numberOfPages;
  }

}
