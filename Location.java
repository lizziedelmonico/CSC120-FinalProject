import java.util.ArrayList;
import java.util.Scanner;

public class Location{
    public String name;
    public String description;
    public ArrayList<Card> cards;
    static Scanner scanner = new Scanner(System.in);

    public Location(String name, String description){
        this.name = name;
        this.description = description;
        this.cards = new ArrayList<Card>();
    }

    public void greeting(Location currentLocation){
        switch(currentLocation.name){
            case ("Spawn Point"):{
                System.out.println("You are now at the Spawn Point. There are no cards located here, so go explore the rest of the island!");
            }   case("Forest"):{
                System.out.println("You are now in the forest. There is one card located here.");
            }   case("Village"):{
                System.out.println("You are now in the village. There is one card located here.");
            }   case("City of Love"):{
                System.out.println("You are now in the City of Love. There is one card located here.");
            }   case("Gambling City"):{
                System.out.println("You are now in the Gambling City. There are two cards located here.");
            }   case("City of Prizes"):{
                System.out.println("You are now in the City of Prizes. There are two cards located here.");
            }   case("City of Magic"):{
                System.out.println("You are now in the City of Magic. There is one card located here.");
            }   case("Port City"):{
                System.out.println("You are now in the Port City. There are two cards located here.");
            } 

        }
    }

    public void examineLocation(Location currentLocation){
        Scanner scanner = new Scanner(System.in);
        int user_choice;
        switch(currentLocation.name){
            case ("Forest"):{
                System.out.println("You look around and notice a small hole in one of the trees. Would you like to get closer?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("You walk closer and find a card hidden in the hole!\nType 'Pick up card' to add it to your binder!");
                } else if (user_choice == 2){
                    System.out.println("Are you sure? Try examining your surroundings again.");
                }
            } case ("Village"):{
                System.out.println("You look around and see an old man who looks like he needs help. Do you help him?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("He thanks you for your help and hands you a card.\nType 'Pick up card' to add it to your binder.");
                } else if (user_choice ==2){
                    System.out.println("Are you sure? He might give you a card... Try examining your surroundings again");
                }
            } case ("City of Love") : {
                System.out.println("You see a beautiful woman waving to you. Do you walk up to her?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("The woman says that you caught her eye and hands you a gift!\nType 'Pick up card' to add it to your binder.");
                } if (user_choice == 2){
                    System.out.println("Are you sure? Try examining your surroundings again");
                }
            } case ("Gambling City") : {
                System.out.println("You see two mysterious men hosting games. Whose game do you join first?\n 1.) The tall man's game\n 2.) The short man's game");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("The tall man greets you and welcomes you to his game.\nYou must pick between two cards. Which one do you choose?\n 1.) King of Spades\n 2.) Queen of Hearts");
                    user_choice = scanner.nextInt();
                    if (user_choice == 1){
                        System.out.println("You chose the correct card! The tall man hands you a card to keep.\nType 'Pick up card' to add it to your binder.");
                    } if (user_choice == 2){
                        System.out.println("You chose the wrong card! Examine your surroundings to try again.");
                    }
                } if (user_choice == 2){
                    System.out.println("The short man greets you and welcomes you to his game.\nYou must walk through one door. Which one do you choose?\n 1.) The door with a star on it\n 2.) The door with a circle on it");
                    user_choice = scanner.nextInt();
                    if (user_choice == 1){
                        System.out.println("You chose the correct door and won a card!\nType 'Pick up card' to add it to your binder.");
                    } if (user_choice == 2){
                        System.out.println("You chose the wrong door! Examine your surroundings to try again.");
                    }
                }
            } case ("City of Prizes") : {
                System.out.println("A child runs up to you and asks if you can help find their dog. Do you help them?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("The child thanks you for your help and offers you a card! Type 'Pick up card' to add it to your binder!");
                    System.out.println("While you were helping the child, a wealthy woman saw your act of kindness and offers you a card.\nType 'Pick up card' to add it to your binder!");
                } if (user_choice == 2){
                    System.out.println("Are you sure? Try examining your surroundings again");
                }
            } case ("City of Magic") : {
                System.out.println("You see small stands selling magical objects. At one of the stands, you see a book glimmering. Do you walk over to it?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("The old man behind the stand offers you the book for free!\nInside, you find a card being used as a bookmark!\nType 'Pick up card' to add it to your binder.");
                } if (user_choice == 2){
                    System.out.println("Are you sure? Try examining your surroundings again.");
                }
            } case ("Port City") : {
                System.out.println("You see a beautiful shell on the sand. Do you pick it up?\n 1.) Yes\n 2.) No");
                user_choice = scanner.nextInt();
                if (user_choice == 1){
                    System.out.println("You pick up the shell and find a card hidden inside it!\nType 'Pick up card' to add it to your binder.");
                    System.out.println("After you pick up the card, a child asks to trade the shell for a card.\nYou agree and he hands you a card! Type 'Pick up card' to add it to your binder.");
                }if (user_choice == 2){
                    System.out.println("Are you sure? Try examining your surroundings again.");
                }
            }
        } scanner.close();
    }

    public void placeCard(Card c){
        this.cards.add(c);
    }

    public boolean hasCard(Card c){
        if (cards.contains(c)){
            return true;
        } else {
            return false;
        }
    }

    public void removeCard(Card c, Location currentLocation){
        this.cards.remove(c);
    }

    public static Location spawnPoint = new Location("Spawn Point", "A hut in the middle of a meadow.");
    public static Location forest = new Location("Forest", "A mysterious forest that appears to never end... or does it?");
    public static Location village = new Location("Village", "A small village hidden deep within the forest.");
    public static Location love = new Location("City of Love", "A busy city full of love and heartbreak.");
    public static Location gambling = new Location("Gambling City", "A city full of risks and rewards.");
    public static Location prizes = new Location("City of Prizes", "A city full of expensive trinkets and wonders.");
    public static Location magic = new Location("City of Magic", "A city full of magical items.");
    public static Location port = new Location("Port City", "A smaller city right by the ocean.");

    public static Location stringToLocation(){
        String location;
        System.out.println("Where would you like to go?\n -- Forest\n -- Village\n -- City of Love\n -- Gambling City\n -- City of Prizes\n -- City of Magic\n -- Port City");
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
    
    


}
