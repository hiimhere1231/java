import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int variable = 2;
        System.out.println(variable);
        System.out.println("Please ask a question");
        String xwhatever = scan.nextLine();
        System.out.println("Thank you. "+xwhatever);
        String q1answer = scan.nextLine();
        System.out.println("What is your favorite color?");
        String q2ans = scan.nextLine();
        System.out.println("Okey dokey. How old are you?");
        String q3ans = scan.nextLine();
        System.out.println("ok. What is 3/3*2+3-2(19-8*3)");
        int math = scan.nextInt();
        if(math != 15){
            System.out.println("ngl dude you got it wrong and you kinda re bad at math");
        }
        else{
            System.out.println("very smart :)");
        }
    }
}
