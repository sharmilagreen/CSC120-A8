/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor for the Cafe class.
     * Initializes the Cafe with a name, address, and number of floors, and initializes the stock of the cafe (coffee, sugar, creams, cups) as a set amount each
     * @param name The cafe's name
     * @param address the cafe's address
     * @param nFloors the cafe's number of floors
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 1000;
        nSugarPackets = 1000;
        nCreams = 1000;
        nCups = 1000;
    }

    /**
     * Constructor for the Cafe class without nFloors
     * Initializes the Cafe with a name and address, setting the number of floors equal to 1
     * @param name The cafe's name
     * @param address the cafe's address
     */
    public Cafe(String name, String address){
        super(name, address, 1);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 1000;
        nSugarPackets = 1000;
        nCreams = 1000;
        nCups = 1000;
    }

    /**
     * Displays available actions for this Cafe.
     */
    @Override
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee()");
        System.out.println(" + restock()");
    }


    /**
     * Prevents customers from moving between floors in the Cafe.
     * @param floorNum the floor number attempted
     */
    @Override
    public void goToFloor(int floorNum) {
        if(nFloors > 1){
            System.out.println("You cannot travel to the other floors in a Cafe as a customer.");
        }
        else{
            System.out.println("This Cafe doesn't have any other floors to travel to.");
        }

     }

    /**
     * Sells coffee, decreasing inventory accordingly.
     * @param number number of cups sold
     * @param size ounces per cup
     * @param nSugarPackets number of sugar packets per cup
     * @param nCreams number of cream splashes per cup
     */
    public void sellCoffee(int number, int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size*number;
        this.nSugarPackets -= nSugarPackets*number;
        this.nCreams -= nCreams*number;
        nCups -= number;
    }

   /**
     * Sells coffee, decreasing the stock of the cafe
     * @param size the size of the coffee requested
     * @param nSugarPackets the amount of sugar packets requested for the coffee
     * @param nCream the amount of cream requested for the coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        nCups -= 1;
    }

    /**
     * Restocks the cafe
     * @param nCoffeeOunces the amount of coffee ounces being added to leftover stock
     * @param nSugarPackets the amount of sugar packets being added to leftover stock
     * @param nCream the amount of cream being added to leftover stock
     * @param nCups the amount of cups being added to leftover stock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {

    }
    
}