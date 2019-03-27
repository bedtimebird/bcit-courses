public class NumberReader extends InputReader {

  public void inputTotal() throws InvalidInputException{
    InputReader input = new InputReader();
    int sum = 0;
    boolean result = true;
    try {
      while(result){
        System.out.println("Input any positive whole number or 0 to exit:");
        int value = input.getNumber();
        if (value != 0){
          sum += value;
        } else {
          System.out.println("Exit.");
          result = false;
        }
      }
    } catch (InvalidInputException i) {
      i.getMessage();
      i.printStackTrace();
    } catch (Exception e) {
      e.getMessage();
    }
    System.out.println("Sum of all numbers inputed: " + sum);
  }


}
