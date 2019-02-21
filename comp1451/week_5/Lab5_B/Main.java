/**
* @author A00964363
*/
class Main {
  public static void main(String[] args) {
    Airplane air1 = new Airplane(2000, "Jet", "Stream", 20000);
    Boat boat1 = new Boat(1985, "Boat", "McBoatface", true);
    Car car1 = new Car(2015, "BMW", "M3", 400);
    Transportation transport1 = new Transportation();
    transport1.loadCollection(air1, boat1, car1);
    transport1.displayAirplaneDetails();
    transport1.displayAllDetails();
  }
}
