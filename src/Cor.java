import java.util.Scanner;

public class Cor implements VehicularSubmarineswith4Doors{
    Scanner scan = new Scanner(System.in);
    private int wheels;
    private String color;
    private int doors;
    private boolean backseat;
    public Cor(int wheels, String color, int doors, boolean backseat){
        this.wheels = wheels;
        this.color = color;
        this.doors = doors;
        this.backseat = backseat;
    }
    public void start(){
        System.out.println("vroom vroom ruff ruff *barks in cor*");
    }
    public void sodapop(){
        scan.nextLine();
        System.out.println("POP. *cor talks in cor*");
    }
}
