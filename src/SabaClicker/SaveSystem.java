package SabaClicker;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class SaveSystem{

    public static void saveGame(double sps, Saba[] allTheSabasGathered, Items[] allTheItemsGathered,
                                Location[] allTheLocationsGathered, HashMap<Accounts, Double> accounts,
                                int doubleClickChance, int clickPower, double critCost,
                                double twoXCost, double overdriveCost, double clickPowerCost) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("save.txt"))) {
            writer.println(sps);

            for (Saba s : allTheSabasGathered) {
                writer.println(s.getOwn());
            }

            for (Items i : allTheItemsGathered) {
                writer.println(i.getItemCount());
            }

            for (Location l : allTheLocationsGathered) {
                writer.println(l.getLocationOwn());
            }

            for (Map.Entry<Accounts, Double> entry : accounts.entrySet()) {
                writer.println(entry.getKey().getUsername() + "," + entry.getKey().getPassword() + "," + entry.getValue());
            }
            writer.println("END_ACCOUNTS");

            writer.println(doubleClickChance);
            writer.println(clickPower);
            writer.println(critCost);
            writer.println(twoXCost);
            writer.println(overdriveCost);
            writer.println(clickPowerCost);

            for (int i = 0; i < allTheItemsGathered.length; i++){
                writer.println(allTheItemsGathered[i].getItemCost());
            }

            System.out.println("Game Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void loadGame(){
        try(BufferedReader reader = new BufferedReader(new FileReader("save.txt"))){

            String line;

            AlfonsoClicker.sps = Double.parseDouble(reader.readLine());

            for(int i = 0; i < AlfonsoClicker.allTheSabasGathered.length; i++){
                AlfonsoClicker.allTheSabasGathered[i].setOwn(Boolean.parseBoolean(reader.readLine()));
            }

            for(int i = 0; i < AlfonsoClicker.allTheItemsGathered.length; i++){
                AlfonsoClicker.allTheItemsGathered[i].setItemCount(Integer.parseInt(reader.readLine()));
            }

            for(int i = 0; i < AlfonsoClicker.allTheLocationsGathered.length; i++){
                AlfonsoClicker.allTheLocationsGathered[i].setLocationOwn(Boolean.parseBoolean(reader.readLine()));
            }

            while (!(line = reader.readLine()).equals("END_ACCOUNTS")) {
                String[] parts = line.split(",");
                Window.accounts.put(new Accounts(parts[0], parts[1]), Double.parseDouble(parts[2]));
            }

            Window.doubleClickChance = Integer.parseInt(reader.readLine());
            Window.clickPower = Integer.parseInt(reader.readLine());
            Window.critCost = Double.parseDouble(reader.readLine());
            Window.twoXPowerCost = Double.parseDouble(reader.readLine());
            Window.overdriveCost = Double.parseDouble(reader.readLine());
            Window.powerCost = Double.parseDouble(reader.readLine());

            for(int i = 0; i < AlfonsoClicker.allTheItemsGathered.length; i++){
                AlfonsoClicker.allTheItemsGathered[i].setItemCost(Double.parseDouble(reader.readLine()));
            }

            System.out.println("Loaded sps: "+AlfonsoClicker.sps);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
