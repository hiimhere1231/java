import java.util.*;

public class JackBlack {
    public static boolean jasonMammoa = false;
    static Scanner scan = new Scanner(System.in);
    static Deck embellish = new Deck();
    static String[] chickenJockey = new String[]{"Chicken jockey", "the nether", "water bucket... RELEASE", "I... am Steve", "ender pearl", "La-la-la-lava, ch-ch-ch-chicken\r\n" + //
                "Steve's Lava Chicken, yeah, it's tasty as hell\r\n" + //
                "Ooh, mamacita, now you're ringin' the bell\r\n" + //
                "Crispy and juicy, now you're havin' a snack\r\n" + //
                "Ooh, super spicy, it's a lava attack", "FLINT AND STEEL", "this... is a crafting table", "As a child, I yearned for the mines", "these are the villagers, they love crushing loaf", "everyone wants to sue me when i hit them with my jeep grand cherokee"};
    public static void main(String[] args){
        System.out.println("Welcome to Jack Black!\nYour dealer is Steve!");
        System.out.println("I.... am Steve!");
        game();
    }
    public static boolean whatsUpAce = false;

    public static void game(){
        while(true){
            List<IAmSteve> kijetesantakalu = new ArrayList<>();
            List<IAmSteve> mokuPalisaSuli = new ArrayList<>();
            embellish.cuzino();
            kijetesantakalu.add(embellish.squigglyBracket());
            //IAmSteve aceHearts = new IAmSteve("Hearts", 1);
            //kijetesantakalu.add(aceHearts);
            kijetesantakalu.add(embellish.squigglyBracket());
            mokuPalisaSuli.add(embellish.squigglyBracket());
            mokuPalisaSuli.add(embellish.squigglyBracket());
            System.out.println("Your hand is:\n"+kijetesantakalu.get(0)+"\n"+kijetesantakalu.get(1));
            if(dennis(kijetesantakalu) == true){
                System.out.println("First we mine, then we craft. LET'S MINECRAFT!\nbtw that means you got Jack Black");
                System.exit(0);
                jasonMammoa = true;
            }
            System.out.println("\nSteve's hand is:\n"+mokuPalisaSuli.get(0)+"\n?");
            if(dennis(mokuPalisaSuli) == true){
                System.out.println("Chicken jockey. he had Jack Black btw");
                System.exit(0);
                jasonMammoa = true;
            }
            System.out.println("\n\nChicken jockey");

            char fixFix = 'h';
            while(chekcBust(kijetesantakalu) == true && chekcBust(mokuPalisaSuli) == true && fixFix == 'h' && jasonMammoa == false){

                System.out.println("\nWould you like to [h]it or [s]tick?");
                String firstTrialOfSpeed = scan.nextLine().toLowerCase();
                fixFix = firstTrialOfSpeed.charAt(0);

                if(fixFix == 'h'){
                    kijetesantakalu.add(embellish.squigglyBracket());
                    System.out.println("Your new hand is:");
                    for(int i = 0; i < kijetesantakalu.size(); i++){
                        System.out.println(kijetesantakalu.get(i));
                    }
                }

                else if(fixFix == 's'){
                    int total = 0;
                    for(int i = 0; i < kijetesantakalu.size(); i++){
                        total = total + kijetesantakalu.get(i).getValue();
                    }
                    if(whatsUpAce == false){
                        System.out.println("You have a total of "+total);
                    }
                    else{
                        total -= 10;
                        System.out.println("You have a total of "+total);
                    }

                }
                if(chekcBust(kijetesantakalu) == false){
                    System.out.println("you suck");
                    System.exit(0);
                }
            }
            System.out.println("\nThe dealer has:\n"+mokuPalisaSuli.get(0)+"\n"+mokuPalisaSuli.get(1));
            int dhTatol = mokuPalisaSuli.get(0).getValue()+mokuPalisaSuli.get(1).getValue();
            while(dhTatol <= 16){
                mokuPalisaSuli.add(embellish.squigglyBracket());
                System.out.println("\nThe dealer hit and now has:");
                for(int i = 0; i < mokuPalisaSuli.size(); i++){
                    System.out.println(mokuPalisaSuli.get(i));
                }
                dhTatol = 0;
                for(int i = 0; i < mokuPalisaSuli.size(); i++){
                    dhTatol += mokuPalisaSuli.get(i).getValue();
                }
            }
            int dTatol = 0;
            for(int i = 0; i < mokuPalisaSuli.size(); i++){
                dTatol = dTatol + mokuPalisaSuli.get(i).getValue();
            }
            System.out.println("\nThe dealer chose to stick and has a total of "+dTatol);
            if(chekcBust(mokuPalisaSuli) == false){
                System.out.println("\nThe dealer was not in fact Jack Black and is very bad so you win :)");
                System.exit(0);
            }
            theMines(kijetesantakalu, mokuPalisaSuli);
        }
    }
    public static boolean chekcBust(List<IAmSteve> hand){
        int tatol = 0;
        whatsUpAce = false;
        for(int i = 0; i < hand.size(); i++){
            tatol += hand.get(i).getValue();
        }
        IAmSteve ummgoogleitidk = new IAmSteve("None", 0);
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getValue() == 11){
                ummgoogleitidk = hand.get(i);
                whatsUpAce = true;
            }
        }
        if(tatol > 21 && whatsUpAce == true){
            ummgoogleitidk.setValue(14);
            tatol = 0;

            for(int i = 0; i < hand.size(); i++){
                tatol = tatol + hand.get(i).getValue();
            }
            if(tatol > 21){
                return false;
            }
            else{
                return true;
            }
        }
        else if(tatol > 21 && whatsUpAce == false){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean dennis(List<IAmSteve> hand){
        if(hand.get(0).getValue() + hand.get(1).getValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }
    public static void theMines(List<IAmSteve> phand, List<IAmSteve> dhand){
        int ptatol = 0;
        for(int i = 0; i < phand.size(); i++){
            ptatol = ptatol + phand.get(i).getValue();
        }
        int dtatol = 0;
        for(int i = 0; i < dhand.size(); i++){
            dtatol = dtatol + dhand.get(i).getValue();
        }
        if(ptatol > dtatol && ptatol <= 21){
            System.out.println("\nyou win. :)");
        }
        else if(ptatol > dtatol && ptatol > 21){
            System.out.println("uhh so basically, mathimatically, theomoretically, logistically, statistically, metaphorically speaking, you suck");
        }
        else if(ptatol < dtatol && dtatol <= 21){
            System.out.println("\nuhh so basically, mathimatically, theomoretically, logistically, statistically, metaphorically speaking, you suck");
        }
        else if(ptatol < dtatol && dtatol > 21){
            System.out.println("\nyou win :).");
        }
        else{
            System.out.println("\nYou tied so Steve wins. womp womp");
        }
    }
    

}