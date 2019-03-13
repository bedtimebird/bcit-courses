public class AudioBook extends AudioMaterial {

  private int totalNumberOfPages;
  private String authorName;

  public AudioBook(String name, double playingTimeInMinutes, int totalNumberOfPages, String authorName){
    super(name, playingTimeInMinutes);
    setTotalNumberOfPages(totalNumberOfPages);
    setAuthorName(authorName);
  }
  public void setTotalNumberOfPages(int totalNumberOfPages){
    this.totalNumberOfPages = Checks.minInt(totalNumberOfPages);
  }
  public int getTotalNumberOfPages(){
    return totalNumberOfPages;
  }
  public void setAuthorName(String authorName){
    this.authorName = Checks.lengthString(Checks.formatString(authorName));
  }
  public String getAuthorName(){
    return authorName;
  }
  

}
