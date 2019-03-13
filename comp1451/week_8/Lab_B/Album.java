public class Album extends AudioMaterial {

  private int numberOfSongs;
  private String artistName;

  public Album(String name, double playingTimeInMinutes, int numberOfSongs, String artistName){
    super(name, playingTimeInMinutes);
    setNumberOfSongs(numberOfSongs);
    setArtistName(artistName);
  }

  public void setNumberOfSongs(int numberOfSongs){
    this.numberOfSongs = Checks.minInt(numberOfSongs);
  }
  public int getNumberOfSongs(){
    return numberOfSongs;
  }
  public void setArtistName(String artistName){
    this.artistName = Checks.lengthString(Checks.formatString(artistName));
  }
  public String getArtistName(){
    return artistName;
  }
  

}
