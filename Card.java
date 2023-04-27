
public class Card {
    private String name;
    private String description;
    private int desigNum;

    public Card(String name, String description, int desigNum){
        this.name = name;
        this.description = description;
        this.desigNum = desigNum;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getDesigNum(){
        return this.desigNum;
    }

    public void setDesigNum(int desigNum){
        this.desigNum = desigNum;
    }

    public void examineCard(String name, String description, int desigNum){
        System.out.println(name + ": " + description + " Designation Number: " + desigNum);
    }

}
