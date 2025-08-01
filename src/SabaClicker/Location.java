package SabaClicker;

public class Location {
    private double Costly; // how much an location; costs
    private double SPSly; // sps given by the location
    private String Namely; // name of the location
    private Boolean Own; // the amount of each location
    private String ability; // the ability of each location
    public Location(double Costly, double SPSly, String Namely, boolean Own, String ability){
        this.Costly = Costly;
        this.SPSly = SPSly;
        this.Namely = Namely;
        this.Own = Own;
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
    public Boolean getLocationOwn(){
        return Own;
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
    public void setLocationOwn(Boolean Own){
        this.Own = Own;
    }
    public void setLocationAbility(String ability){
        this.ability = ability;
    }

    public String toString(){
        return "this location has a cost of "+Costly+", an sps stat of "+SPSly+", and the name "+Namely+", you own this location: "+Own+" , this location has the ability "+ability;
    }
}

