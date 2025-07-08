import java.util.Scanner;
public class Loopthing {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a size (be nice)");
        int fat = scan.nextInt();

        for(int i = 0 ; i < fat+1; i++){
            for(int j = 0 ; j < fat-i; j++){
                System.out.print(" ");
            }
            for(int t = 0 ; t < i; t++){
                System.out.print("* ");
            }
        System.out.println("");
        }
    }
}
