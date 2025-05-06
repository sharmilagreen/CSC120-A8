/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

    private Hashtable<String, Boolean> collection;
    private int collectionSize;
    private boolean hasElevator;
    
    public Library(String name, String address, int nFloors, int collectionSize, boolean hasElevator) {
      super(name, address, nFloors);
      this.hasElevator = hasElevator;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }

    public Library(String name, String address, int collectionSize, boolean hasElevator) {
      super(name, address, 4);
      this.hasElevator = hasElevator;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }

    public Library(String name, String address, int collectionSize) {
      super(name, address, 4);
      this.hasElevator = true;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }

    @Override
    public void showOptions() {
      super.showOptions();
      System.out.println(" + checkOutBook(String book)");
      System.out.println(" + returnBook(String book)");
    }

    @Override
    public void goToFloor(int floorNum) {
        if (!hasElevator) {
            System.out.println("This library doesn't have an elevator. Use goUp() or goDown().");
            return;
        }
        super.goToFloor(floorNum);
     }

    public void addTitle(String title){
      collection.put(title, true);
    }

    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }
    
    public void checkOut(String title){
      collection.put(title, false);
    }

    public void returnBook(String title){
      collection.put(title, true);
    }

    public boolean containsTitle(String title){
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title){
      return collection.get(title);
    }

    public void printCollection(){
      System.out.println(collection.toString());
    }
    
  
    public static void main(String[] args) {

    }
  
  }
