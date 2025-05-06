/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 1000;
        nSugarPackets = 1000;
        nCreams = 1000;
        nCups = 1000;
    }

    public Cafe(String name, String address){
        super(name, address, 1);
        System.out.println("You have built a cafe: ☕");
        nCoffeeOunces = 1000;
        nSugarPackets = 1000;
        nCreams = 1000;
        nCups = 1000;
    }

    @Override
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee()");
        System.out.println(" + restock()");
    }

    public void sellCoffee(int number, int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size*number;
        this.nSugarPackets -= nSugarPackets*number;
        this.nCreams -= nCreams*number;
        nCups -= number;
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        nCups -= 1;
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {

    }
    
}