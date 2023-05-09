import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public static String name;
    public ArrayList<Card> inventory;
    Location currentLocation;
    static Scanner scanner = new Scanner(System.in);

    public Player(String name, Location currentLocation){
        this.inventory = new ArrayList<Card>();
        this.currentLocation = currentLocation;
    }

    public Location stringToLocation(){
        String location;
        System.out.println("Where would you like to go?");
        location = scanner.next();
        if (location == "Forest"){
            return Location.forest;
        } else if (location == "Village"){
            return Location.village;
        } else if (location == "City of Love"){
            return Location.love;
        } else if (location == "Gambling City"){
            return Location.gambling;
        } else if (location == "City of Prizes"){
            return Location.prizes;
        } else if (location == "City of Magic"){
            return Location.magic;
        } else if (location == "Port City"){
            return Location.port;
        } else {
            return null;
        }
    }

    public void move(){
        Location newLocation = stringToLocation();
        if (newLocation == null){
            System.out.println("This location does not exist, silly goose!");
        } else if (newLocation == currentLocation){
            System.out.println("You're already here, silly goose!");
        } else {
            this.currentLocation = newLocation;
        }
    }
    
    public void addCard(Card c){
        if (currentLocation.hasCard(c)){
            this.currentLocation.removeCard(c, this.currentLocation);
            System.out.println("Adding card to binder... ");
            inventory.add(c);
            System.out.println("Successfully added " + c.getName() + " to the binder.");
        }

    }


    public void viewBinder(){
        System.out.print(inventory);
    }

    public boolean binderFull(){
        if (inventory.size() == 10){
            return true;
        }
        else{
            return false;
        }
    }

    public void examineLocation() {
    }

}