/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;

    /**
     * Constructs a House with all fields specified.
     * @param hasDiningRoom whether the house has a dining room
     * @param name the name of the house
     * @param address the address of the house
     * @param nFloors the number of floors in the house
     * @param hasElevator whether the house has an elevator
     */  
  public House(boolean hasDiningRoom, String name, String address, int nFloors, boolean hasElevator){
    super(name, address, nFloors);
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }


    /**
     * Constructs a House with no dining room or elevator.
     * @param name the name of the house
     * @param address the address of the house
     * @param nFloors the number of floors in the house
     */  
  public House(String name, String address, int nFloors){
    super(name, address, nFloors);
    this.hasElevator = false;
    this.hasDiningRoom = false;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }


    /**
     * Constructs a default House with 3 floors, no dining room, and no elevator.
     * @param name the name of the house
     * @param address the address of the house
     */
  public House(String name, String address){
    super(name, address, 3);
    this.hasElevator = false;
    this.hasDiningRoom = false;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }
 
  /**
  * Displays available actions for this House.
   */
  @Override
  public void showOptions() {
    super.showOptions();
    System.out.println(" + lockDoors()");
    System.out.println(" + unlockDoors()");
  }

  /**
   * Moves to the specified floor if the house has an elevator.
   * @param floorNum the desired floor number
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
   * Adds a student to the list of residents.
   * @param s the student to move in
   */   
  public void moveIn(Student s){
    residents.add(s);
  }

  /**
   * Removes a student from the list of residents.
   * @param s the student to move out
   * @return the student who moved out
   */  
  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  /**
   * Returns whether the house has a dining room.
   * @return true if there is a dining room
   */  
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  /**
   * Returns the number of residents in the house.
   * @return the number of residents
   */  
  public int nResidents(){
    return residents.size();
  }

  /**
   * Checks whether a student is a resident of the house.
   * @param s the student to check
   * @return true if the student is a resident
   */  
  public boolean isResident(Student s){
    for(Student k: residents){
      if(k==s){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new House(true, "YourMom", "YourMom St", 3, false);
  }

}
