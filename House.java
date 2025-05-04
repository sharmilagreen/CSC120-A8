/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(boolean hasDiningRoom, String name, String address, int nFloors){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
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
    new House(true, "YourMom", "YourMom St", 3);
  }

}
