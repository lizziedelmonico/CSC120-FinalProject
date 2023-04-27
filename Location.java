import java.util.ArrayList;

public class Location{
    private String name;
    private String description;
    private ArrayList<String> cards = new ArrayList<String>();
    private int numOfCards;
    
    public Location (String name, String description){
        this.name = name;
        this.description = description; 
        cards = new ArrayList<String>();
    }

    public ArrayList<String> getcards(){
        return cards;
    }

    public void setCards(ArrayList<String> cards){
        this.cards = cards;
    }

    public void pickUpItem(String card){
        cards.remove(card);
    }

    public int numOfCards(){
        numOfCards = cards.size();
        return numOfCards;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void examineLocation(){
        if (numOfCards <= 0){
            System.out.println("Current Location: " + name + " Description: " + description + ". There are no cards in this location.");
        }
        else{
            System.out.println("Current location: " + name + "Description: " + description + ". " + numOfCards);
        }
    }
}
