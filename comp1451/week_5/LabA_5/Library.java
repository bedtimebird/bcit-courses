import java.util.ArrayList;

public class Library{
  private ArrayList<ReadingMaterial> literature;

  public Library(){
    literature = new ArrayList<ReadingMaterial>();
  }

  public void loadLibrary(TextBook textbook, Novel novel, Magazine magazine){
    literature.add(textbook);
    literature.add(novel);
    literature.add(magazine);
  }

  public void displayAllMaterialDetails(){
    System.out.println(" ");
    System.out.println("List of library contents: ");
   for (ReadingMaterial lit:literature) {
     if (lit instanceof TextBook) {
       System.out.println(" ");
       ((TextBook) lit).displayDetails();
     }
     if (lit instanceof Novel){
       System.out.println(" ");
       ((Novel) lit).displayDetails();
     }
     if(lit instanceof Magazine){
       System.out.println(" ");
       ((Magazine) lit).displayDetails();
     }
   }
  }

  public void displayMagazineDetails(){
    System.out.println(" ");
    System.out.println("List of magazines in library: ");
    for(ReadingMaterial mags : literature){
      if(mags instanceof Magazine){
        System.out.println(" ");
        ((Magazine) mags).displayDetails();
      }
    }
  }

}
