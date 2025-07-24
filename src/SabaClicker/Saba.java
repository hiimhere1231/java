package SabaClicker;

public class Saba {
    private double sabaCostly; // how much a saba costs
    private double sabaSPS; // sps given by the saba
    private String sabaName; // name of the saba
    public Saba(double sabaCostly, double sabaSPS, String sabaName){
        this.sabaCostly = sabaCostly;
        this.sabaSPS = sabaSPS;
        this.sabaName = sabaName;
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

    public void setSPS(double sabaSPS){
        this.sabaSPS = sabaSPS;
    }
    public void setCost(double sabaCostly){
        this.sabaCostly = sabaCostly;
    }
    public void setName(String sabaName){
        this.sabaName = sabaName;
    }

    public String toString(){
        return "this saba has a cost of "+sabaCostly+", an sps stat of "+sabaSPS+", and the name "+sabaName;
    }
}
