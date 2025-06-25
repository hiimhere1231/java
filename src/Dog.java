public class Dog {
    private String color;
    private String name;
    private String breed;
    private int age;
    static int numberDogs=0;
    public Dog(String color, String name, String breed, int age){
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.age = age;
        numberDogs++;
    }
    public Dog(){
        numberDogs++;
        this.color = "red";
    }
}
