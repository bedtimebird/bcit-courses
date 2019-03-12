public abstract class Clock implements Displayable {
 
  public static final int MIN_UNIT = 0;
  public static final int MAX_UNIT = 59;
  private int minute;
  private int second;

  public Clock(int minute, int second){
    setMinute(minute);
    setSecond(second);
  }
  public void setMinute(int minute){
    this.minute = Checks.checkTimeInput(minute, MIN_UNIT, MAX_UNIT);
  }
  public int getMinute(){
    return minute;
  }
  public void setSecond(int second){
    this.second = Checks.checkTimeInput(second, MIN_UNIT, MAX_UNIT);
  }
  public int getSecond(){
    return second;
  }

  public abstract void setHour(int hour);
  public abstract int getHour();

}
