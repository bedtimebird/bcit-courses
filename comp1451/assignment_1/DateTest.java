import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {
  private Date dateTest;
  private int dayTest;
  private int monthTest;
  private int yearTest;

  @BeforeEach
  void setUp() throws Exception {
    dateTest = new Date(9,9,2014);
    dayTest = 9;
    monthTest = 9;
    yearTest = 2014;
  }

  @AfterEach
  void tearDown() throws Exception {
    dateTest = null;
  }

  @Test
  void testGetDay() {
    assertEquals(09, dateTest.getDay());
  }

  @Test
  void testGetDayNegative() {
    dateTest.setDay(0);
    assertEquals(01, dateTest.getDay());
  }

  @Test
  void testGetDayBoundary() {
    dateTest.setDay(31);
    assertEquals(31, dateTest.getDay());
  }

  
}
