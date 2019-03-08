class Main {
  public static void main(String[] args) {
    Labour lab1 = new Labour("first labour project", 50.0, 20.0, 15.00, "regular", "experienced");
    System.out.println(lab1.toString());
    System.out.println("------");
    LabourAndMaterial lab2 = new LabourAndMaterial("second labour and material project", 80.0, 20.0, 20.00, "regular", "experienced", 575.0, 5.0, 16.0);
    System.out.println(lab2.toString());
    System.out.println("------");
    LabourAndMaterialAndEquipment lab3 = new LabourAndMaterialAndEquipment("second labour and material project", 80.0, 20.0, 20.00, "regular", "inexperienced", 575.0, 5.0, 16.0, 5000, 20);
    System.out.println(lab3.toString());
  }
}
