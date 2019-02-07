import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {
  private Time time;

  @Before
  public void setUp() throws Exception {
    t1 = new Time(16,44,45);

  }

  @After
  public void tearDown() throws Exception {
    t1 = null;
  }

  @Test
  public void testBuildTimeFromString() {
    Time t2 = new Time("23:01:31");
    assertEquals("23:01:31",t2.getTimeString());
  }

  @Test
  public void testGetHours() {
    assertEquals(16,t1.getHours());
  }
  
  @Test
  public void testGetMinutes() {
    assertEquals(44,t1.getMinutes());
  }

  @Test
  public void testGetSeconds() {
    assertEquals(45,t1.getSeconds());
  }

  @Test
  public void testSetHoursOverAllowed() {
    t1.setHours(24);
    assertEquals(16, t1.getHours());
  }

  @Test
  public void testSetHoursUnderAllowed() {
    t1.setHours(0);
    assertEquals(16, t1.getHours());
  }

  @Test
  public void testSetMinutesOverAllowed() {
    t1.setMinutes(61);
    assertEquals(44, t1.getMinutes());
  }

  @Test
  public void testSetMinutesUnderAllowed() {
    t1.setMinutes(0);
    assertEquals(44, t1.getMinutes());
  }

  @Test
  public void testSetSecondsOverAllowed() {
    t1.setSeconds(61);
    assertEquals(45, t1.getSeconds());
  }

  @Test
  public void testSetSecondsUnderAllowed() {
    t1.setSeconds(0);
    assertEquals(45, t1.getSeconds());
  }

  @Test
  public void testTimeString() {
    assertEquals("16:44:45", t1.getTimeString());
  }

  @Test
  public void testTimeInSec() {
    t1.inSeconds();
    assertEquals(60285, t1.inSeconds());
  }

  @Test
  public void testTimeInSecWithoutSec() {
    Time t3 = new Time("23:01");
    assertEquals(60285, t3.inSeconds());
  }

  @Test
  public void testGetTimePlusAdd() {
    Time t2 = new Time(12,30,30);
    assertEquals("12:31:30", t1.getTimePlus(60))
  }

  @Test
  public void testGetTimePlusSub() {
    Time t2 = new Time(12,30,30);
    assertEquals("12:29:30", t1.getTimePlus(-60))
  }
}
