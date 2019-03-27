/**
* @author A00964363
*/

public class Main {

	public static void main(String[] args) {
    NumberReader o = new NumberReader();
    try {
      o.inputTotal();
    } catch (InvalidInputException i) {
      i.getMessage();
    }
	}
}
