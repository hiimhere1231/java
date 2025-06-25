import java.util.Scanner;
import java.util.Random;

public class Binaryhasnumbersandsearches { 
    public static int searcer(int[] list, int target){
        return chekc(target, list, 0, list.length);
    }
    public static int chekc(int numbel, int[] numbersBIg, int start, int end){
        if(end < start){
            return -1;
        }
        int midlle = ((end-start)/2)+start;
        if(numbersBIg[midlle] == numbel){
            return midlle;
        }
        else if(numbersBIg[midlle] > numbel){
            return chekc(numbel, numbersBIg, 0, midlle-1);
        }
        else if(numbersBIg[midlle] < numbel){
            return chekc(numbel, numbersBIg, midlle+1, end);
        }
        return -2;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] numbersBIg = new int[7];
        Random rand = new Random();
        for(int i = 0; i < numbersBIg.length; i++){
            numbersBIg[i] = rand.nextInt(100);
        }
        BungalowsOrT.usefulshorts(numbersBIg);
        System.out.println("What number would you like to find?");
        int numbel = scan.nextInt();
        int answer = searcer(numbersBIg, numbel)+1;
        if(answer > -1){
            System.out.println("The number "+numbel+" has been found at position "+answer+".");
        }
        else{
            System.out.println("Not in list.");
        }
        }
}
