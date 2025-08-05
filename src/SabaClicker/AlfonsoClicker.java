package SabaClicker;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlfonsoClicker implements  Runnable{



    public static Location eLocation;
    public static Saba eSaba;
    public static double sabucks = 10000;
    public static double getSabucks(){
        return sabucks;
    }
    public static void setSabucks(double sabuks){
        sabucks = sabuks;
    }
    static double sps = 0;
    //saba unlockes the ability to buy more/different sabas
    static String[] itemName = new String[]{"self serve machine", "chef", "john risman", "julian morello", "osbourne hoilett", "martin keanneally", "shawn carvajal", "cesar", "alfonso saba"};
    static int[] itemCost = new int[]{4, 12, 1000, 20000, 50000, 100000, 300000, 1000000, 10000000};
    static int[] itemCount = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    static double[] itemSPS = new double[]{0.1, 0.4, 1.3, 6, 15, 30, 45, 75, itemCount[0]};
    static Items[] allTheItemsGathered = new Items[itemName.length];
    // locations
    //can only have one at a time
    static String[] locationName = new String[]{"dining hall", "sawbucks", "hub", "snackstops", "bank of saba"};
    static int[] locationCost = new int[]{100000, 250000, 1000000, 100000, 1000000};
    static boolean[] locationOwn = new boolean[]{false, false, false, false, false};
    static double[] locationSPS = new double[]{110, 130, 150, 30, 0};
    static String[] locationAbility = new String[]{"makes items x% cheaper", "can attract female sabas (glorious photo of saba with wig and bow and pink hearts with pink border), unlocks marriage MUST BE UNLOCKED WITH HUB", "unlocks more locations", "holding 's' will provide x sabucks per 10 seconds MUST BE UNLOCKED WITH HUB", "passively gains 25% of sabas invested in bank every TBD minutes MUST BE UNLOCKED WITH HUB"};
    static Location[] allTheLocationsGathered = new Location[locationOwn.length];

    public static double multSabucksSubtractionItems(int itemPos, Items[] allTheItemsGathered, double sabucks){
        double newCost = Math.ceil(allTheItemsGathered[itemPos].getItemCost() * 1.1 * 10) / 10;
        allTheItemsGathered[itemPos].setItemCost(newCost);
        return allTheItemsGathered[itemPos].getItemCost();
    }
    public static int getSabaPos(Saba[] allTheSabasGathered, String purchase, int sabaPos){
        for(int i = 0; i < allTheSabasGathered.length-1; i++){
            String sabaPurchase = allTheSabasGathered[i].getName().toLowerCase();
            if(sabaPurchase.equals(purchase)){
                return sabaPos = i;
            }
        }
        return sabaPos = -1;
    }
    public static boolean buySaba(Saba[] allTheSabasGathered, int sabaPos){
        if(eLocation == allTheLocationsGathered[0]){
            if(sabucks >= allTheSabasGathered[sabaPos].getCost()*.95){
                if(allTheSabasGathered[sabaPos].getOwn()){
                    System.out.println("You already own this Saba!");
                    return false;
                }
                else{
                    allTheSabasGathered[sabaPos].setOwn(true);
                    sabucks -= allTheSabasGathered[sabaPos].getCost();
                    return true;
                }
            }
            else{
                System.out.println("take a look at ur money, ur broke");
                return false;
            }
        }
        if(sabucks >= allTheSabasGathered[sabaPos].getCost()){
            if(allTheSabasGathered[sabaPos].getOwn()){
                System.out.println("You already own this Saba!");
                return false;
            }
            else{
                allTheSabasGathered[sabaPos].setOwn(true);
                sabucks -= allTheSabasGathered[sabaPos].getCost();
                return true;
            }
        }
        else{
            System.out.println(sabucks);
            System.out.println(allTheSabasGathered[sabaPos].getCost());
            System.out.println("take a look at ur money, ur broke aiaiaia");
            return false;
        }
    }
    public static boolean buyItem(Items[] allTheItemsGathered, int itemPos){
        if(eLocation == allTheLocationsGathered[0]){
            if(sabucks >= allTheItemsGathered[itemPos].getItemCost()*.95){
            int itemCounted = allTheItemsGathered[itemPos].getItemCount();
            allTheItemsGathered[itemPos].setItemCount(itemCounted += 1);
            sabucks -= allTheItemsGathered[itemPos].getItemCost();
            multSabucksSubtractionItems(itemPos, allTheItemsGathered, itemCounted);
            return true;
        }
        else{
            System.out.println("take a look at ur money, ur broke");
            return false;
        }
        }
        if(sabucks >= allTheItemsGathered[itemPos].getItemCost()){
            int itemCounted = allTheItemsGathered[itemPos].getItemCount();
            allTheItemsGathered[itemPos].setItemCount(itemCounted += 1);
            sabucks -= allTheItemsGathered[itemPos].getItemCost();
            multSabucksSubtractionItems(itemPos, allTheItemsGathered, itemCounted);
            return true;
        }
        else{
            System.out.println("take a look at ur money, ur broke");
            return false;
        }
    }
    public static boolean buyLocation(Location[] allTheLocationsGathered, int locationPos){
        if(eLocation == allTheLocationsGathered[0]){
            if(sabucks >= allTheLocationsGathered[locationPos].getLocationCost()*.95){
            if(allTheLocationsGathered[locationPos].getLocationOwn() == false){
                allTheLocationsGathered[locationPos].setLocationOwn(true);
                sabucks -= allTheLocationsGathered[locationPos].getLocationCost();
                return true;
            }
            return false;
        }
        else{
            System.out.println("take a look at ur money, ur broke");
            return false;
        }
        }
        if(sabucks >= allTheLocationsGathered[locationPos].getLocationCost()){
            if(allTheLocationsGathered[locationPos].getLocationOwn() == false){
                allTheLocationsGathered[locationPos].setLocationOwn(true);
                sabucks -= allTheLocationsGathered[locationPos].getLocationCost();
                return true;
            }
            return false;
        }
        else{
            System.out.println("take a look at ur money, ur broke");
            return false;
        }
    }
    public static void fillSabaList(){
        for(int i = 0; i < sabaOwns.length; i++){
            allTheSabasGathered[i] = new Saba (sabaCost[i], sabaSPSstat[i], nameOfSaba[i], sabaOwns[i]);
        }
    }
    public static void fillItemList(){
        for(int i = 0; i < itemCount.length; i++){
            allTheItemsGathered[i] = new Items (itemCost[i], itemSPS[i], itemName[i], itemCount[i]);
        }
    }
    public static void fillLocationList(){
        for(int i = 0; i < locationOwn.length; i++){
            allTheLocationsGathered[i] = new Location (locationCost[i], locationSPS[i], locationName[i], locationOwn[i], locationAbility[i]);
        }
    }

    public void run(){

    }
    static String[] nameOfSaba = new String[]{"saba", "green saba", "incredibly demure saba", "evil saba", "business saba", "Shop Keeper Saba", "rich saba", "bank saba", "pokemon trainer saba", "alien saba", "oompa loompa saba", "investor saba", "lucky saba", "non-political presidential saba", "old saba", "balatro saba",  "high contrast saba"}; // hc saba kills all sabas + new sabas with him in hand are negative but perm 10% cheaper while in hand plus 10% sps increase | balatro saba gives mult | shop keeper saba unlocks items beyond self serve machine and chefs
    static boolean[] sabaOwns = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    static double[] sabaCost = new double[]{10000, 12500, 22222, 66666, 211212, 500000, 777777, 2000000, 75000000, 100000000, 231514111, 300000000, 777777777, 1000000000, 2000000000, 2147483647, -1};
    static double[] sabaSPSstat = new double[]{60, 65, 75, 80, 212, 100 ,350, 1000, 75000, 85000, 100000, 100000, 777777, 1000000, 1960, 0, -1};
    static Saba[] allTheSabasGathered = new Saba[nameOfSaba.length];
    static Saba[] hand = new Saba[3];
    public static double getSPStotal(){
        int sabaSPStatol = 0;
        for(int i = 0; i < hand.length; i++){
            if(hand[0] == null){
                continue;
            }
            else{
                sabaSPStatol += hand[i].getSPS();
            }
        }
        double locSPS;
        if(eLocation != null){
            locSPS = eLocation.getLocationSPS();
        }
        else{
            locSPS = 0;
        }
        sps = allTheItemsGathered[0].getItemCount()*0.1 + allTheItemsGathered[1].getItemCount()*0.4 + allTheItemsGathered[2].getItemCount()*1.3 + allTheItemsGathered[3].getItemCount()*6 + allTheItemsGathered[4].getItemCount()*15 + allTheItemsGathered[5].getItemCount()*30 + allTheItemsGathered[6].getItemCount()*45 + allTheItemsGathered[7].getItemCount()*75 + allTheItemsGathered[8].getItemCount()*allTheItemsGathered[0].getItemCount() + sabaSPStatol + locSPS;
        return sps;
    }
    
    
    public static void main(String[] args) {
        
        

        







        // sabas

        
        
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println(sabucks);
            int sabaPos = -1;
            System.out.println("what would you like to buy");
            String purchase = scan.nextLine().toLowerCase();
            if(purchase.equals("")){
                continue;
            }
            else if(purchase.equals("chef")){
                sabucks -= 12;
                int itemOfTheCount = allTheItemsGathered[1].getItemCount();
                allTheItemsGathered[1].setItemCount(itemOfTheCount += 1);
                System.out.println("You've acquired a chef");
            }
            else if(purchase.equals("self serve machine")){
                System.out.println("Youve acquired a slef serve machine");
                sabucks -= 12;
                int itemOfTheCount = allTheItemsGathered[0].getItemCount();
                allTheItemsGathered[0].setItemCount(itemOfTheCount += 1);
            }
            else{
                sabaPos = getSabaPos(allTheSabasGathered, purchase, sabaPos);
                buySaba(allTheSabasGathered, sabaPos);
            }
            scan.close();
        }
    }
}
