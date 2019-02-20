public class Novel extends ReadingMaterial{
  private String mainCharacterName;
  private String theme;
  private String novelistName;

  public Novel(String title, int numberOfPages, String mainCharacterName, String theme, String novelistName){
    super(title, numberOfPages);
    setMainCharacterName(mainCharacterName);
    setTheme(theme);
    setNovelistName(novelistName);
  }
  public void setMainCharacterName(String mainCharacterName){
    this.mainCharacterName = Checks.formatString(Checks.stringLength(mainCharacterName));
  }
  public String getMainCharacterName(){
    return mainCharacterName;
  }
  public void setTheme(String theme){
    this.theme = Checks.formatString(Checks.stringLength(theme));
  }
  public String getTheme(){
    return theme;
  }
  public void setNovelistName(String novelistName){
    this.novelistName = Checks.formatString(Checks.stringLength(novelistName));
  }
  public String getNovelistName(){
    return novelistName;
  }
  public void displayDetails(){
    System.out.println("- Novel Details -");
    System.out.println("Title: " + getTitle());
    System.out.println("Edition Number: " + getMainCharacterName());
    System.out.println("Author Name: " + getTheme());
    System.out.println("Subject: " + getNovelistName());
  }  
}
