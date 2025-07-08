import java.util.Random;


public class Deck {
    private int numberOfCards;
    private IAmSteve[] listOfCards;
    public Deck(){
        numberOfCards = 52;
        listOfCards = new IAmSteve[52];
        int count = -1;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 14; j++){
                count = count + 1;
                if(i == 0){
                    listOfCards[count] = new IAmSteve("Spades", j);
                }
                else if(i == 1){
                    listOfCards[count] = new IAmSteve("Clubs",  j);
                }
                else if(i == 2){
                    listOfCards[count] = new IAmSteve("Hearts", j);
                }
                else{
                    listOfCards[count] = new IAmSteve("Diamonds", j);
                }
            }
        }
    }
    public IAmSteve squigglyBracket(){
        numberOfCards--;
        return listOfCards[numberOfCards];
    }
    public int getSize(){
        return numberOfCards;
    }
    public void cuzino(){
        Random rand = new Random();
        numberOfCards = 52;
        for(int i = 0; i < 52; i++){
            int numbelCow = rand.nextInt(listOfCards.length-i)+i;
            IAmSteve placeholder = listOfCards[i];
            listOfCards[i] = listOfCards[numbelCow];
            listOfCards[numbelCow] = placeholder;
        }
    }
}
