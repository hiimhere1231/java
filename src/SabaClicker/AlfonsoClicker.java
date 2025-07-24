package SabaClicker;
import java.lang.Thread;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlfonsoClicker implements  Runnable{


    static double sabucks = 12;
    static double sps = 0;
    //saba unlockes the ability to buy more/different sabas
    static String[] itemName = new String[]{"self serve machine", "chef", "john risman", "julian morello", "osbourne hoilett", "martin keanneally", "shawn carvajal", "cesar", "alfonso saba"};
    static int[] itemCost = new int[]{4, 12, 1000, 20000, 50000, 100000, 300000, 1000000, 10000000};
    static int[] itemCount = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    static double[] itemSPS = new double[]{0.1, 0.4, 1.3, 6, 15, 30, 45, 75, itemCount[0]};
    static Items[] allTheItemsGathered = new Items[itemName.length];
    // locations
    static String[] locationName = new String[]{"dining hall", "sawbucks", "hub", "snackstops", "bank of saba"};
    static int[] locationCost = new int[]{100000, 250000, 1000000, 100000, 1000000};
    static int[] locationCount = new int[]{0, 0, 0, 0, 0};
    static double[] locationSPS = new double[]{110, 130, 150, 30, 0};
    static String[] locationAbility = new String[]{"makes items x% cheaper", "can attract female sabas (glorious photo of saba with wig and bow and pink hearts with pink border), unlocks marriage MUST BE UNLOCKED WITH HUB", "unlocks more locations", "holding 's' will provide x sabucks per 10 seconds MUST BE UNLOCKED WITH HUB", "passively gains 25% of sabas invested in bank every TBD minutes MUST BE UNLOCKED WITH HUB"};
    static Location[] allTheLocationsGathered = new Location[locationCount.length];

    public static double multSabucksSubtractionItems(int itemPos, Items[] allTheItemsGathered, double sabucks){
        double newCost = allTheItemsGathered[itemPos].getItemCost() * 1.1;
        allTheItemsGathered[itemPos].setItemCost(newCost);
        return allTheItemsGathered[itemPos].getItemCost();
    }
    public static double multSabucksSubtractionLocation(int locationPos, Location[] allTheLocationsGathered, double sabucks){
        double newCost = allTheLocationsGathered[locationPos].getLocationCost() * 1.1;
        allTheLocationsGathered[locationPos].setLocationCost(newCost);
        return allTheLocationsGathered[locationPos].getLocationCost();
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
    public static void buyItem(Items[] allTheItemsGathered, int itemPos){
        int itemCounted = allTheItemsGathered[itemPos].getItemCount();
        allTheItemsGathered[itemPos].setItemCount(itemCounted += 1);
        multSabucksSubtractionItems(itemPos, allTheItemsGathered, itemCounted);
    }
    public static void buyLocation(Location[] allTheLocationsGathered, int locationPos){
        int locationCounted = allTheLocationsGathered[locationPos].getLocationCount();
        allTheLocationsGathered[locationPos].setLocationCount(locationCounted += 1);
        multSabucksSubtractionLocation(locationPos, allTheLocationsGathered, locationCounted);
    }

    public void run(){

    }
    public static double getSPStotal(){
        sps = allTheItemsGathered[0].getItemCount()*0.1 + allTheItemsGathered[1].getItemCount()*0.4 + allTheItemsGathered[2].getItemCount()*1.3 + allTheItemsGathered[3].getItemCount()*6 + allTheItemsGathered[4].getItemCount()*15 + allTheItemsGathered[5].getItemCount()*30 + allTheItemsGathered[6].getItemCount()*45 + allTheItemsGathered[7].getItemCount()*75 + allTheItemsGathered[8].getItemCount()*allTheItemsGathered[0].getItemCount() + allTheLocationsGathered[0].getLocationCount()*110 + allTheLocationsGathered[1].getLocationCount()*130 + allTheLocationsGathered[2].getLocationCount()*150 + allTheLocationsGathered[3].getLocationCount()*30;
        return sps;
    }
    public static void main(String[] args) {
        

        Runnable idling = ()->{
            while(true){
                sabucks += getSPStotal();
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                };
            }
        };
        
        Thread t1 = new Thread(idling);
        t1.start();







        // sabas

        String[] nameOfSaba = new String[]{"saba", "green saba", "incredibly demure saba", "evil saba", "business saba", "rich saba", "bank saba", "pokemon trainer saba", "alien saba", "oompa loompa saba", "investor saba", "lucky saba", "non-political presidential saba", "old saba", "balatro saba",  "high contrast saba"}; // hc saba kills all sabas + new sabas with him in hand are negative but perm 10% cheaper while in hand plus 10% sps increase
        boolean[] sabaOwns = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        double[] sabaCost = new double[]{10000, 12500, 22222, 66666, 211212, 777777, 2000000, 75000000, 100000000, 231514111, 300000000, 777777777, 1000000000, 2000000000, 2147483647, -1};
        double[] sabaSPSstat = new double[]{60, 65, 75, 80, 212, 350, 1000, 75000, 85000, 100000, 100000, 777777, 1000000, 1960, 0, -1};
        Saba[] allTheSabasGathered = new Saba[nameOfSaba.length];
        for(int i = 0; i < sabaOwns.length; i++){
            allTheSabasGathered[i] = new Saba (sabaCost[i], sabaSPSstat[i], nameOfSaba[i], sabaOwns[i]);
        }
        for(int i = 0; i < itemCount.length; i++){
            allTheItemsGathered[i] = new Items (itemCost[i], itemSPS[i], itemName[i], itemCount[i]);
        }
        for(int i = 0; i < locationCount.length; i++){
            allTheLocationsGathered[i] = new Location (locationCost[i], locationSPS[i], locationName[i], locationCount[i], locationAbility[i]);
        }
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println(sabucks);
            int sabaPos = -1;
            System.out.println("what would you like to buy");
            String purchase = scan.nextLine().toLowerCase();
            if(purchase.equals("chef")){
                sabucks -= 12;
                int itemOfTheCount = allTheItemsGathered[1].getItemCount();
                allTheItemsGathered[1].setItemCount(itemOfTheCount += 1);
                System.out.println(allTheItemsGathered[1].getItemCount());
                System.out.println("You've acquired a chef");
            }
            else if(purchase.equals("self serve machine")){
                System.out.println("Youve acquired a slef serve machine");
                sabucks -= 12;
                itemCount[0] += 1;
            }
            else{
                sabaPos = getSabaPos(allTheSabasGathered, purchase, sabaPos);
                if(sabaPos != -1){   
                    if (allTheSabasGathered[sabaPos].getOwn() == false){
                        allTheSabasGathered[sabaPos].setOwn(true);
                        sabucks -= allTheSabasGathered[sabaPos].getCost();
                    }
                    else{
                        System.out.println("You already own this saba.");
                    }
                }
            }
        }
    }
}
