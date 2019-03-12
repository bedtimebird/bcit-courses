public class TwelveHourClock extends Clock {
  
  private static final int MIN_HOUR = 0;
  private static final int MAX_HOUR = 11;
  private String meridiem;
  private int hour;

  public TwelveHourClock(int hour, int minute, int second, String meridiem){
    super(minute, second);
    setMeridiem(meridiem);
    setHour(hour);
  }
  public void setMeridiem(String meridiem){
    String test = meridiem.toUpperCase();
    if (test.equals("AM") || test.equals("PM")) {
      this.meridiem = test;
    } else {
      this.meridiem = "AM";
    }
  }
  public String getMeridiem(){
    return meridiem;
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
    String time = String.format("%02d", getHour()) + ":" + String.format("%02d", getMinute()) + ":" + String.format("%02d", getSecond()) + " " + getMeridiem();
    return time;
  }

}
