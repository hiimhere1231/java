public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Ruby", "Sparky", "Cavalier", 6);
        System.out.println(dog1.numberDogs);
        Dog dog2 = new Dog();
        System.out.println(dog2.numberDogs);
        Dog dog3 = new Terrior();
        System.out.println(Dog.numberDogs);
        Cor sedan = new Sed(4, "red", 4);
    }
}
