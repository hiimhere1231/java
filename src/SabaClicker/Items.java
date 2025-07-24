package SabaClicker;

public class Items {
    private double Costly; // how much an item costs
    private double SPSly; // sps given by the item
    private String Namely; // name of the item
    private int Countly; // the amount of each item
    public Items(double Costly, double SPSly, String Namely, int Countly){
        this.Costly = Costly;
        this.SPSly = SPSly;
        this.Namely = Namely;
        this.Countly = Countly;
    }
    public double getItemSPS(){
        return SPSly;
    }
    public double getItemCost(){
        return Costly;
    }
    public String getItemName(){
        return Namely;
    }
    public int getItemCount(){
        return Countly;
    }

    public void setItemSPS(double SPSly){
        this.SPSly = SPSly;
    }
    public void setItemCost(double Costly){
        this.Costly = Costly;
    }
    public void setItemName(String Namely){
        this.Namely = Namely;
    }
    public void setItemCount(int Countly){
        this.Countly = Countly;
    }

    public String toString(){
        return "this item has a cost of "+Costly+", an sps stat of "+SPSly+", and the name "+Namely+", you have "+Countly+" of these items";
    }
}