/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

    private Hashtable<String, Boolean> collection;
    private int collectionSize;
    private boolean hasElevator;

  /**
   * Constructs a new Library with a specified name, address, and number of Floors, as well as a number of books to fit into its collection
   * Also initializes an hashtable of the collection
   * 
   * @param name The name of the house
   * @param address the address of the house
   * @param nFloors the number of floors the house has
   * @param collectionSize the size of the library's collection
   */    
    public Library(String name, String address, int nFloors, int collectionSize, boolean hasElevator) {
      super(name, address, nFloors);
      this.hasElevator = hasElevator;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }
    /**
     * Constructs a 4-floor Library with specified collection size and elevator access.
     * @param name the name of the library
     * @param address the address of the library
     * @param collectionSize initial capacity of the book collection
     * @param hasElevator whether the library has an elevator
     */
    public Library(String name, String address, int collectionSize, boolean hasElevator) {
      super(name, address, 4);
      this.hasElevator = hasElevator;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }

    /**
     * Constructs a 4-floor Library with an elevator, with specified collection size.
     * @param name the name of the library
     * @param address the address of the library
     * @param collectionSize initial capacity of the book collection
     */
    public Library(String name, String address, int collectionSize) {
      super(name, address, 4);
      this.hasElevator = true;
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
    }

    /**
     * Displays available actions for this Library.
     */
    @Override
    public void showOptions() {
      super.showOptions();
      System.out.println(" + checkOutBook(String book)");
      System.out.println(" + returnBook(String book)");
    }


    /**
     * Moves to a specific floor if the library has an elevator.
     * @param floorNum the floor number to go to
     */
    @Override
    public void goToFloor(int floorNum) {
        if (!hasElevator) {
            System.out.println("This library doesn't have an elevator. Use goUp() or goDown().");
            return;
        }
        super.goToFloor(floorNum);
     }

      /**
       * Adds a title to the library's collection
       * @param title the title of the book being added to the collection hashtable, automatically value is set to true so that it can be checked out
       */          
      public void addTitle(String title){
        collection.put(title, true);
      }

    /**
     * Removes a title from the library's collection
     * @param title the title of the book being removed from the collection hashtable
     */      
      public String removeTitle(String title){
        collection.remove(title);
        return title;
      }

    /**
     * Checks out a book from the collection, setting its value in the hashtable to false
     * @param title the title to be checked out
     */    
      public void checkOut(String title){
        collection.put(title, false);
      }

    /**
     * Returns a book to the collection, setting its value in the hashtable to true
     * @param title the title to be returned
     */       
      public void returnBook(String title){
        collection.put(title, true);
      }

    /**
     * Checks if a title is in the collection
     * @param title the title to be checked
     * @return whether or not the collection contains the title
     */   
      public boolean containsTitle(String title){
        return collection.containsKey(title);
      }

    /**
     * Checks if a title is available to be checked out
     * @param title the title to be checked
     * @return whether or not the title has a true or false value
     */       
      public boolean isAvailable(String title){
        return collection.get(title);
      }

    /**
     * Prints out the collection of the library
     */   
      public void printCollection(){
        System.out.println(collection.toString());
      }
      

      public static void main(String[] args) {

      }
  
  }
