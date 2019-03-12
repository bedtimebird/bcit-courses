/**
* @author A00964363
*/
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
    ArrayList<Displayable> timers =  new ArrayList<Displayable>();
    timers.add(new Date(2, 7, 2017));
    timers.add(new TwelveHourClock(2, 8, 3, "am"));
    timers.add(new TwelveHourClock(10, 18, 35, "pm"));
    timers.add(new TwentyfourHourClock(5, 1, 0));
    timers.add(new TwentyfourHourClock(18, 10, 5));
    for (Displayable clocks : timers){System.out.println(clocks.getStringValue());}
	}
}
