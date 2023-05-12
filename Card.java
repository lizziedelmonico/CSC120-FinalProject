
import java.util.ArrayList;

/* The cards hidden throughout the island */
public class Card {
    public String name; //The name of the card
    public String description; //Description of the card
    public int desigNum; //Designation number of the card
    public static ArrayList<Card> cards; //ArrayList of all the cards in the game

    public static Card treeOfPlenty = new Card("Tree of Plenty", "a tree that bears all sorts of fruit. No matter how musch you harvest, it will be full the nxt day.", 1); //The tree of plenty card
    public static Card pickpocket = new Card("Pickpocket", "steals a random card from the target player's inventory", 2); //The pickpocket card
    public static Card aqua = new Card("Sage's Aquamarine", "its owner will have many intelligent friends and keep those friendships for their entire lives.", 3); //The sage's aquamarine card
    public static Card riskyDice = new Card("Risky Dice", "a 20-sided die with one skull face and 19 star faces. When you roll a star, great things happen, but rolling the skull will be bad enough to cancel out all of the previous great events.", 4); //The risky dice card
    public static Card bankBook = new Card("Lucky Bankbook", "refrain from using the little things of good luck in your daily life, and you can accumulate and convert them into cash", 5); //The lucky bankbook card
    public static Card angelsBreath = new Card("Angel's Breath", "cures one person of all wounds and ills, restoring them to perfect health.", 6); //The angel's breath card
    public static Card swordTruth = new Card("Sword of Truth", "splits in two anything and anyone deceitful. The sword will shatter when used to cut something true.", 7); //The sword of truth card
    public static Card jade = new Card("Night Jade", "a jewel 'blessed' by the devil. When danger is about to befall its owner, it will deflect it to someone else.", 8); //The night jade card
    public static Card beach = new Card("Plot of Beach", "transports you to the entrance of a cave. The cave changes its pattern at each visit.", 9); //The plot of beach card
    public static Card pond = new Card("Mystery Pond", "release one fish into this pond, and there will be one more fish of that type the next day.", 10); //The mystery pond card

    /* Constructor for the Card class
     * @name the name of the card
     * @description the description of the card
     * @desigNum the designation number of the card (where it will be placed in the binder)
     */
    public Card(String name, String description, int desigNum){
        this.name = name;
        this.description = description;
        this.desigNum = desigNum;
    }

    /* Adds all of the cards to the ArrayList*/
    public static void allCards(){
        cards.add(treeOfPlenty);
        cards.add(pickpocket);
        cards.add(aqua);
        cards.add(riskyDice);
        cards.add(bankBook);
        cards.add(angelsBreath);
        cards.add(swordTruth);
        cards.add(jade);
        cards.add(beach);
        cards.add(pond);
    }
   
    /* Converts the string typed in by the user into the name of a card
     * @param the string typed in by the user
     */
    public static Card stringToCard(String name){
        for (Card c : cards){
            if (name.equals(c.name)){
                return c;
            }
        } 
        return null;
    }

}