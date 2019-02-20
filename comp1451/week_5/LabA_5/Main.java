/**
* @author A00964363
*/
public class Main {
	public static void main(String[] args) {
    TextBook tex1 = new TextBook("The Dark Forest", 400, 2, "liu cixin", "Science Fiction");
    Magazine mag1 = new Magazine("The Economist", 94, "weekly", 1114549);
    Novel nov1 = new Novel("Frankenstein", 280, "Victor Frankenstein", "Gothic Fiction", "Mary Shelley");
    Library lib1 = new Library();
    lib1.loadLibrary(tex1, nov1, mag1);
    lib1.displayMagazineDetails();
    lib1.displayAllMaterialDetails();

	}
}
