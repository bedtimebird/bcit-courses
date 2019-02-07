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
  public void setUp() throws Exception {
    dateTest = new Date(9,9,2014);
    dayTest = 9;
    monthTest = 9;
    yearTest = 2014;
  }

  @AfterEach
  public void tearDown() throws Exception {
    dateTest = null;
  }

  @Test
  public void testGetDay() {
    assertEquals(9, dateTest.getDay());
  }

  @Test
  public void testSetDayNegative() {
    dateTest.setDay(-1);
    assertEquals(1, dateTest.getDay());
  }

  @Test
  public void testSetDayLowerBounds() {
    dateTest.setDay(1);
    assertEquals(1, dateTest.getDay());
  }

  @Test
  public void testSetDayUpperBounds() {
    dateTest.setDay(31);
    assertEquals(31, dateTest.getDay());
  }

  @Test
  public void testSetDayOverAllowed() {
    dateTest.setDay(32);
    assertEquals(1, dateTest.getDay());
  }  

  @Test
  public void testSetDayUnderAllowed() {
    dateTest.setDay(0);
    assertEquals(1, dateTest.getDay());
  }  
  
  @Test
  public void testGetMonth() {
    assertEquals(9, dateTest.getMonth());
  }

  @Test
  public void testSetMonthNegative() {
    dateTest.setMonth(-1);
    assertEquals(1, dateTest.getMonth());
  }

  @Test
  public void testSetMonthLowerBounds() {
    dateTest.setMonth(1);
    assertEquals(1, dateTest.getMonth());
  }

  @Test
  public void testSetMonthUpperBounds() {
    dateTest.setMonth(12);
    assertEquals(12, dateTest.getMonth());
  }

  @Test
  public void testSetMonthOverAllowed() {
    dateTest.setMonth(13);
    assertEquals(1, dateTest.getMonth());
  }  

  @Test
  public void testSetMonthUnderAllowed() {
    dateTest.setMonth(0);
    assertEquals(1, dateTest.getMonth());
  }    
  
  @Test
  public void testGetYear() {
    assertEquals(2014, dateTest.getYear());
  }

  @Test
  public void testSetYearNegative() {
    dateTest.setMonth(-1);
    assertEquals(1900, dateTest.getYear());
  }

  @Test
  public void testSetYearLowerBounds() {
    dateTest.setYear(1900);
    assertEquals(1900, dateTest.getYear());
  }

  @Test
  public void testSetYearUpperBounds() {
    dateTest.setMonth(2019);
    assertEquals(2019, dateTest.getYear());
  }

  @Test
  public void testSetYearOverAllowed() {
    dateTest.setYear(2020);
    assertEquals(1900, dateTest.getYear());
  }  

  @Test
  public void testSetYearUnderAllowed() {
    dateTest.setYear(1899);
    assertEquals(1900, dateTest.getYear());
  }      

  @Test
  public void testCheckDateInputDayWrongMax() {
    dateTest.checkDateInput(22, 1, 65);
    assertEquals(22, dateTest.getDay());
  }

  
}
