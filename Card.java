
import java.util.ArrayList;

public class Card {
    private String name;
    private String description;
    private int desigNum;
    public ArrayList<Card> cards;

    public Card(String name, String description, int desigNum){
        this.name = name;
        this.description = description;
        this.desigNum = desigNum;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public int getDesigNum(){
        return this.desigNum;
    }


    public void examineCard(String name, String description, int desigNum){
        System.out.println(name + ": " + description + " Designation Number: " + desigNum);
    }

    public static void addCards(){
        allCards.add(treeOfPlenty);
        allCards.add(pickpocket);
        allCards.add(aqua);
        allCards.add(riskyDice);
        allCards.add(bankBook);
        allCards.add(angelsBreath);
        allCards.add(swordTruth);
        allCards.add(jade);
        allCards.add(beach);
        allCards.add(pond);
    }

    public static ArrayList<Card> allCards = new ArrayList<Card>();

    public static Card treeOfPlenty = new Card("Tree of Plenty", "a tree that bears all sorts of fruit. No matter how musch you harvest, it will be full the nxt day.", 1);
    public static Card pickpocket = new Card("Pickpocket", "steals a random card from the target player's inventory", 2);
    public static Card aqua = new Card("Sage's Aquamarine", "its owner will have many intelligent friends and keep those friendships for their entire lives.", 3);
    public static Card riskyDice = new Card("Risky Dice", "a 20-sided die with one skull face and 19 star faces. When you roll a star, great things happen, but rolling the skull will be bad enough to cancel out all of the previous great events.", 4);
    public static Card bankBook = new Card("Lucky Bankbook", "refrain from using the little things of good luck in your daily life, and you can accumulate and convert them into cash", 5);
    public static Card angelsBreath = new Card("Angel's Breath", "cures one person of all wounds and ills, restoring them to perfect health.", 6);
    public static Card swordTruth = new Card("Sword of Truth", "splits in two anything and anyone deceitful. The sword will shatter when used to cut something true.", 7);
    public static Card jade = new Card("Night Jade", "a jewel 'blessed' by the devil. When danger is about to befall its owner, it will deflect it to someone else.", 8);
    public static Card beach = new Card("Plot of Beach", "transports you to the entrance of a cave. The cave changes its pattern at each visit.", 9);
    public static Card pond = new Card("Mystery Pond", "release one fish into this pond, and there will be one more fish of that type the next day.", 10);
}