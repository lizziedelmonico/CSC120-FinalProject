import java.util.ArrayList;

public class Player{
    ArrayList cards = new ArrayList<String>();
    ArrayList inventory = new ArrayList<String>();
    String name;

    public void book(){
        inventory.add("Card Binder");
    }

    public void gain(String card){
        cards.remove(card);
        inventory.add(card);
    }

    /*
     * Allows Player to move between locations.
     */
    public String move(String direction){
        //will take in String direction such as "north" "south" "east" "west" and transport Player to the corresponding location if that direction is feasable.
        return direction;
    }

    public void grab(String item){
        inventory.add(item);
    }

    public String drop(String item){
        inventory.remove(item);
        String dropped = ("You are no longer carrying " + item);
        return dropped;
    }
}