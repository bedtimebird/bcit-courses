import java.util.ArrayList;

public class Transportation{

  private ArrayList<Vehicle> transport;

  public Transportation(){
    transport = new ArrayList<Vehicle>();
  }

  public void loadCollection(Airplane airplane, Boat boat, Car car){
    transport.add(airplane);
    transport.add(boat);
    transport.add(car);
  }

  public void displayAllDetails(){
    System.out.println(" ");
    System.out.println("List of transportation methods: ");
   for (Vehicle mode:transport) {
     if (mode instanceof Airplane) {
       System.out.println(" ");
       ((Airplane) mode).displayDetails();
     }
     if (mode instanceof Boat){
       System.out.println(" ");
       ((Boat) mode).displayDetails();
     }
     if(mode instanceof Car){
       System.out.println(" ");
       ((Car) mode).displayDetails();
     }
   }
  }

  public void displayAirplaneDetails(){
    System.out.println(" ");
    System.out.println("List of all airplanes: ");
    for(Vehicle plane : transport){
      if(plane instanceof Airplane){
        System.out.println(" ");
        ((Airplane) plane).displayDetails();
      }
    }
  }
}
