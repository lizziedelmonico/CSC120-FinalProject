import java.util.Scanner;

public class Game{

    public static Player p;
    public Location spawnPoint;
    public Location forest;
    public Location village;
    public Location love;
    public Location gambling;
    public Location prizes;
    public Location magic;
    public Location port;

    /* The constructor for the game which includes all of the locations on the island and their information */
    public Game(){
        this.spawnPoint = new Location("Spawn Point", "A hut in the middle of a meadow.");
        this.forest = new Location("Forest", "A mysterious forest that appears to never end... or does it?");
        this.village = new Location("Village", "A small village hidden deep within the forest.");
        this.love = new Location("City of Love", "A busy city full of love and heartbreak.");
        this.gambling = new Location("Gambling City", "A city full of risks and rewards.");
        this.prizes = new Location("City of Prizes", "A city full of expensive trinkets and wonders.");
        this.magic = new Location("City of Magic", "A city full of magical items.");
        this.port = new Location("Port City", "A smaller city right by the ocean.");   
    }

    /* Places cards to the locations where they begin */
    public void placeCards(){
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

    /* Prints out the starting information */
    public static void start(){
        System.out.println("---------------------------------");
        System.out.println("~WELCOME TO GREED ISLAND~");
        System.out.println("---------------------------------");
        System.out.println("My name is Eta! Welcome to Greed Island!");
        System.out.println("The goal of Greed Island is to explore and collect the 10 cards hidden throughout the island.\n Each card can be added to your binder once collected.\nBasic commands in this game include:\n-- Move to 'location': allows you to walk to accessible locations\n-- Examine surroundings: allows you to look around and spot any interesting people/items\n-- Pick up 'card': allows you to pick up the card you've collected\n-- Hike: allows you to move from the Forest to the Village if you meet the requirements\nFrom this location you may walk to the Forest or the City of Love!");
        System.out.println("---------------------------------");
    }

    /* The main game loop */
    public static void main(String[] args){
        Game game = new Game(); //starts a new game
        game.placeCards(); //places all of the cards to their starting locations
        Map islandMap = new Map(game.spawnPoint, game.forest, game.village, game.love, game.gambling, game.prizes, game.magic, game.port); //cretes the map of the island
        p = new Player(islandMap, game.spawnPoint); //creates the new player
        Game.start(); //prints out the starting information
        
        Scanner scanner = new Scanner(System.in); //creates a new scanner for user input
        String user_Command = "";

        /* The main game loop */
        while (p.inventory.size() != 10){
            System.out.println("Enter Command");
            user_Command = scanner.nextLine();
            user_Command.toLowerCase().trim();
            if (user_Command.startsWith("Move to")){
                p.move(user_Command.substring(8));
            } else if (user_Command.equals("Examine surroundings")){
                p.examineLocation(scanner);
            } else if (user_Command.startsWith("Pick up")){
                p.takeCard(user_Command.substring(8), scanner, game.spawnPoint, game);
            } else if (user_Command.equals("Hike")){
                p.hike(game.forest, game.village);
            }
        } 

        /* Checks to see if the player meets the requirements for winning the game */
        if (p.inventory.size() == 10){
            System.out.println("Congrats!! You successfully collected all 10 cards!\nThank you for visiting Greed Island!");
            
        } 
        
    } 
    

}
