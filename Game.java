import java.util.Scanner;
import java.util.ArrayList;

public class Game{

    static Scanner scanner = new Scanner(System.in);
    public static Player p;
    public Location spawnPoint;
    public Location forest;
    public Location village;
    public Location love;
    public Location gambling;
    public Location prizes;
    public Location magic;
    public Location port;

    //starts running the game
    public static void start(){
        boolean nameSet = false;
        String name;
        int user_input;
        
        
        System.out.println("---------------------------------");
        System.out.println("~WELCOME TO GREED ISLAND~");

        do{
            System.out.println("---------------------------------");
            System.out.println("What's your name?");
            name = scanner.next();
            System.out.println("Hello, " + name + "!");
            nameSet = true;

        }while(!nameSet);

        System.out.println("My name is Eta! Welcome to Greed Island! Would you like to hear the rules of this game? \n 1.) Yes \n 2.) No");
        user_input = scanner.nextInt();

        if (user_input == 1){
            System.out.println("Great! \n The goal of Greed Island is to explore and collect the 10 cards hidden throughout the island.\n Each card can be added to your binder once collected. If you want to materialize a card, please remember that it cannot be returned to its previous state!\n Good luck and have fun!");
            System.out.println("---------------------------------");
        }
        if (user_input == 2){
          System.out.println("Alright! Enjoy the game!");
          System.out.println("---------------------------------");
        }
    }

    public void placeCard(){
        forest.placeCard(Card.treeOfPlenty);
        village.placeCard(Card.pickpocket);
        love.placeCard(Card.aqua);
        gambling.placeCard(Card.riskyDice);
        gambling.placeCard(Card.bankBook);
        prizes.placeCard(Card.angelsBreath);
        prizes.placeCard(Card.swordTruth);
        magic.placeCard(Card.jade);
        port.placeCard(Card.beach);
        port.placeCard(Card.pond);
    }

    public void gameComplete(ArrayList<Card> inventory){
        if (inventory.size() == 10){
            System.out.println("Congrats!! You successfully collected all 10 cards!!");
        }
    }

    public static void main(String[] args){
        Game game = new Game();
        game.placeCard();
        Card.addCards();
        p = new Player(Player.name, Location.spawnPoint);
        Game.start();
        
        Scanner scanner = new Scanner(System.in);
        String user_Command;
        System.out.println("Enter Command");
        user_Command = scanner.nextLine();
        if (user_Command == "Move"){
            p.move();
        } else if (user_Command == "View Inventory"){
            p.viewBinder();
        } else if (user_Command == "Pick up card"){
            p.addCard();
        } else if (user_Command == "Examine surroundings"){
            p.examineLocation();
        }

        System.out.println("Thank you for visiting Greed Island!");
        scanner.close();
    }


    

}
