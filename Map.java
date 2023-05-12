import com.google.common.graph.*;

/* A graph of the island and its locations */
public class Map{

    Location spawnPoint;
    Location forest;
    Location village;
    Location love;
    Location gambling;
    Location prizes;
    Location magic;
    Location port;
    public ImmutableGraph<Location> myGraph;

    /* Constructor for the Map class
     * @param all of the locations included in the game
     */
    public Map(Location spawnPoint, Location forest, Location village, Location love, Location gambling, Location prizes, Location magic, Location port){

        this.myGraph = GraphBuilder.undirected()
          .<Location>immutable()
          .putEdge(spawnPoint, love)
          .putEdge(spawnPoint, prizes)
          .putEdge(spawnPoint, forest)
          .putEdge(forest, village)
          .putEdge(love, gambling)
          .putEdge(gambling, prizes)
          .putEdge(prizes, magic)
          .putEdge(magic, port)
          .build();

    }

    /* Checks to see if the player can move from one location to another
     * @param the player's current location
     * @param the player's desired location
     */
    public boolean canMoveLocation(Location currentLocation, Location newLocation){
        return myGraph.hasEdgeConnecting(currentLocation, newLocation);
    }

    /* Converts a string typed in by user to a location on the map
     * @param the string typed in by the user
     */
    public Location stringToLocation(String name){
        for(Location location : this.myGraph.nodes()){
            if (name.equals(location.name.toLowerCase())){
                return location;
            }
        } return null;
        
    }

    /* Checks to see if the playaer can move from the forest to the village
     * @param the current location of the user
     * @param the forest location
     * @param the village location
     */
    public Location forestToVillage(Location currentLocation, Location forest, Location village){
        if (currentLocation.name.equals(forest.name)){
            return village;
        } else if (currentLocation.name.equals(village.name)){
            return forest;
        } else {
            return null;
        }
    }
}