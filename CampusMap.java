import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new House("Hubbard House", "1 Sharmila St", 3));
        myMap.addBuilding(new Library("Neilson Library", "7 Maya Dr", 5, true));
        myMap.addBuilding(new Cafe("Campus Cafe", "10 Sharmila St", 1));
        myMap.addBuilding(new House("Chase House", "2 Jordan Ln"));
        myMap.addBuilding(new Library("Hillyer Library", "12 Jordan Ln", 3, false));
        myMap.addBuilding(new Cafe("Compass Cafe", "8 Sharmila St", 1));
        myMap.addBuilding(new House("Morrow House", "3 Sharmila St", 4));
        myMap.addBuilding(new Library("Science Library", "15 Kayla Rd", 6, true));
        myMap.addBuilding(new Cafe("Blue Cafe", "17 Kayla Rd", 2));
        myMap.addBuilding(new House("Park House", "19 Buddy Ave", 3));
        System.out.println(myMap);
    }
    
}
