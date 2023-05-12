import java.util.ArrayList;
import java.util.Scanner;

/*The player is the user currently playing the game */
public class Player {
    public ArrayList<Card> inventory; //The cards that the player has collected so far
    Location currentLocation; //The current location of the player
    Map island; //The island the game takes place in
    

    /* Constructor for the Player class
     * @island the island the game takes place in
     * @spawnPoint the spawn point where the player begins their journey
     */
    public Player(Map island, Location spawnPoint){
        this.inventory = new ArrayList<Card>();
        this.island = island;
        this.currentLocation = spawnPoint;
    }

    /* Allows the player to move around to different locations depending on if their current location and desired location are connected
     * @param the desired location typed in by the user
     */
    public void move(String location){
        Location newLocation = this.island.stringToLocation(location);
        if (newLocation == null){
            System.out.println("This location does not exist, silly goose!");
        } else if (newLocation == currentLocation){
            System.out.println("You're already here, silly goose!");
        } else if (this.island.canMoveLocation(this.currentLocation, newLocation)){
            this.currentLocation = newLocation;
            Location.greeting(currentLocation);
        } else {
            System.out.println("Sorry! You can't go this way.");
        }
    }
    
    /* Allows the player to move from the forest to the village if they have picked up the tree of plenty card
     * @param the forest location where the player must collect the tree of plenty card
     * @param the village location that the player can only enter after collecting the tree of plenty cardf
     */
    public void hike(Location forest, Location village){
        if (this.inventory.contains(Card.treeOfPlenty)){
            this.currentLocation = village;
            Location.greeting(village);
        } else if (!this.inventory.contains(Card.treeOfPlenty)){
            this.currentLocation = forest;
            System.out.println("You may not move to the village without the Tree of Plenty card");
        }
    }

    /* Checks if the player's binder has all ten cards */
    public boolean binderFull(){
        if (inventory.size() == 10){
            return true;
        }
        else{
            return false;
        }
    }

    /* Allows the player to pick up a card that they have earned
     * @param the name of the card being picked up
     * @param the scanner being used in the Game class
     * @param the spawn point where the player starts the game
     * @param the game that the player is currently playing
     */
    public void takeCard(String cardName, Scanner scanner, Location spawnPoint, Game game){
        Card c = Card.stringToCard(cardName);
        if (c == null){
            System.out.println("This card doesn't exist, silly goose!");
        } else if (inventory.contains(c)){
            System.out.println("You already have this card, silly goose!");
        } else if (this.currentLocation.hasCard(c)){
            this.inventory.add(c);
            this.currentLocation.removeCard(c, this.currentLocation);
            System.out.println(c.name + " card successfully added to binder!");
        }
    }

    /* Allows the player to examine the surroundings of their current location to collect cards
     * @param the scanner being used in the Game class
     */
    public void examineLocation(Scanner scanner){
        int user_choice;
        if(currentLocation.name.equals("Forest")) {
            System.out.println("You look around and notice a small hole in one of the trees. Would you like to get closer?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("You walk closer and find the Tree of Plenty card hidden in the hole!\nType 'Pick up tree of plenty' to add it to your binder");
            } else if (user_choice == 2){
                System.out.println("Are you sure? Try examining your surroundings again.");
            }
        } else if(currentLocation.name.equals("Village")) {
            System.out.println("You look around and see an old man who looks like he needs help. Do you help him?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("He thanks you for your help and hands you the Pickpocket card!\nType 'Pick up pickpocket' to add it to your binder!");
            } else if (user_choice ==2){
                System.out.println("Are you sure? He might give you a card... Try examining your surroundings again");
            }
        } else if(currentLocation.name.equals("City of Love")) {
            System.out.println("You see a beautiful woman waving to you. Do you walk up to her?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("The woman says that you caught her eye and hands you the Sage's Aquamarine card!\nType 'Pick up sage's aquamarine' to add it to your binder!");
            } if (user_choice == 2){
                System.out.println("Are you sure? Try examining your surroundings again");
            }
        } else if(currentLocation.name.equals("Gambling City")) {
            System.out.println("You see two mysterious men hosting games. Whose game do you join first?\n 1.) The tall man's game\n 2.) The short man's game");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("The tall man greets you and welcomes you to his game.\nYou must pick between two cards. Which one do you choose?\n 1.) King of Spades\n 2.) Queen of Hearts");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("You chose the correct card! The tall man hands you the Risky Dice card to keep.\nType 'Pick up risky dice' to add it to your binder!");
                } if (user_choice == 2){
                    System.out.println("You chose the wrong card! Examine your surroundings to try again.");
                }
            } if (user_choice == 2){
                System.out.println("The short man greets you and welcomes you to his game.\nYou must walk through one door. Which one do you choose?\n 1.) The door with a star on it\n 2.) The door with a circle on it");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("You chose the correct door and won the Lucky Bankbook card!\nType 'Pick up lucky bankbook' to add it to your binder!");
                } if (user_choice == 2){
                    System.out.println("You chose the wrong door! Examine your surroundings to try again.");
                }
            }
        } else if(currentLocation.name.equals("City of Prizes")) {
            System.out.println("A child runs up to you and asks if you can help find their dog. Do you help them?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("The child thanks you for your help and offers you the Angel's Breath card!\nType 'Pick up angel's breath' to add it to your binder!");
                System.out.println("While you were helping the child, a wealthy woman saw your act of kindness and offers you the Sword of Truth card.\nType 'Pick up sword of truth' to add it to your binder!");
            } if (user_choice == 2){
                System.out.println("Are you sure? Try examining your surroundings again");
            }
        } else if(currentLocation.name.equals("City of Magic")) {
            System.out.println("You see small stands selling magical objects. At one of the stands, you see a book glimmering. Do you walk over to it?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                inventory.add(Card.jade);
                System.out.println("The old man behind the stand offers you the book for free!\nInside, you find the Night Jade card being used as a bookmark!\nType 'Pick up night jade' to add it to your binder!");
            } if (user_choice == 2){
                System.out.println("Are you sure? Try examining your surroundings again.");
            }
        } else if(currentLocation.name.equals("Port City")) {
            System.out.println("You see a beautiful shell on the sand. Do you pick it up?\n 1.) Yes\n 2.) No");
            user_choice = scanner.nextInt();
            if (user_choice == 1){
                System.out.println("You pick up the shell and find a card hidden inside it!\nType 'Pick up plot of beach' to add it to your binder!");
                System.out.println("After you pick up the card, a child asks to trade the shell for a card.\nYou agree and he hands you a card! Type 'Pick up mystery pond' to add it to your binder!");
            }if (user_choice == 2){
                System.out.println("Are you sure? Try examining your surroundings again.");
            }
        }
        
    }   

}