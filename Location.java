import java.util.ArrayList;

public class Location{
    public String name;
    public String description;
    public ArrayList<Card> cards;

    /* Constructor for the Location class
     * @name the name of the location
     * @description the description of the location
     */
    public Location(String name, String description){
        this.name = name;
        this.description = description;
        this.cards = new ArrayList<Card>();
    }

    /* Prints out a greeting welcoming the player to the location they have just entered
     * @param the current location of the player 
     */
    public static void greeting(Location currentLocation){
            if (currentLocation.name.equals("Spawn Point")){
                System.out.println("You are now at the Spawn Point. There are no cards located here, so go explore the rest of the island!");
            } else if(currentLocation.name.equals("Forest")) {
                System.out.println("You are now in the forest. There is one card located here.");
                
            } else if(currentLocation.name.equals("Village")){
                System.out.println("You are now in the village. There is one card located here.");
                
            } else if(currentLocation.name.equals("City of Love")){
                System.out.println("You are now in the City of Love. There is one card located here.");
                
            } else if(currentLocation.name.equals("Gambling City")){
                System.out.println("You are now in the Gambling City. There are two cards located here.");
                
            } else if(currentLocation.name.equals("City of Prizes")){
                System.out.println("You are now in the City of Prizes. There are two cards located here.");
                
            } else if(currentLocation.name.equals("City of Magic")){
                System.out.println("You are now in the City of Magic. There is one card located here.");
                
            } else if(currentLocation.name.equals("Port City")){
                System.out.println("You are now in the Port City. There are two cards located here.");
                
            } 

        }


    /* Places each card in the location it begins at
     * @param the card being placed
     */
    public void placeCard(Card c){
        this.cards.add(c);
    }

    /* Checks to see if a location contains a card
     * @param the card being checked
     */
    public boolean hasCard(Card c){
        if (cards.contains(c)){
            return true;
        } else {
            return false;
        }
    }

    /* Removes a card from the location when it has been picked up by the player
     * @param the card being picked up by the user
     * @param the current location of the user
     */
    public void removeCard(Card c, Location currentLocation){
        this.cards.remove(c);
        if (currentLocation.name.equals("Spawn Point")){
        } else if (currentLocation.name.equals("Forest")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you may walk to the Village or return to the SpawnPoint.");
        } else if (currentLocation.name.equals("Village")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you must walk back through the Forest.");
        } else if (currentLocation.name.equals("City of Love")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you may walk to the Gambling City or return to the Spawn Point.");
        } else if (currentLocation.name.equals("Gambling City")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you may walk to the City of Prizes or return to the City of Love.");
        } else if (currentLocation.name.equals("City of Prizes")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you may walk to the City of Magic, or return to the Gambling City or Spawn Point.");
        } else if (currentLocation.name.equals("City of Magic")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you may walk to the Port City or return to the City of prizes.");
        } else if (currentLocation.name.equals("Port City")){
            System.out.println("Congrats! You found all of the cards in this location!\nNow you must walk back through the City of Magic.");
        }
    }



    
    


}
