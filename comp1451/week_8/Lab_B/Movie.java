public class Movie extends AudioMaterial {

  private String directorName;
  private int numberOfActors;

  public Movie(String name, double playingTimeInMinutes, String directorName, int numberOfActors){
    super(name, playingTimeInMinutes);
    setDirectorName(directorName);
    setNumberOfActors(numberOfActors);
  }
  public void setDirectorName(String directorName){
    this.directorName = Checks.lengthString(Checks.formatString(directorName));
  }
  public String getDirectorName(){
    return directorName;
  }
  public void setNumberOfActors(int numberOfActors){
    this.numberOfActors = Checks.minInt(numberOfActors);
  }
  public int getNumberOfActors(){
    return numberOfActors;
  }

}
