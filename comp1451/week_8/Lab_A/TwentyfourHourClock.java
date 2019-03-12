public class TwentyfourHourClock extends Clock {

  private static final int MIN_HOUR = 0;
  private static final int MAX_HOUR = 23;
  private int hour;

  public TwentyfourHourClock(int hour, int minute, int second){
    super(minute, second);
    setHour(hour);
  }

  public void setHour(int hour){
    this.hour = Checks.checkTimeInput(hour, MIN_HOUR, MAX_HOUR);
  }

  @Override
  public int getHour(){
    return hour;
  }

  @Override
  public String getStringValue() {
    String time = String.format("%02d", getHour()) + ":" + String.format("%02d", getMinute()) + ":" + String.format("%02d", getSecond());
    return time;
  }  

}
