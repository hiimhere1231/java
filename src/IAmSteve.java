public class IAmSteve{
    private int value;
    private String suit;
    public IAmSteve(String suit, int value){
        this.suit = suit;
        this.value = value;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        if (value >= 11 && value <= 13) {
            return 10;
        }
        else if(value == 14){
            return 1;
        }
        else if(value == 1){
            return 11;
        }
        return value;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public void setValue(int value){
        this.value = value;
    }
    public String toString(){
        String cardType = "";
        if(value == 11){
            cardType = "Jack";
        }
        else if(value == 12){
            cardType = "Queen";
        }
        else if(value == 13){
            cardType = "King";
        }
        else if(value == 1){
            cardType = "Ace";
        }
        else if(value == 14){
            cardType = "Ace";
        }
        else{
            return value+" of "+suit;
        }
        return cardType+" of "+suit;
    }
}