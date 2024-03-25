public class Card {
    private int value;
    private String type;

    public Card(int value, String type) {
        this.value = value;
        this.type = type;
    }

    public int getValue(){
        return this.value;
    }

    public String getType(){
        return this.type;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public void setType(String type) {
        this.type = type;
    }
}
