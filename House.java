/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;
  private boolean hasElevator;

  public House(boolean hasDiningRoom, String name, String address, int nFloors, boolean hasElevator){
    super(name, address, nFloors);
    this.hasElevator = hasElevator;
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public House(String name, String address, int nFloors){
    super(name, address, nFloors);
    this.hasElevator = false;
    this.hasDiningRoom = false;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public House(String name, String address){
    super(name, address, 3);
    this.hasElevator = false;
    this.hasDiningRoom = false;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }
  
  @Override
  public void showOptions() {
    super.showOptions();
    System.out.println(" + lockDoors()");
    System.out.println(" + unlockDoors()");
  }

  @Override
  public void goToFloor(int floorNum) {
      if (!hasElevator) {
          System.out.println("This library doesn't have an elevator. Use goUp() or goDown().");
          return;
      }
      super.goToFloor(floorNum);
   }

  public void moveIn(Student s){
    residents.add(s);
  }

  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }

  public int nResidents(){
    return residents.size();
  }

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
