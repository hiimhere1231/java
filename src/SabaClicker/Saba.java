package SabaClicker;

public class Saba {
    private double sabaCostly; // how much a saba costs
    private double sabaSPS; // sps given by the saba
    private String sabaName; // name of the saba
    private boolean owns;
    public Saba(double sabaCostly, double sabaSPS, String sabaName, boolean owns){
        this.sabaCostly = sabaCostly;
        this.sabaSPS = sabaSPS;
        this.sabaName = sabaName;
        this.owns = owns;
    }
    public double getSPS(){
        return sabaSPS;
    }
    public double getCost(){
        return sabaCostly;
    }
    public String getName(){
        return sabaName;
    }
    public Boolean getOwn(){
        return owns;
    }

    public void setSPS(double sabaSPS){
        this.sabaSPS = sabaSPS;
    }
    public void setCost(double sabaCostly){
        this.sabaCostly = sabaCostly;
    }
    public void setName(String sabaName){
        this.sabaName = sabaName;
    }
    public void setOwn(boolean owns){
        this.owns = owns;
    }

    public String toString(){
        return "this saba has a cost of "+sabaCostly+", an sps stat of "+sabaSPS+", and the name "+sabaName+", you own this: "+owns;
    }
}
