import java.util.Random;


public class BungalowsOrT {
    static Random rand = new Random();
    static int[] bungalow = new int[9];
    static int interstellarintergalaticiterationscorp = 0;

    public static void usefulshorts(int[] list){
        bungalow = list;
        while (correctithnk() == false){
            shufflecuzcasino();
            printCutesyList();
        }
    }
    public static boolean correctithnk(){
        int countes = 0;
        for(int i = 0; i < bungalow.length-1; i++){
            if(bungalow[i] < bungalow[i+1]){
                countes++;
            }
        }
        if(countes+1 == bungalow.length){
            System.out.println("it sorted :)");
            return true;
    
        }
        return false;
    }   
            
    public static void printCutesyList(){
        System.out.print('[');
        for(int i = 0; i < bungalow.length; i++){
            System.out.print(bungalow[i]+", ");
        }
        System.out.print(']');
        System.out.println();
    }        

    public static void shufflecuzcasino(){
        for(int i = 0; i < bungalow.length; i++){
            int numbelCow = rand.nextInt(bungalow.length);
            int placeholder = bungalow[i];
            bungalow[i] = bungalow[numbelCow];
            bungalow[numbelCow] = placeholder;
        }
    }
    public static void main(String[] args){
        for(int i = 0; i < bungalow.length; i++){
            bungalow[i] = rand.nextInt(100);
        }
        while (correctithnk() == false){
            shufflecuzcasino();
            printCutesyList();
            interstellarintergalaticiterationscorp++;
            
        }
        System.out.println(interstellarintergalaticiterationscorp);
    }


}
