import java.util.ArrayList;

public class Binder{
    ArrayList<Card> cards;

    public Binder(){
        cards = new ArrayList<Card>();
    }

    public void addCard(Card c){
        System.out.println("Adding card to binder... ");
        cards.add(c);
        System.out.println("Successfully added " + c.getName() + " to the binder.");
    }

    public void removeCard(Card c){
        System.out.println("Removing card from binder... ");
        cards.remove(c);
        System.out.println("Successfully removed " + c.getName() + " from the binder.");
    }

    public static void main(String[] args){
        Binder myBinder = new Binder();
        System.out.println(myBinder);
    }
}
