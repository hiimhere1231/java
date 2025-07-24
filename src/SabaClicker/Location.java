package SabaClicker;

public class Location {
    private double Costly; // how much an location; costs
    private double SPSly; // sps given by the location
    private String Namely; // name of the location
    private int Countly; // the amount of each location
    private String ability; // the ability of each location
    public Location(double Costly, double SPSly, String Namely, int Countly, String ability){
        this.Costly = Costly;
        this.SPSly = SPSly;
        this.Namely = Namely;
        this.Countly = Countly;
        this.ability = ability;
    }
    public double getLocationSPS(){
        return SPSly;
    }
    public double getLocationCost(){
        return Costly;
    }
    public String getLocationName(){
        return Namely;
    }
    public int getLocationCount(){
        return Countly;
    }
    public String getLocationAbility(){
        return ability;
    }

    public void setLocationSPS(double SPSly){
        this.SPSly = SPSly;
    }
    public void setLocationCost(double Costly){
        this.Costly = Costly;
    }
    public void setLocationName(String Namely){
        this.Namely = Namely;
    }
    public void setLocationCount(int Countly){
        this.Countly = Countly;
    }
    public void setLocationAbility(String ability){
        this.ability = ability;
    }

    public String toString(){
        return "this location has a cost of "+Costly+", an sps stat of "+SPSly+", and the name "+Namely+", you have "+Countly+" of these locations, this location has the ability "+ability;
    }
}

