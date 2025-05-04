/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements {

    private Hashtable<String, Boolean> collection;
    private int collectionSize;
    
    public Library(String name, String address, int nFloors, int collectionSize) {
      super(name, address, nFloors);
      collection = new Hashtable<>(collectionSize);
      this.collectionSize = collectionSize;
      System.out.println("You have built a library: 📖");
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
