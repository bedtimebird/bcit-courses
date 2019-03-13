public abstract class AudioMaterial implements Comparable<AudioMaterial> {

  private String name;
  private double playingTimeInMinutes;

  public AudioMaterial(String name, double playingTimeInMinutes){
    setName(name);
    setPlayingTimeInMinutes(playingTimeInMinutes);
  }
  public void setName(String name){
    this.name = Checks.lengthString(Checks.formatString(name));
  }
  public String getName(){
    return name;
  }
  public void setPlayingTimeInMinutes(double playingTimeInMinutes){
    this.playingTimeInMinutes = Checks.minDouble(playingTimeInMinutes);
  }
  public double getPlayingTimeInMinutes(){
    return playingTimeInMinutes;
  }
  @Override
  public int compareTo(AudioMaterial audioMaterial) {
    return(int)(this.getPlayingTimeInMinutes() - audioMaterial.getPlayingTimeInMinutes());
  }
  @Override
  public String toString(){
    String line = "Name: " + getName() + "\n" + "Playing time: " + getPlayingTimeInMinutes() + " (minutes)";
    return line;
  }

}
